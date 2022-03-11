package JAVA_SWING;

import javax.swing.*;

public class JTableExample {

    JFrame jFrame;

    public JTableExample() {

        jFrame = new JFrame("Miss Chocolaty Kinza Amjad Frame");

        String data[][] = {
                {"101", "Kinza Amjad", "Make Chocolates"},
                {"102", "Rabia Amjad", "Playing Games"},
                {"103", "Divya Khosla Kumar", "Moping And Brooming"},
                {"104", "Aiza Awan", "Speaking Slang Words"},
                {"105", "Roopa", "Taking Revenge of her brothers"},
        };


        String columns[] = {"ID", "Name", "Hobbie"};

        JTable jTable = new JTable(data, columns);

        jTable.setBounds(30, 40, 200, 300);

        JScrollPane jScrollPane = new JScrollPane(jTable);

        jFrame.add(jScrollPane);

        jFrame.setSize(600, 300);

        jFrame.setVisible(true);
    }

    public static void main(String[] args) {

        new JTableExample();
    }
}
