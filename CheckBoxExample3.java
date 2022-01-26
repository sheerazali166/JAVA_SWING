import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CheckBoxExample3 extends JFrame implements ActionListener {

    JLabel jLabel;

    JCheckBox jCheckBox1, jCheckBox2, jCheckBox3;

    JButton jButton;

    public CheckBoxExample3() {

        jLabel =new JLabel("Food Ordering System");

        jLabel.setBounds(50, 50, 300, 20);

        jCheckBox1 = new JCheckBox("Item One @ 100");

        jCheckBox1.setBounds(100, 100, 150, 20);

        jCheckBox2 = new JCheckBox("Item Two @ 30");

        jCheckBox2.setBounds(100, 150, 150, 20);

        jCheckBox3 = new JCheckBox("Item Three @ 10");

        jCheckBox3.setBounds(100, 200, 150, 20);

        jButton = new JButton("Purchase");

        jButton.setBounds(100, 250, 100, 30);

        jButton.addActionListener(this);

        add(jLabel);

        add(jCheckBox1);

        add(jCheckBox2);

        add(jCheckBox3);

        add(jButton);

        setSize(400, 400);

        setLayout(null);

        setVisible(true);

        setDefaultCloseOperation(EXIT_ON_CLOSE);


    }

    @Override
    public void actionPerformed(ActionEvent e) {

        float amount = 0;

        String message = "";

        if(jCheckBox1.isSelected()){

            amount += 100;

            message = "Item One: 100\n";
        }

        if(jCheckBox2.isSelected()){

            amount += 30;

            message += "Item Two: 30\n";
        }

        if(jCheckBox3.isSelected()){

            amount += 10;

            message += "Item Three: 10\n";
        }

        message += "--------------\n";

        JOptionPane.showMessageDialog(this, message + "Total: " + amount);
    }

    public static void main(String[] args) {

        new CheckBoxExample3();
    }
}
