import javax.swing.*;
import java.awt.event.*;
/*public class AddButtonInFrame{
     AddButtonInFrame(){
        JFrame f=new JFrame();
        JButton b=new JButton("click me!");
        f.setTitle("Swing");
        f.setSize(200,200);
        b.setBounds(50,50,100,30);
        f.setLayout(null);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.add(b);
        b.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                b.setText("hi,clicked");
            }
        });
    }
    public static void main(String[] args) {
        new AddButtonInFrame();
    }
}*/
public class AddButtonInFrame implements ActionListener{
    JButton b;
    AddButtonInFrame(){
       JFrame f=new JFrame();
        b=new JButton("click me!");
       f.setTitle("Swing");
       f.setSize(200,200);
       b.setBounds(50,50,100,30);
       f.setLayout(null);
       f.setVisible(true);
       f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       f.add(b);
       b.addActionListener(this);
   }
   public void actionPerformed(ActionEvent e){
    b.setText("hi,clicked!!");
   }
   public static void main(String[] args) {
       new AddButtonInFrame();
   }
}
