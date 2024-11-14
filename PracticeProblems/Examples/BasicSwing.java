package Examples;

import javax.swing.*;
import java.awt.*;

class BasicSwing {
    public static void main(String[] args) {
        JFrame jf = new JFrame("MY Firsst");
        JLabel label = new JLabel("HELLO");
        JTextField jtf = new JTextField("hello");
        jtf.setBounds(20,30,150,50);
        //JButton button = new JButton("First Button");

        JRadioButton jrb1 = new JRadioButton("SELECT1");
        JRadioButton jrb2 = new JRadioButton("SELECT2");
        JRadioButton jrb3 = new JRadioButton("SELECT3");

        ButtonGroup bg = new ButtonGroup();

        bg.add(jrb1);
        bg.add(jrb2);
        bg.add(jrb3);

        jf.setSize(300,200);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        jf.setLayout(new FlowLayout(FlowLayout.RIGHT));
        jf.add(jtf);
        jf.add(label);
        jf.add(jrb1);
        jf.add(jrb2);
        jf.add(jrb3);
        // jf.add(button);
        jf.setVisible(true);
    }
}
