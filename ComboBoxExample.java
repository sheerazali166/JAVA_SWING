package JAVA_SWING;

import javax.swing.*;

public class ComboBoxExample {

    JFrame jFrame;

    public ComboBoxExample() {

        jFrame = new JFrame("Chocolaty Kinza Frame");

        String girls[] = {"Kinza Amjad", "Rabia Amjad", "Nuzhat Nadeem", "Aiza Awan", "Roopa"};

        JComboBox jComboBox = new JComboBox(girls);

        jComboBox.setBounds(50, 50, 110, 20);

        jFrame.add(jComboBox);

        jFrame.setSize(400, 400);

        jFrame.setLayout(null);

        jFrame.setVisible(true);
    }

    public static void main(String[] args) {

        new ComboBoxExample();
    }
}
