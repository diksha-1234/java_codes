/*Write a java program to print natural numbers upto 10
(i)in horizontal form
(ii)in vertical form
by using for loop:
eg.
1 2 3 4 ...
1
2
3..
*/
public class Natural {
    public static void main(String[] args) {
        for(int i=1;i<=10;i++)
        {
            System.out.print(i+" ");
        }
        System.out.println();
        for(int i=1;i<=10;i++)
        {
            System.out.println(i);
        }
    }
}
