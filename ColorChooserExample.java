import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ColorChooserExample extends JFrame implements ActionListener {

    JButton jButton;

    Container container;

    public ColorChooserExample()  {

        container = getContentPane();

        container.setLayout(new FlowLayout());

        jButton = new JButton("Color");

        jButton.addActionListener(this);

        container.add(jButton);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        Color initialColor = Color.BLUE;

        Color color = JColorChooser.showDialog(this, "Select a Kinza's Favourite Color", initialColor);

        container.setBackground(color);

    }

    public static void main(String[] args) {

        ColorChooserExample colorChooserExample = new ColorChooserExample();

        colorChooserExample.setSize(400, 400);

        colorChooserExample.setVisible(true);

        colorChooserExample.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
}
