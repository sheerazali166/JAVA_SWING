import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonExample2 {

    public static void main(String[] args) {

        JFrame jFrame = new JFrame("Button Example");

        JTextField jTextField = new JTextField();

        jTextField.setBounds(50, 50, 150, 20);

        JButton jButton = new JButton("Click Here");

        jButton.setBounds(50, 100, 95, 30);

        jButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                jTextField.setText("Welcome to Javapoint");


            }
        });

        jFrame.add(jTextField);

        jFrame.add(jButton);

        jFrame.setSize(400, 400);

        jFrame.setLayout(null);

        jFrame.setVisible(true);
    }
}
