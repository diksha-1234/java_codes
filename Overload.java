/*Q27.Method overloading (Compile time Polymorphism):
Write a Java program to create a class called
ArrayDemo and overload arrayFunc() function.
void arrayFunc(int [], int) To find all pairs of elements in an
Array whose sum is equal to a givennumber :
Array numbers= [4, 6, 5, -10, 8, 5, 20], target=10
Output :
Pairs of elements whose sum is 10 are :4 + 6 = 10
5 + 5 = 10
-10 + 20 = 10
void arrayFunc(int A[], int p, int B[], int q) Giventwo sorted arrays A
and B of size p and q, Overload method arrayFunc() to merge elements of
A with B bymaintaining the sorted order i.e. fill A with first p smallest
elements and fill B with remaining elements.
Example:
Input :
2
int[] A = { 1, 5, 6, 7, 8, 10 }
int[] B = { 2, 4, 9 }
Output:
Sorted Arrays:
A: [1, 2, 4, 5, 6, 7]
B: [8, 9, 10]
(Use Compile time Polymorphism MethodOverloading)
*/


import java.util.*;
class arraydemo{
    public void arrayfun(int []ar,int key){
        for(int i=0;i<ar.length-1;i++){
          for(int j=i+1;j<ar.length;j++){
              if(ar[i]+ar[j]==key){
                  System.out.println(ar[i]+","+ar[j]);
              }
          }
        }
    }
    public void arrayfun(int ara[],int p,int arb[],int q){
        int n=ara.length;
        int m=arb.length;
        int r=n+m;
        int newar[]=new int[r];
        int i=0,j=0,k=0;
        while(i<n&&j<m){
        if(ara[i]<=arb[j]){
            newar[k++]=ara[i++];
        }
        else{
            newar[k++]=arb[j++];
        }
        }
        while(i<n){
            newar[k++]=ara[i++];
        }
        while(j<m){
            newar[k++]=arb[j++];
        }
        for( i=0;i<p;i++){
            ara[i]=newar[i];
            System.out.print(ara[i]+" ");
        }
        System.out.println();
        for(j=0;j<q;j++){
            arb[j]=newar[i++];
            System.out.print(arb[j]+" ");
        }
    }
}
public class Overload{
    public static void main(String []arg){
        Scanner sc=new Scanner(System.in);
        int arr[]=new int[7];
        int arr1[]=new int[6];
        int arr2[]=new int[3];
        System.out.println("INPUT1");
        for(int i=0;i<7;i++){
            arr[i]=sc.nextInt();
        }
        int key=sc.nextInt();
        System.out.println("INPUT2");
         for(int i=0;i<6;i++){
            arr1[i]=sc.nextInt();
        }
        for(int i=0;i<3;i++){
            arr2[i]=sc.nextInt();
        }
        int p=arr1.length;
        int q=arr2.length;
        arraydemo a=new arraydemo();
        System.out.println("DISPLAY1");
        a.arrayfun(arr,key);
        System.out.println("DISPLAY2");
        a.arrayfun(arr1,p,arr2,q);

        sc.close();
    }
}