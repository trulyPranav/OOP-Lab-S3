package LabProblems.Swings;

// Write a Java program that simulates a traffic light.
// The program lets the user select one of three lights: red, yellow, or green.
// When a radio button is selected, the light is turned on, and only one light can be on at a time.
// No light is on when the program starts.

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class TrafficLightSimulation extends JFrame implements ActionListener {
    JPanel redPanel,yellowPanel,greenPanel,buttonPanel;
    JRadioButton red,yellow,green;
    TrafficLightSimulation(){
        setTitle("TRAFFIC LIGHT");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(420, 550);
        setLayout(new GridLayout(4,1));
        redPanel = new JPanel();
        redPanel.setBackground(Color.GRAY);
        yellowPanel = new JPanel();
        yellowPanel.setBackground(Color.GRAY);
        greenPanel = new JPanel();
        greenPanel.setBackground(Color.GRAY);
        buttonPanel = new JPanel();
        ButtonGroup bg = new ButtonGroup();
        red = new JRadioButton("STOP");
        yellow = new JRadioButton("START");
        green = new JRadioButton("GO");
        bg.add(red);
        bg.add(yellow);
        bg.add(green);
        buttonPanel.add(red);
        buttonPanel.add(yellow);
        buttonPanel.add(green);
        red.addActionListener(this);
        yellow.addActionListener(this);
        green.addActionListener(this);
        add(redPanel);
        add(yellowPanel);
        add(greenPanel);
        add(buttonPanel);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent ae){
        String s = ae.getActionCommand();
        if(s.equals("STOP")){
            redPanel.setBackground(Color.RED);
            yellowPanel.setBackground(Color.GRAY);
            greenPanel.setBackground(Color.GRAY);
        }
        if(s.equals("START")){
            redPanel.setBackground(Color.GRAY);
            yellowPanel.setBackground(Color.YELLOW);
            greenPanel.setBackground(Color.GRAY);
        }
        if(s.equals("GO")){
            redPanel.setBackground(Color.GRAY);
            yellowPanel.setBackground(Color.GRAY);
            greenPanel.setBackground(Color.GREEN);
        }
    }
    public static void main(String[] args) {
        new TrafficLightSimulation();
    }
}
