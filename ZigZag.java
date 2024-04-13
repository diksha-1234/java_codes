/*
 Printing an array into Zigzag fashion. Suppose you were given an 
array of integers, and you are told to sort the integers in a zigzag 
pattern. In general, ina zigzag pattern, the first integer is less than 
the second 
integer, which is greater than the third integer, which is less than 
the fourth integer, and so on. Hence, the converted array should 
be in the form of e1 < e2 
> e3 
< e4 
> e5 
< e6. 
Test 
cases: 
Input 
1:7 
4 3 7 8 6 2 1 
Output 1: 
3 7 4 8 2 6 1 
Input 2: 
4 
1 4 3 2 
Output 2: 1 4 2 3 
 */
import java.util.*;
public class ZigZag {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter size of an array");
        int n=sc.nextInt();
        int arr[]=new int[n];
        int temp;
        System.out.println("enter integers");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<n-1;i++)
        {
            if(i%2==0)
            {
                if(arr[i]>arr[i+1])
                {
                    temp=arr[i];
                    arr[i]=arr[i+1];
                    arr[i+1]=temp;
                }
            }
            else
            {
                if(arr[i]<arr[i+1])
                {
                    temp=arr[i];
                    arr[i]=arr[i+1];
                    arr[i+1]=temp;
                }
            }
        }
        System.out.println("ZIGZAG FASHION:");
        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}
