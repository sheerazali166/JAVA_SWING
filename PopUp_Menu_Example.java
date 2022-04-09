import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class PopUp_Menu_Example {

    public PopUp_Menu_Example() {

        JFrame jFrame = new JFrame("Kinza Pop Up Frame");

        JPopupMenu jPopupMenu = new JPopupMenu("Edit");

        JMenuItem copy = new JMenuItem("Copy");

        JMenuItem paste = new JMenuItem("Paste");

        JMenuItem cut = new JMenuItem("Cut");

        jPopupMenu.add(cut);

        jPopupMenu.add(copy);

        jPopupMenu.add(paste);

        jFrame.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);

                jPopupMenu.show(jFrame, e.getX(), e.getY());
            }
        });

        jFrame.add(jPopupMenu);

        jFrame.setSize(300, 300);

        jFrame.setLayout(null);

        jFrame.setVisible(true);
    }

    public static void main(String[] args) {

        new PopUp_Menu_Example();
    }
}
