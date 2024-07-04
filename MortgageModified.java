import java.text.NumberFormat;
import java.util.Scanner;

public class MortgageModified {
    public static void main(String[]args)
    {
        int principal;
        float annualRate;
        byte period;
        Scanner scanner=new Scanner(System.in);
        while(true){
            System.out.println("Principal($1K-$1M):");
             principal=scanner.nextInt();
            if(principal>=1000 &&principal<=1000000){
            break;
            }
            System.out.println("enter number between 1,000 and 1,000,000");
        }
        while(true){
            System.out.println("Annual Interest Rate:");
            annualRate=scanner.nextFloat();
            if(annualRate>0&&annualRate<=30){
            break;
            }
            System.out.println("enter a value greater than 0and less than or equal to 30");

        }
        float monthlyRate=annualRate/12/100;
        while(true){
            System.out.println("Period(Years):");
            period=scanner.nextByte();
            if(period>1&&period<=30){
                break;
            }
            System.out.println("enter a value between 1 and 30");

        }
        int noOfPayments=period*12;
        double mortgage=principal*Math.pow(1+monthlyRate,noOfPayments)/(Math.pow(1+monthlyRate,noOfPayments)-1);
        String modified_Mortgage=NumberFormat.getCurrencyInstance().format(mortgage);
        System.out.println(modified_Mortgage);

        scanner.close();
    }
}
