public class Delvowels {
    public static void main(String []ar)
    {
        StringBuilder sb=new StringBuilder("diksha");
        StringBuilder sb1=new StringBuilder("");
    
        for(int i=0;i<sb.length();i++)
        {
            if(sb.charAt(i)!='a'&&sb.charAt(i)!='e'&&sb.charAt(i)!='i'&&sb.charAt(i)!='o'&&sb.charAt(i)!='u')
            {
                char ch=sb.charAt(i);
                sb1.append(ch);
            }
        }
        System.out.println(sb1);
    }
}
