package JAVA_SWING;

import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import java.awt.*;

public class JTableExample2 {

    JFrame jFrame;

    public JTableExample2() {

        jFrame = new JFrame("Miss Chopcolaty Kinzi Frame");

        String data[][] = {

                {"101", "Kinza", "Cute"},
                {"102", "Rabia", "Sweet"},
                {"103", "Nuzhat Nadeem", "Lovely"},
                {"104", "Divya", "Gadhi"},
                {"105", "Roopa", "Mental"}

        };

        String columns[] = {"ID", "Name", "Nature"};

        JTable jTable = new JTable(data, columns);

        jTable.setCellSelectionEnabled(true);

        ListSelectionModel listSelectionModel = jTable.getSelectionModel();

        listSelectionModel.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

        listSelectionModel.addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {

                String data = null;

                int[] row = jTable.getSelectedRows();

                int[] columns = jTable.getSelectedColumns();

                for (int i = 0; i < row.length; i++) {

                    for (int j = 0; j < columns.length; j++) {

                        data = (String)jTable.getValueAt(row[i], columns[j]);

                    }
                }

                System.out.println("Table element selected is: " + data);




            }
        });

        JScrollPane jScrollPane = new JScrollPane(jTable);

        jFrame.add(jScrollPane);

        jFrame.setSize(300, 300);

        jFrame.setVisible(true);

    }

    public static void main(String[] args) {

        new JTableExample2();
    }
}
