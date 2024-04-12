//Write a java program to add two numbers by taking input from user.
import java.util.Scanner;
public class Add1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter first number");
        int firstNumber=sc.nextInt();
        System.out.println("enter second number");
        int secondNumber=sc.nextInt();
        int result=firstNumber+secondNumber;
        System.out.println("Addition of "+firstNumber+" and "+secondNumber+":"+result);
    }
}
