class A{
    public void display(){
        System.out.println("a");
    }
}
class B extends A{
    public void display(){
        System.out.println("b");
    }
}
public class demo{
  
public static void main(String args[]){
    A c=new B();
    c.display();
    ((B) c).display();
    
}

    }
    
