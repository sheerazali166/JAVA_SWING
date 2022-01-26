import javax.swing.*;

public class CheckboxEample {

    public CheckboxEample() {

        JFrame jFrame = new JFrame("CheckBox Example");

        JCheckBox checkBox1 = new JCheckBox("C++");

        checkBox1.setBounds(100, 100, 50, 50);

        JCheckBox jCheckBox2 = new JCheckBox("Java", true);

        jCheckBox2.setBounds(100, 150, 80, 50);

        jFrame.add(checkBox1);

        jFrame.add(jCheckBox2);

        jFrame.setSize(400, 400);

        jFrame.setLayout(null);

        jFrame.setVisible(true);
    }

    public static void main(String[] args) {

        new CheckboxEample();
    }
}
