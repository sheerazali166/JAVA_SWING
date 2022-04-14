import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ColorChooserExample_2 extends JFrame implements ActionListener {

    JFrame jFrame;

    JButton jButton;

    JTextArea jTextArea;

    public ColorChooserExample_2() {

        jFrame = new JFrame("Kinza Color Frame");

        jButton = new JButton("Kinza Color");

        jButton.setBounds(200, 250, 100, 30);

        jTextArea = new JTextArea();

        jTextArea.setBounds(10, 10, 300, 200);

        jButton.addActionListener(this);

        jFrame.add(jTextArea);

        jFrame.add(jButton);

        jFrame.setLayout(null);

        jFrame.setSize(400, 400);

        jFrame.setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {

        Color color = JColorChooser.showDialog(this, "Choose", Color.GREEN);

        jTextArea.setBackground(color);
    }

    public static void main(String[] args) {

        new ColorChooserExample_2();
    }
}
