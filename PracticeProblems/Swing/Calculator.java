import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Calculator extends JFrame implements ActionListener
{
        
    JTextField textField;
    JButton[] numberButtons = new JButton[10];
    JButton[] functionButtons = new JButton[8];
    JButton addButton, subButton, mulButton, divButton;
    JButton decButton, equButton, delButton, clrButton;
    JPanel panel;
    double num1 = 0, num2 = 0, result = 0;
    char operator;
    Calculator()
    {
        setTitle("Calculator Simulation");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(420, 550);
        setLayout(null);
        textField = new JTextField();
        textField.setBounds(50, 25, 300, 50);
        // textField.setFont(new Font("Arial", Font.PLAIN, 28));
        // textField.setEditable(false);
        add(textField);
        addButton = new JButton("+");
        subButton = new JButton("-");
        mulButton = new JButton("*");
        divButton = new JButton("/");
        decButton = new JButton(".");
        equButton = new JButton("=");
        delButton = new JButton("Del");
        clrButton = new JButton("Clr");
        functionButtons[0] = addButton;
        functionButtons[1] = subButton;
        functionButtons[2] = mulButton;
        functionButtons[3] = divButton;
        functionButtons[4] = decButton;
        functionButtons[5] = equButton;
        functionButtons[6] = delButton;
        functionButtons[7] = clrButton;
        for (int i = 0; i < 8; i++)
        {
            functionButtons[i].addActionListener(this);
            // functionButtons[i].setFont(new Font("Arial", Font.PLAIN,
            // 24));
            // functionButtons[i].setFocusable(false);
        }
        for (int i = 0; i < 10; i++)
        {
            
            numberButtons[i] = new JButton(String.valueOf(i));
            numberButtons[i].addActionListener(this);
            // numberButtons[i].setFont(new Font("Arial", Font.PLAIN, 24));
            // numberButtons[i].setFocusable(false);
        }
        panel = new JPanel();
        panel.setBackground(Color.BLUE);
        panel.setBounds(50, 100, 300, 300);
        panel.setLayout(new GridLayout(4, 4, 10, 10));
        panel.add(numberButtons[1]);
        panel.add(numberButtons[2]);
        panel.add(numberButtons[3]);
        panel.add(addButton);
        panel.add(numberButtons[4]);
        panel.add(numberButtons[5]);
        panel.add(numberButtons[6]);
        panel.add(subButton);
        panel.add(numberButtons[7]);
        panel.add(numberButtons[8]);
        panel.add(numberButtons[9]);
        panel.add(mulButton);
        panel.add(decButton);
        panel.add(numberButtons[0]);
        panel.add(equButton);
        panel.add(divButton);
        add(panel);
        delButton.setBounds(50, 430, 145, 50);
        clrButton.setBounds(205, 430, 145, 50);
        add(delButton);
        add(clrButton);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent e)
    {
        for (int i = 0; i < 10; i++)
        {
            if (e.getSource() == numberButtons[i])
            {
                textField.setText(textField.getText().concat(String.valueOf(i)));
            }
        }
        if (e.getSource() == decButton)
        {
            textField.setText(textField.getText().concat("."));
        }
        if (e.getSource() == addButton)
        {
            num1 = Double.parseDouble(textField.getText());
            operator = '+';
            textField.setText("");
        }
        if (e.getSource() == subButton)
        {
            num1 = Double.parseDouble(textField.getText());
            operator = '-';
            textField.setText("");
        }
        if (e.getSource() == mulButton)
        {
            num1 = Double.parseDouble(textField.getText());
            operator = '*';
            textField.setText("");
        }
        if (e.getSource() == divButton)
        {
            num1 = Double.parseDouble(textField.getText());
            operator = '/';
            textField.setText("");
        }
        if (e.getSource() == equButton)
        {
            num2 = Double.parseDouble(textField.getText());
            switch (operator)
            {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                try
                {
                    result = num1 / num2;
                } catch (ArithmeticException ex)
                {
                    textField.setText("Error: Divide by 0");
                return;
                }
                break;
            }
            textField.setText(String.valueOf(result));
            num1 = result;
        }
        if (e.getSource() == clrButton)
        {
            textField.setText("");
        }
        if (e.getSource() == delButton)
        {
            String string = textField.getText();
            textField.setText("");
            for (int i = 0; i < string.length() - 1; i++)
            {
                textField.setText(textField.getText() +
                string.charAt(i));
            }
        }
    }
    public static void main(String[] args)
    {
        new Calculator();
    }
}