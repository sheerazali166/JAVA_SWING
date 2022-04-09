package JAVA_SWING.rabia;

import javax.swing.*;

public class MenuExample {

    JMenu jMenu, subJMenu;

    JMenuItem i1, i2, i3, i4, i5;


    public MenuExample() {

        JFrame jFrame = new JFrame("Kinza Rabia Tehreen Frame");

        JMenuBar jMenuBar = new JMenuBar();

        jMenu = new JMenu("Menu");

        subJMenu = new JMenu("Sub Menu");

        i1 = new JMenuItem("Kinza Amjad");

        i2 = new JMenuItem("Rabia Amjad");

        i3 = new JMenuItem("Tehreen Amjad");

        i4 = new JMenuItem("Abnormal Amjad");

        i5 = new JMenuItem("Extra Ordinary Amjad");

        jMenu.add(i1);
        jMenu.add(i2);
        jMenu.add(i3);

        subJMenu.add(i4);
        subJMenu.add(i5);

        jMenu.add(subJMenu);

        jMenuBar.add(jMenu);

        jFrame.setJMenuBar(jMenuBar);

        jFrame.setSize(400, 400);

        jFrame.setLayout(null);

        jFrame.setVisible(true);

    }

    public static void main(String[] args) {

        new MenuExample();
    }
}
