package JAVA_SWING;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JListExample2 {

    public JListExample2() {

        JFrame jFrame = new JFrame("Kinza Amjad Frame");

        JLabel jLabel = new JLabel();

        jLabel.setSize(500, 100);

        JButton jButton = new JButton("Show");

        jButton.setBounds(200, 150, 80, 30);

        DefaultListModel<String> defaultListModel = new DefaultListModel();

        defaultListModel.addElement("Android");
        defaultListModel.addElement("Java");
        defaultListModel.addElement("Kotlin");
        defaultListModel.addElement("Swift");
        defaultListModel.addElement("IOS");

        JList<String> jList = new JList(defaultListModel);

        jList.setBounds(100, 100, 75, 75);

        DefaultListModel defaultListModel2 = new DefaultListModel();

        defaultListModel2.addElement("Android Studio");
        defaultListModel2.addElement("Intellij Idea");
        defaultListModel2.addElement("X Code");
        defaultListModel2.addElement("Java Netbeans");
        defaultListModel2.addElement("Java Eclipse");

        JList jList2 = new JList(defaultListModel2);

        jList2.setBounds(100, 200, 95, 75);

        jFrame.add(jList);

        jFrame.add(jList2);

        jFrame.add(jButton);

        jFrame.add(jLabel);

        jFrame.setSize(500, 500);

        jFrame.setLayout(null);

        jFrame.setVisible(true);

        jButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                String data = "";

                if(jList.getSelectedIndex() != -1){

                    data = "Programming Language Selected: " + jList.getSelectedValue();

                    jLabel.setText(data);
                }

                if(jList2.getSelectedIndex() != -1){

                    data += ", Framework Selected: ";

                    for (Object frame:jList2.getSelectedValues()) {

                        data +=  frame + " ";
                    }
                }

                jLabel.setText(data);
            }
        });





    }

    public static void main(String[] args) {

        new JListExample2();
    }
}
