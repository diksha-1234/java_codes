/*Using the switch statement,write a menu-driven program to calculate the maturity amount of a bank deposit.
The user is given the following options:
(i)Term Deposit
(ii)Recurring Deposit
For option (i)accept Principal(p),rate of interest(r)and time period in years(n).
Calculate and output the maturity amount
(a)receivable using the formula:p[1+r/100]^n.

For option (ii)accept monthly installment(p),rate of interest(r)and time period in months(n).
Calculate and output the maturity amount
(a)recievable using the formula a=p*n+p*n(n+1)/2*r/100*1/12.
For an incorrect option,an appropriate error message should be displayed.
[Use Scanner class to take input]
 */
import java.util.*;
import java.lang.Math;//default package
import java.lang.System;
public class Bank {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double p,r,n,A;
        System.out.println("M E N U");
        System.out.println("1.TERM DEPOSIT");
        System.out.println("2.RECURRING DEPOSIT");
        System.out.println("ENTER YOUR CHOICE");
        int ch=sc.nextInt();
        switch(ch)
        {
            case 1:
            System.out.println("Enter principal");
            p=sc.nextDouble();
            System.out.println("Enter rate of interest");
            r=sc.nextDouble();
            System.out.println("Enter time period in years");
            n=sc.nextDouble();
            System.out.println("Maturity Amount");
            A=p*Math.pow(1+r/100,n);
            System.out.println("AMOUNT:"+A);
            break;

            case 2:
            System.out.println("Enter principal");
            p=sc.nextDouble();
            System.out.println("Enter rate of interest");
            r=sc.nextDouble();
            System.out.println("Enter time period in months");
            n=sc.nextDouble();
            System.out.println("Maturity Amount");
            A=p*n+p+n+(n+1/2*r/100*1/12.0);
            System.out.println("AMOUNT:"+A);
            break;

             default:
             System.out.println("invalid choice");
        }

        sc.close();
    }
}
