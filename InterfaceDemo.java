/*Q29.Write a java program to create an interface that consists of a method to display
volume () as an abstract method and redefine this method in the derived 2
classes to suit their requirements.
Create classes called Cone, Hemisphere and Cylinder that implements the
interface. Using these three classes, design a program that will accept
dimensions of a cone, cylinder and hemisphere interactively and display the
volumes.
Volume of cone = (1/3)πr2h Volume of hemisphere = (2/3)πr3Volume of
cylinder = πr2h
*/


import java.util.*;
interface MyVolume{
    public void volume();
}
class Cone implements MyVolume{
    double r,h;
    public void setDim(double r,double h){
        this.r=r;
        this.h=h;
    }
    public void volume(){
        System.out.println("Volume of Cone"+" "+ 1/3.0*Math.PI*r*r*h);
    }
}
class Hemisphere implements MyVolume{
      double r;
    public void setDim(double r){
        this.r=r;
    }
    public void volume(){
        System.out.println("Volume of Hemisphere"+" "+ 2/3.0*Math.PI*r*r*r);
    }
}
class Cylinder implements MyVolume{
      double r,h;
    public void setDim(double r,double h){
        this.r=r;
        this.h=h;
    }
    public void volume(){
        System.out.println("Volume of Cylinder"+" "+ Math.PI*r*r*h);
    }
}
public class InterfaceDemo{
    public static void main(String []arg){
        Scanner sc=new Scanner(System.in);
        Cone c=new Cone();
        Cylinder cl=new Cylinder();
        Hemisphere h=new Hemisphere();
        System.out.println("enter the radius and height of cone");
        double rcone=sc.nextDouble();
        double hcone=sc.nextDouble();
        c.setDim(rcone,hcone);
        System.out.println("enter the radius of hemisphere");
        double rhemis=sc.nextDouble();
        h.setDim(rhemis);
        System.out.println("enter the radius and height of cylinder");
        double rcy=sc.nextDouble();
        double hcy=sc.nextDouble();
        cl.setDim(rcy,hcy);
        c.volume();
        cl.volume();
        h.volume();
    }
}