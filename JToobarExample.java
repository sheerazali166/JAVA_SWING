import javax.swing.*;
import java.awt.*;

public class JToobarExample {

    public static void main(String[] args) {

        JFrame myFrame = new JFrame("JToobar Example");

        myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JToolBar toolBar = new JToolBar();

        toolBar.setRollover(true);

        JButton button = new JButton("File");

        toolBar.add(button);

        toolBar.addSeparator();

        toolBar.add(new JButton("Edit"));

        toolBar.add(new JComboBox(new String[]{
            "Opt-1", "Opt-2", "Opt-3", "Opt-4",
        }));

        Container contentPaine = myFrame.getContentPane();

        contentPaine.add(toolBar, BorderLayout.NORTH);

        JTextArea jTextArea = new JTextArea();

        JScrollPane myPane = new JScrollPane(jTextArea);

        contentPaine.add(myPane, BorderLayout.EAST);

        myFrame.setSize(450, 250);

        myFrame.setVisible(true);

    }
}
