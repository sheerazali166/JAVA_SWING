package JAVA_SWING;

import javax.swing.*;

public class JMenuExample {

    JMenu jMenu, jSubMenu;

    JMenuItem jMenuItem1, jMenuItem2, jMenuItem3, jMenuItem4, jMenuItem5;

    public JMenuExample() {

        JFrame jFrame = new JFrame("Rabia Amjad Frame");

        JMenuBar jMenuBar = new JMenuBar();

        jMenu = new JMenu("Rabia Menu");

        jSubMenu = new JMenu("Rabia Sub Menu");

        jMenuItem1 = new JMenuItem("Chocolaty Kinzi");
        jMenuItem2 = new JMenuItem("Chocolaty Kinza Amjad");
        jMenuItem3 = new JMenuItem("Sweet Rabia");
        jMenuItem4 = new JMenuItem("Sweet Rabia amjad");
        jMenuItem5 = new JMenuItem("Rabia is the best");

        jSubMenu.add(jMenuItem1);
        jSubMenu.add(jMenuItem2);
        jSubMenu.add(jMenuItem3);

        jSubMenu.add(jMenuItem4);
        jSubMenu.add(jMenuItem5);

        jMenu.add(jSubMenu);

        jMenuBar.add(jMenu);

        jFrame.setJMenuBar(jMenuBar);

        jFrame.setSize(400, 400);

        jFrame.setLayout(null);

        jFrame.setVisible(true);


    }

    public static void main(String[] args) {

        new JMenuExample();
    }
}
