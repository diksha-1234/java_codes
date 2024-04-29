
public class Casting {
    public static void main(String[]args)
    {
    //implicit casting
    int x=6,z=3;
    float y=x+z;
    System.out.println(y);

    // explicit casting
    float c=456.875f;
    int s=(int)c+6;
    System.out.println(c);
    System.out.println(s);

    // casting between incompatible types
    String number ="1234";
    float k=Float.parseFloat(number)+6;//same for integer,short,long,double
    System.out.println(k);


    }
}
