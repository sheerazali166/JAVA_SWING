import javax.swing.*;

public class SeparatorExample {

    JMenu jMenu, subMenu;

    JMenuItem i1, i2, i3, i4, i5;



    public SeparatorExample() {


        JFrame jFrame = new JFrame("Kinza Amjad Frame");

        JMenuBar jMenuBar = new JMenuBar();

        jMenu = new JMenu("Menu");

        i1 = new JMenuItem("Kinza");

        i2 = new JMenuItem("Rabia");

        jMenu.add(i1);

        jMenu.addSeparator();

        jMenu.add(i2);

        jMenuBar.add(jMenu);

        jFrame.setJMenuBar(jMenuBar);

        jFrame.setSize(400, 400);

        jFrame.setLayout(null);

        jFrame.setVisible(true);

    }

    public static void main(String[] args) {
        new SeparatorExample();
    }
}
