import javax.swing.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class CheckBoxExample2 {

    public CheckBoxExample2() {

        JFrame jFrame = new JFrame("CheckBox Example");

        JLabel jLabel = new JLabel();

        jLabel.setHorizontalAlignment(JLabel.CENTER);

        jLabel.setSize(400, 100);

        JCheckBox jCheckBox1 = new JCheckBox("C++");

        jCheckBox1.setBounds(150, 100, 50, 50);

        JCheckBox jCheckBox2 = new JCheckBox("Java");

        jCheckBox2.setBounds(150, 150, 80, 50);

        jFrame.add(jCheckBox1);

        jFrame.add(jCheckBox2);

        jFrame.add(jLabel);

        jCheckBox1.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {

                jLabel.setText("C++ CheckBox: " + (e.getStateChange() == 1 ? "Checked" : "Unchecked"));
            }
        });

        jCheckBox2.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {

                jLabel.setText("Java CheckBox: " + (e.getStateChange() == 1 ? "Checked" : "Unchecked"));
            }
        });

        jFrame.setSize(400, 400);

        jFrame.setLayout(null);

        jFrame.setVisible(true);

    }

    public static void main(String[] args) {

        new CheckBoxExample2();
    }
}
