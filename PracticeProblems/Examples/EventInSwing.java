package Examples;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class Execute extends JFrame implements ActionListener{
    JLabel label;
    JButton b1,b2,b3;
    Execute(){
        setTitle("EXECUTION");
        setSize(300,200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());
        label = new JLabel("JLABEL TEXT");
        b1 = new JButton("Button 1");
        b2 = new JButton("Button 2");
        b3 = new JButton("Button 3");
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        add(label);
        add(b1);
        add(b2);
        add(b3);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent ae){
        String s = ae.getActionCommand();
        if(s.equals("Button 1")){
            label.setText("Changed from Button 1");
        }
        else if(s.equals("Button 2")) {
            label.setText("Changed from Button 2");
        }
        else{
            label.setText("JLABEL TEXT");
        }
    }
}

class EventInSwing {
    public static void main(String[] args) {
        new Execute();
    }
}

