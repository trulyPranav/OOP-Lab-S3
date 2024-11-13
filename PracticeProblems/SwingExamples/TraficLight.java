package SwingExamples;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class TrafficEg extends JFrame implements ActionListener{
    JRadioButton b1,b2,b3;
    Container c;
    TrafficEg(){
        c = getContentPane();
        setTitle("TRaffic Light");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300,200);
        b1 = new JRadioButton("STOP");
        b2 = new JRadioButton("Prepare");
        b3 = new JRadioButton("GO");
        setLayout(new FlowLayout());
        ButtonGroup bg = new ButtonGroup();
        bg.add(b1);
        bg.add(b2);
        bg.add(b3);
        c.setBackground(Color.GRAY);
        c.add(b1);
        c.add(b2);
        c.add(b3);
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent ae){
        String s = ae.getActionCommand();
        if(s.equals("STOP"))
            c.setBackground(Color.RED);
        else if(s.equals("Prepare"))
            c.setBackground(Color.ORANGE);
        else c.setBackground(Color.GREEN);
    }
}

class TraficLight {
    public static void main(String[] args) {

        new TrafficEg();

        // SwingUtilities.invokeLater(
        //     new Runnable(){
        //         public void run(){
        //             new TrafficEg();
        //         }
        //     }
        // );
    }
}
