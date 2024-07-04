/*Q29.Write a java program to implement abstract class and abstract method with
following details:
Create a abstract Base Class TemperatureData members:
double temp;
Method members:
void setTempData(double) abstact void changeTemp()
Sub Class Fahrenheit (subclass of Temperature) Data members:
double ctemp;
method member:
Override abstract method changeTemp() to convert Fahrenheit temperature into
degree Celsius by using formula C=5/9*(F-32) and display converted
temperature
Sub Class Celsius (subclass of Temperature)
Data member:
double ftemp;
Method member:
Override abstract method changeTemp() to convert degree Celsius into
Fahrenheit temperature by using formula F=9/5*c+32 and display converted
temperature
*/


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

        sc.close();
    }
}