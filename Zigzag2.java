import java.util.*;
public class Zigzag2 {

    public static void main(String []ar){
        Scanner sc=new Scanner(System.in);

        int arr[]=new int[7];
        for(int i=0;i<7;i++)
        {
          arr[i]=sc.nextInt();
        }
        for(int i=0;i<6;i+=2){
         if(arr[i]>arr[i+1])
         {
           int t=arr[i];
           arr[i]=arr[i+1];
           arr[i+1]=t;
         }
         if(arr[i+1]<arr[i+2])
         {
           int t=arr[i+1];
           arr[i+1]=arr[i+2];
           arr[i+2]=t;
         }
        }
        for(int i=0;i<7;i++)
        {
            System.out.println(arr[i]);
        }
    }
}
