//Write a java program to print table of a number by taking input from user using do while loop.
import java.util.Scanner;
public class Table {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter any number");
        int num=sc.nextInt();
        System.out.println("Table:");
        int i=1;
        do
        {
            System.out.println(num+"*"+i+"="+num*i);
            i++;
        }while(i<=10);
    }
}
