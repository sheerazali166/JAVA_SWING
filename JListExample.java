package JAVA_SWING;

import javax.swing.*;

public class JListExample {

    public JListExample() {

        JFrame jFrame = new JFrame();

        DefaultListModel<String> defaultListModel = new DefaultListModel<>();

        defaultListModel.addElement("Kinza Amjad");
        defaultListModel.addElement("Chocolaty Kinza");
        defaultListModel.addElement("Chocolaty Kinzi");
        defaultListModel.addElement("Miss Kinza Amjad");
        defaultListModel.addElement("Chocolhaty Kinzi ji");
        defaultListModel.addElement("Miss chocolaty Kinzi");
        defaultListModel.addElement("Rabia Amjad");

        JList<String> jList = new JList<>(defaultListModel);

        jList.setBounds(100, 100, 150, 150);

        jFrame.add(jList);

        jFrame.setSize(400, 400);

        jFrame.setLayout(null);

        jFrame.setVisible(true);

    }

    public static void main(String[] args) {

        new JListExample();
    }
}
