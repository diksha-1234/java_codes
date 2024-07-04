import java.util.Scanner;
class Replace2{
    public static void main(String []ar)
    {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        String s=Integer.toString(x);
        s=s.replaceAll("0","1");
        x=Integer.parseInt(s);
        System.out.println(x);

        sc.close();
    }
}