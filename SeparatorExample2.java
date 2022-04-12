import javax.swing.*;
import java.awt.*;

public class SeparatorExample2 {

    public static void main(String[] args) {

        JFrame jFrame = new JFrame("Kinza Frame");

        jFrame.setLayout(new GridLayout(0, 1));

        JLabel jLabel = new JLabel("Above Separator");

        jFrame.add(jLabel);

        JSeparator jSeparator = new JSeparator();

        jFrame.add(jSeparator);

        JLabel jLabel2 = new JLabel("Below Separator");

        jFrame.add(jLabel2);

        jFrame.setSize(400, 100);

        jFrame.setVisible(true);


    }
}
