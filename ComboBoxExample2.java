package JAVA_SWING;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ComboBoxExample2 {

    JFrame jFrame;

    public ComboBoxExample2() {

        jFrame = new JFrame("Combo Box Frame");

        JLabel jLabel = new JLabel();

        jLabel.setHorizontalAlignment(JLabel.CENTER);

        jLabel.setSize(400, 100);

        JButton jButton = new JButton("Show");

        jButton.setBounds(200, 100, 75, 20);

        String languages[] = {"Java", "Android", "Kotlin", "Swift", "IOS"};

        JComboBox jComboBox = new JComboBox(languages);

        jComboBox.setBounds(50, 100, 90, 20);

        jFrame.add(jLabel);

        jFrame.add(jButton);

        jFrame.add(jComboBox);

        jFrame.setSize(400, 400);

        jFrame.setLayout(null);

        jFrame.setVisible(true);

        jButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                String data = "Programming language selected: " +
                        jComboBox.getItemAt(jComboBox.getSelectedIndex());

                jLabel.setText(data);

             }
        });

    }

    public static void main(String[] args) {

        new ComboBoxExample2();
    }
}
