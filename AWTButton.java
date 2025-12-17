import java.awt.*;
import java.awt.event.*;

public class AWTButton {
    public static void main(String[] args){
        Frame f = new Frame("AWT Button");

        Button b1 = new Button("Click Here!");
        b1.setBounds(20,100,100,40);
        Button b2 = new Button("Click Here!");
        b2.setBounds(150,100,100,40);
        Button b3 = new Button("Click Here!");
        b3.setBounds(290,100,100,40);

        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                f.setBackground(Color.CYAN);
            }
        });
        b2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                f.setBackground(Color.YELLOW);
            }
        });
        b3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                f.setBackground(Color.white);
            }
        });

        f.add(b1);
        f.add(b2);
        f.add(b3);
        f.setSize(420,300);
        f.setLayout(null);
        f.setVisible(true);
        f.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }
}
