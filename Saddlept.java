/*
 Program to find the saddle point coordinates in a given 
matrix. A saddle pointis an element of the matrix, which is 
the minimum element in its row and the 
maximum in its column. 
For example, consider the matrix given 
below Mat [3][3]
1 2 3 
4 5 6 
7 8 9 
Here, 7 is the saddle point because it is the minimum element in 
its row andmaximum element in its column. 
Steps to find the saddle point coordinates in a given matrix. 
1. Input the matrix from the user. 
2. Use two loops, one for traversing the row and 
the other fortraversing the column. 
3. If the current element is the minimum element in 
its row andmaximum element in its column, then 
return its coordinates. 
Else, continue traversing. 
 */
import java.util.Scanner;
public class Saddlept {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter row size");
        int row=sc.nextInt();
        System.out.println("enter column size");
        int col=sc.nextInt();
        int arr[][]=new int[row][col];
        int flag=0;
        System.out.println("enter integers");
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                arr[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<arr.length;i++)
        {
            int minRow=arr[i][0],min=0;
            for(int j=1;j<arr[i].length;j++)
            {
                if(arr[i][j]<minRow)
                {
                    minRow=arr[i][j];
                    min=j;
                }
            }
            int maxCol=arr[0][min],max=0;
            for(int k=1;k<arr.length;k++)
            {
                if(arr[k][min]>maxCol)
                {
                    maxCol=arr[k][min];
                    max=k;
                }
            }
            if(i==max)
            {
                flag=1;
                System.out.println("Saddle point:("+max+","+min+")");
            }
        }
        if(flag==0)
        {
            System.out.println("No Saddle point");
        }
    }
}
