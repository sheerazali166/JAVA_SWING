import javax.swing.*;

public class ButtonExample3 {

    public ButtonExample3() {

        JFrame jFrame = new JFrame("Button Example");

        JButton jButton = new JButton(new ImageIcon("register-button-png-18462.png"));

        jButton.setBounds(100, 100, 100, 50);

        jFrame.add(jButton);

        jFrame.setSize(400, 400);

        jFrame.setLayout(null);

        jFrame.setVisible(true);

        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {

        new ButtonExample3();
    }
}
