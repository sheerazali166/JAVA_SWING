import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PasswordFieldExample2 {

    public static void main(String[] args) {

        JFrame jFrame = new JFrame("Password Field Example");

        JLabel jLabel = new JLabel();

        jLabel.setBounds(20, 150, 200, 50);

        JPasswordField jPasswordField = new JPasswordField();

        jPasswordField.setBounds(100, 75, 100, 30);

        JLabel jLabelUsername = new JLabel("Username");

        jLabelUsername.setBounds(20, 20, 80, 30);

        JLabel jLabelPassword = new JLabel("Password");

        jLabelPassword.setBounds(20, 75, 80, 30);

        JButton jButtonLogin = new JButton("Login");

        jButtonLogin.setBounds(100, 120, 80, 30);

        JTextField jTextField = new JTextField();

        jTextField.setBounds(100, 20, 100, 30);

        jFrame.add(jLabel);

        jFrame.add(jLabelUsername);

        jFrame.add(jLabelPassword);

        jFrame.add(jTextField);

        jFrame.add(jPasswordField);

        jFrame.add(jButtonLogin);

        jFrame.setSize(400, 400);

        jFrame.setLayout(null);

        jFrame.setVisible(true);

        jButtonLogin.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                String data = "Username: " + jTextField.getText();

                data += ", Password: " + new String(jPasswordField.getPassword());

                jLabel.setText(data);
            }
        });


    }
}
