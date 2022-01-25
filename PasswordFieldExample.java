import javax.swing.*;

public class PasswordFieldExample {

    public static void main(String[] args) {

        JFrame jFrame = new JFrame("JPasswordField Frame");

        JPasswordField jPasswordField = new JPasswordField();

        JLabel jLabel = new JLabel("Password");

        jLabel.setBounds(20, 100, 80, 30);

        jPasswordField.setBounds(100, 100, 100, 30);

        jFrame.add(jLabel);

        jFrame.add(jPasswordField);

        jFrame.setSize(400, 400);

        jFrame.setLayout(null);

        jFrame.setVisible(true);
    }
}
