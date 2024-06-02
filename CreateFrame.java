import javax.swing.*;
//method 1 by creating object
/*public class CreateFrame {
    public static void main(String[] args) {
        JFrame s=new JFrame("Swing");
        s.setSize(500,200);
        s.setVisible(true);
        s.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}*/

//method 2 by using inheritance
/*public class CreateFrame extends JFrame{
    CreateFrame(){
        setSize(300,200);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public static void main(String[] args) {
        new CreateFrame();
    }
}*/
//method 3 by using edt(event dispatching thread)
public class CreateFrame extends JFrame{
    CreateFrame(){
        setSize(300,200);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public static void main(String[] args) {
        SwingUtilities.invokeLater(
            new Runnable(){
                public void run(){
                    new CreateFrame();
                }
            });
        }
}