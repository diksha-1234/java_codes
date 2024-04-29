
  
   public class B{
        public static void main(String args[])
        {
            A obj=new A();
            System.out.println(obj.k);
            obj.msg();
    
    
    
        }
    }
 class A{
        protected int k=78;
        void msg(){
            System.out.println("hello"+k);
        }
    }

