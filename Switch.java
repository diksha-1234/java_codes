/*Write a java program to demonstrate switch case statement:
Case1:"Hello"
Case2:"Hello World"
Case3:"Hi"
Case4:"Hi Guys"
default:"Bye"
*/
import java.util.Scanner;
public class Switch {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter any choice(1|2|3|4)");
        int ch=sc.nextInt();
        switch(ch)
        {
            case 1:
            System.out.println("Hello");
            break;
            case 2:
            System.out.println("Hello World");
            break;
            case 3:
            System.out.println("Hi");
            break;
            case 4:
            System.out.println("Hi Guys");
            break;
            default:
            System.out.println("Bye");
        }

        sc.close();
    }
}
