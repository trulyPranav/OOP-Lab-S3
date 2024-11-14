import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MouseEventExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Mouse Event Example");
        JPanel panel = new JPanel();
        JLabel label1 = new JLabel("no event");
        JLabel label2 = new JLabel();
        JLabel label3 = new JLabel();
        JLabel label4 = new JLabel();
        JLabel label5=new  JLabel();

        MouseListener mouseListener = new MouseAdapter() {
            public void mousePressed(MouseEvent e) {
                label1.setText("mouse pressed at point: " + e.getX() + ", " + e.getY());
            }

            public void mouseReleased(MouseEvent e) {
                label2.setText("mouse released at point: " + e.getX() + ", " + e.getY());
            }

            public void mouseExited(MouseEvent e) {
                label3.setText("mouse exited through point: " + e.getX() + ", " + e.getY());
            }

            public void mouseEntered(MouseEvent e) {
                label4.setText("mouse entered at point: " + e.getX() + ", " + e.getY());
            }

            public void mouseClicked(MouseEvent e) {
                label5.setText("mouse clicked at point: " + e.getX() + ", " + e.getY() +
                        " (click count: " + e.getClickCount() + ")");
            }
        };

        panel.addMouseListener(mouseListener);
        panel.add(label1);
        panel.add(label2);
        panel.add(label3);
        panel.add(label4);
        panel.add(label5);

        frame.add(panel);
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}