package LabProblems.Swings;

// Write a Java program that works as a simple calculator.
// Arrange Buttons for digits and the + - * % operations properly.
// Add a text field to display the result.
// Handle any possible exceptions like divide by zero. Use Java Swing. 


import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class Calculator extends JFrame implements ActionListener {
    JTextField textField;
    JPanel panel;
    JButton numberButton[], functionButton[];
    JButton addButton, subButton, mulButton, divButton;
    JButton equalButton, clearButton, decimalButton, delButton;
    double num1=0, num2=0, result=0;
    char operator = ' ';
    Calculator(){
        setTitle("CALCULATOR");
        setSize(420, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        textField = new JTextField();
        textField.setBounds(50, 25, 300, 50);
        setLayout(null);
        add(textField);
        panel = new JPanel();
        panel.setBounds(50, 100, 300, 300);
        panel.setLayout(new GridLayout(4, 4, 10, 10));
        addButton = new JButton("+");
        subButton = new JButton("-");
        mulButton = new JButton("x");
        divButton = new JButton("/");
        equalButton = new JButton("=");
        clearButton = new JButton("CLR");
        decimalButton = new JButton(".");
        delButton = new JButton("DEL");
        functionButton = new JButton[8];
        functionButton[0] = addButton;
        functionButton[1] = subButton;
        functionButton[2] = mulButton;
        functionButton[3] = divButton;
        functionButton[4] = equalButton;
        functionButton[5] = clearButton;
        functionButton[6] = decimalButton;
        functionButton[7] = delButton;
        for(int i=0; i<8; i++)
            functionButton[i].addActionListener(this);
        numberButton = new JButton[10];
        for(int i=0; i<10; i++){
            numberButton[i] = new JButton(String.valueOf(i));
            numberButton[i].addActionListener(this);
        }
        panel.add(numberButton[1]);
        panel.add(numberButton[2]);
        panel.add(numberButton[3]);
        panel.add(addButton);
        panel.add(numberButton[4]);
        panel.add(numberButton[5]);
        panel.add(numberButton[6]);
        panel.add(subButton);
        panel.add(numberButton[7]);
        panel.add(numberButton[8]);
        panel.add(numberButton[9]);
        panel.add(mulButton);
        panel.add(numberButton[0]);
        panel.add(decimalButton);
        panel.add(equalButton);
        panel.add(divButton);
        add(panel);
        delButton.setBounds(60, 400, 130, 50);
        clearButton.setBounds(210, 400, 130, 50);
        add(delButton);
        add(clearButton);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent ae){
        for(int i=0; i<10; i++){
            if(ae.getSource() == numberButton[i])
                textField.setText(textField.getText().concat(String.valueOf(i)));
        }
        if(ae.getSource() == addButton){
            num1 = Double.parseDouble(textField.getText());
            operator = '+';
            textField.setText(" ");
        }
        if(ae.getSource() == subButton){
            num1 = Double.parseDouble(textField.getText());
            operator = '-';
            textField.setText(" ");
        }
        if(ae.getSource() == mulButton){
            num1 = Double.parseDouble(textField.getText());
            operator = '*';
            textField.setText(" ");
        }
        if(ae.getSource() == divButton){
            num1 = Double.parseDouble(textField.getText());
            operator = '/';
            textField.setText(" ");
        }
        if(ae.getSource() == decimalButton){
            textField.setText(textField.getText().concat("."));
        }
        if(ae.getSource() == equalButton){
            num2 = Double.parseDouble(textField.getText());
            switch(operator){
                case '+':
                    result = num1+num2;
                    break;
                case '-':
                    result = num1-num2;
                    break;
                case '*':
                    result = num1*num2;
                    break;
                case '/':
                    try{
                        result = num1/num2;
                    } catch (ArithmeticException ex){
                        textField.setText("Error: Division by 0");
                    }
                    break;

            }
            textField.setText(String.valueOf(result));
            num1 = result;
        }
        if(ae.getSource() == clearButton)
            textField.setText("");
        if(ae.getSource() == delButton){
            String s = textField.getText();
            textField.setText("");
            for(int i=0; i<s.length()-1; i++)
                textField.setText(textField.getText() + s.charAt(i));
        }
    }
    public static void main(String[] args) {
        new Calculator();
    }
}
