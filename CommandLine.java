/*Write a java program to take input as a command line argument.Your name,course,University,roll no,and semester.
Display the information.*/
public class CommandLine {
    public static void main(String[] args) {
        for(int i=0;i<args.length;i++)
        {
            System.out.println(args[i]);
        }
    }
}
/*Run on command prompt
PS C:\Users\diya0\onedrive\desktop\GitFolder\java_codes> javac CommandLine.java
PS C:\Users\diya0\onedrive\desktop\GitFolder\java_codes> java CommandLine Diksha Btech 253645 4
Diksha
Btech
253645
4
 */