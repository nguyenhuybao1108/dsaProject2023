import javax.swing.*;
import java.awt.*;

public class LayeredExample {
    public static void main(String[] args) {
        // Create a new JFrame
        JFrame frame = new JFrame("Layered Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create a JLayeredPane
        JLayeredPane layeredPane = new JLayeredPane();
        layeredPane.setPreferredSize(new Dimension(300, 210));

        // Create the first JLabel for the image
        JLabel label1 = new JLabel();
        label1.setBounds(50, 50, 200, 100);
        label1.setIcon(new ImageIcon("PIECES/Tiltle.png")); // replace with your image path
        layeredPane.add(label1, Integer.valueOf(1));

        // Create the second JLabel for the text
        JLabel label2 = new JLabel("This is the second layer");
        label2.setBounds(70, 70, 200, 100);
        label2.setForeground(Color.RED);
        layeredPane.add(label2, Integer.valueOf(2));

        // Add the JLayeredPane to the JFrame
        frame.add(layeredPane, BorderLayout.CENTER);
        frame.pack();
        frame.setVisible(true);
    }
}
