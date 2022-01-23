import javax.swing.*;

public class ButtonExample {

    public static void main(String[] args) {

        JFrame jFrame = new JFrame("Button Example");

        JButton jButton = new JButton("Click Here");

        jButton.setBounds(50, 100, 95, 30);

        jFrame.add(jButton);

        jFrame.setSize(400, 400);

        jFrame.setLayout(null);

        jFrame.setVisible(true);
    }



}
