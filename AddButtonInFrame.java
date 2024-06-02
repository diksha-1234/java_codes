import javax.swing.*;

public class AddButtonInFrame{
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
    }
    public static void main(String[] args) {
        new AddButtonInFrame();
    }
}
