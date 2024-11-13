package SwingExamples;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class EventMain extends JFrame implements ActionListener {
    JLabel label;
    JButton b1,b2;
    EventMain(){
        setTitle("Event Main");
        setSize(300,200);
        setLayout(new FlowLayout());
        b1 = new JButton("HI");
        b2 = new JButton("HELLO");
        label = new JLabel("This will CHANGE");
        add(b1);
        add(b2);
        add(label);
        b1.addActionListener(this);
        b2.addActionListener(this);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent ae){
        String lb = label.getText();
        String command = ae.getActionCommand();
        if(command.equals("HI")){
            label.setText("CHANGED FROM HI");
        } else {
            if(lb.equalsIgnoreCase("This will CHANGE")){
                label.setText("THIS WILL NOT CHANGE");
            } else label.setText("This will CHANGE");
        }
        //label.setText("CHANGED FROM Hello");

    }
}

class EventInSwing {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run(){
                new EventMain();
            }
        });
    }
}