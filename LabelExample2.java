import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.UnknownHostException;

public class LabelExample2 extends JFrame implements ActionListener {

    JTextField jTextField;

    JLabel jLabel;

    JButton jButton;

    public LabelExample2() {

        jTextField = new JTextField();

        jTextField.setBounds(50, 50, 150, 20);

        jLabel = new JLabel();

        jLabel.setBounds(50, 100, 250, 20);

        jButton = new JButton("Find IP");

        jButton.setBounds(50, 150, 95, 30);

        jButton.addActionListener(this);

        add(jLabel);

        add(jTextField);

        add(jButton);

        setSize(400, 400);

        setLayout(null);

        setVisible(true);



    }

    @Override
    public void actionPerformed(ActionEvent e) {

        String host = jTextField.getText();

        try {

            String ip = java.net.InetAddress.getByName(host).getHostAddress();

            jLabel.setText("IP of " + host + " is: " + ip);


        } catch (UnknownHostException ex) {
            ex.printStackTrace();
        }
    }

    public static void main(String[] args) {

        new LabelExample2();
    }
}
