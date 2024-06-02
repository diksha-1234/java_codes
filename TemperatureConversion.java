import java.util.*;
abstract class TemperatureData{
    double temp;
    public void setTempData(double t){
        temp=t;
    }
    abstract public void changeTemp();
}
class Fahrenheit extends TemperatureData{
    double ctemp;
    public void changeTemp(){
        ctemp=(5/9.0)*(temp-32);
    }
    public void display(){
        System.out.println("fahrenheit----->celsius"+ctemp);
    }
}
class Celsius extends TemperatureData{
    double ftemp;
    public void changeTemp(){
        ftemp=9/5.0*temp+32;
    }
    public void display(){
        System.out.println("celsius------>fahrenheit"+ftemp);
    }
}
public class TemperatureConversion{
    public static void main(String []arg){
        Scanner sc=new Scanner(System.in);
        Fahrenheit f=new Fahrenheit();
        System.out.println("enter the temperature in fahrenheit");
        double fah=sc.nextDouble();
        f.setTempData(fah);
        Celsius c=new Celsius();
        System.out.println("enter the temperature in celsius");
        double cel=sc.nextDouble();
        c.setTempData(cel);
        System.out.println("conversion");
        f.changeTemp();
        c.changeTemp();
        f.display();
        c.display();
    }
}