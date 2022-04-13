package JAVA_SWING;

import javax.swing.*;
import javax.swing.tree.DefaultMutableTreeNode;

public class JTreeExample {

    JFrame jFrame;

    public JTreeExample() {

        jFrame = new JFrame("Chocolaty Kinza Amjad");

        DefaultMutableTreeNode kinza = new DefaultMutableTreeNode("Kinza");

        DefaultMutableTreeNode rabia = new DefaultMutableTreeNode("Rabia");

        DefaultMutableTreeNode tehreen = new DefaultMutableTreeNode("Tehreen");

        kinza.add(rabia);

        kinza.add(tehreen);

        DefaultMutableTreeNode kinzaAmjad = new DefaultMutableTreeNode("Kinza Amjad");

        DefaultMutableTreeNode rabiaAmjad = new DefaultMutableTreeNode("Rabia Amjad");

        DefaultMutableTreeNode tehreenAmjad = new DefaultMutableTreeNode("Tehreen Amjad");

        DefaultMutableTreeNode nuzhatNadeem = new DefaultMutableTreeNode("Nuzhat Nadeem");

        rabia.add(kinzaAmjad);

        rabia.add(rabiaAmjad);

        rabia.add(tehreenAmjad);

        rabia.add(nuzhatNadeem);

        JTree jTree = new JTree(kinza);

        jFrame.add(jTree);

        jFrame.setSize(200, 200);

        jFrame.setVisible(true);

    }

    public static void main(String[] args) {
        new JTreeExample();
    }
}
