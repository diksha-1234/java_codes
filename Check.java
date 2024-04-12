//Write a java program to check whether the given number is even or odd.
import java.util.*;
public class Check {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter any number");
        int num=sc.nextInt();
        if(num%2==0)
        System.out.println("Number is Even");
        else
        System.out.println("Number is Odd");
    }
}
