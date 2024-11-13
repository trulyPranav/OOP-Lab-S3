import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class TrafficLightSimulation extends JFrame implements
ActionListener
{
    private JRadioButton redButton, yellowButton, greenButton;
    private JPanel lightPanel;
    public TrafficLightSimulation()
    {
        setTitle("Traffic Light Simulation");
        setLayout(new BorderLayout());
        redButton = new JRadioButton("Red");
        yellowButton = new JRadioButton("Yellow");
        greenButton = new JRadioButton("Green");
        ButtonGroup group = new ButtonGroup();
        group.add(redButton);
        group.add(yellowButton);
        group.add(greenButton);
        redButton.addActionListener(this);
        yellowButton.addActionListener(this);
        greenButton.addActionListener(this);
        JPanel radioPanel = new JPanel();
        radioPanel.setLayout(new FlowLayout());
        radioPanel.add(redButton);
        radioPanel.add(yellowButton);
        radioPanel.add(greenButton);
        radioPanel.setBackground(Color.GRAY);
        lightPanel = new JPanel()
        {
            protected void paintComponent(Graphics g)
            {
                super.paintComponent(g);
                g.setColor(Color.BLACK);
                g.fillRect(100, 50, 100, 300);
                if (redButton.isSelected())
                {
                    g.setColor(Color.RED);
                    g.fillOval(120, 70, 60, 60);
                    g.setColor(Color.GRAY);
                    g.fillOval(120, 150, 60, 60);
                    g.fillOval(120, 230, 60, 60);
                }
                else if (yellowButton.isSelected())
                {
                    g.setColor(Color.GRAY);
                    g.fillOval(120, 70, 60, 60);
                    g.setColor(Color.YELLOW);
                    g.fillOval(120, 150, 60, 60);
                    g.setColor(Color.GRAY);
                    g.fillOval(120, 230, 60, 60);
                }
                else if (greenButton.isSelected())
                {
                    g.setColor(Color.GRAY);
                    g.fillOval(120, 70, 60, 60);
                    g.fillOval(120, 150, 60, 60);
                    g.setColor(Color.GREEN);
                    g.fillOval(120, 230, 60, 60);
                }
                else
                {
                    g.setColor(Color.GRAY);
                    g.fillOval(120, 70, 60, 60);
                    g.fillOval(120, 150, 60, 60);
                    g.fillOval(120, 230, 60, 60);   
                }
            }
        };
        lightPanel.setPreferredSize(new Dimension(300, 400));
        add(radioPanel, BorderLayout.SOUTH);
        add(lightPanel, BorderLayout.CENTER);
        setSize(350, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent e)
    {
        lightPanel.repaint();
    }
    public static void main(String[] args)
    {
        new TrafficLightSimulation();
    }
}
