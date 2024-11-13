package SwingExamples;

import javax.swing.*;

class BasicSwing {
    public static void main(String[] args) {
        JFrame jf = new JFrame();
        // setSize has two constructors: First One: Width :: Second One: Height
        jf.setSize(300,200);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JLabel label = new JLabel("HEMME PUTHIYA SWING!!");
        jf.add(label);
        jf.setVisible(true);
    }
}
