/*Method overriding (Runtime Polymorphism), Abstract class and Abstract
method, Inheritance, interfaces:
Write a java program to calculate the area of a rectangle, a square and a circle.
Create an abstract class 'Shape' with three abstract methods namely
rectangleArea() taking two parameters, squareArea() and circleArea() taking
one parameter each.
Now create another class ‘Area’ containing all the three methods
rectangleArea(), squareArea() and circleArea() for printing the area of
rectangle, square and circle respectively. Create an object of class Area and call
all the three methods.
(Use Runtime Polymorphism)
*/


import java.util.*;
abstract class Shape
{ 
    abstract public void rectanglearea(int l,int b);
    abstract public void squarearea(int a);
    abstract public void circlearea(float r);
}
class Area extends Shape{
    public void rectanglearea(int l,int b){
        System.out.println("area of rectangle"+l*b);
    }
    public void squarearea(int a){
         System.out.println("area of square"+a*a);
    }
    public void circlearea(float r){
         System.out.println("area of circle"+Math.PI*r*r);
    }
}
public class AbstractDemo{
    public static void main(String []arg){
        Scanner sc =new Scanner(System.in);
         System.out.println("enter the length and width of rectangle");
         int length=sc.nextInt();
         int breadth=sc.nextInt();
         System.out.println("enter the side of  square ");
         int s=sc.nextInt();
          System.out.println("enter the radius of circle");
         float r=sc.nextFloat();
         
         Area a=new Area();
         a.rectanglearea(length,breadth);
         a.squarearea(s);
         a.circlearea(r);
    }
}