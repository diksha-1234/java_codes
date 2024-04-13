/*
 Program to replace all 0's with 1 in a given integer. Given an 
integer as an input,all the 0's in the number has to be replaced 
with 1. For example, consider the following number Input: 
102405 Output: 112415 
Input: 56004 
Output: 56114 
Steps to replace all 0's with 1 in a given integer 
• Input the integer from the user. 
• Traverse the integer digit by digit. 
• If a '0' is encountered, replace it by '1'. 
• Print the integer. 
 */
import java.util.Scanner;
public class Replace {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter any number");
        int num=sc.nextInt();
        int dup=num,rem,n=0,mul=1;
        while(dup!=0)
        {
           rem=dup%10;
           if(rem==0)
           {
            rem=1;
           } 
            n+=rem*mul;
            dup=dup/10;
            mul=mul*10;
        }
        System.out.println("modified number "+n);
        }
}
