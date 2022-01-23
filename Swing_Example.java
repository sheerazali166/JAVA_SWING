import javax.swing.*;

public class Swing_Example {

    public static void main(String[] args) {

        JFrame jFrame = new JFrame();

        JButton jButton = new JButton("Click");

        jButton.setBounds(130, 100, 100, 40);

        jFrame.add(jButton);

        jFrame.setSize(400, 400);

        jFrame.setLayout(null);

        jFrame.setVisible(true);
    }
}
