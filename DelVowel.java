//Write a java program to delete vowels using StringBuffer class.
import java.util.Scanner;
public class DelVowel {
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter any string");
      StringBuffer sb=new StringBuffer(sc.nextLine());
      delVowel(sb); 
    }
    public static void delVowel(StringBuffer sb){
        for(int i=0;i<sb.length();i++)
        {
            char ch=sb.charAt(i);
            if(isVowel(ch)){
                sb.deleteCharAt(i);
                i--;
            }
        }
        System.out.println(sb);
        System.out.println(sb.toString());//to show content as string.
    
    }
    public static boolean isVowel(char ch){
        return "aeiouAEIOU".indexOf(ch)!=-1;
    }
}
