public class Mathclass {
    public static void main(String[] diksha)
    {
        // round method,,simple math rule of rounding off
        int result =Math.round(1.1f);//returns int if float,long if double.
        long res=Math.round(45.8);
        System.out.println(result);
        System.out.println(res);

        //ceil method,,returns the smallest integer greater or equal to
       int resu=(int)Math.ceil(12.1);
       System.out.println(resu);
       /*ceil method always return double
       so simply cast it into desired type
        */

        //floor method,,
         int con=(int)Math.floor(1.4);//returns always double
         int conc=(int)Math.floor(1.8);
         System.out.println(con);
         System.out.println(conc);

         //random method,,,creates random floating point numbers between 0 and 1
         double concl=Math.random();// alaways returns double
        double conclu=Math.random()*100;//between 0 and 100
        int conclus=(int)Math.round(Math.random()*100);// by default round return long when double
        int conclusi=(int)Math.random()*100;
        int conclusion=(int)(Math.random()*100);
        System.out.println(concl);
        System.out.println(conclu);
        System.out.println(conclus);
        System.out.println(conclusi);
        System.out.println(conclusion);


        
    } 
}
