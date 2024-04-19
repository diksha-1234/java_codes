/*Program to find all the patterns of 0(1+)0 in the given string. Given a string
containing 0's and 1's, find the total number of 0(1+)0 patterns in the string
and output it.
0(1+)0 - There should be at least one '1' between the two 0's.
For example, consider the following string.
Input: 01101111010
Output: 3
Explanation: 01101111010 - count = 1
*/
import java.util.*;
class Pattern2{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int count=0;
        System.out.println("enter any string pattern containing 0's and 1's");
        String s=sc.next();
        for(int i=0;i<s.length()-1;)
        {
            if(s.charAt(i)=='0')
            {
                int j=i+1;
                while(j<s.length()&&s.charAt(j)!='0')
                {
                    j++;
                }
                if(j<s.length()&&j!=i+1)
                {
                    count++;
                }
                i=j;
            }
            else
            {
                i++;
            }
        }
        System.out.println("occurence of pattern in string"+count);

    }
}
