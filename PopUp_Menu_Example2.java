import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class PopUp_Menu_Example2 {

    public PopUp_Menu_Example2() {

        JFrame jFrame = new JFrame("Kinza Cute Rabia Sweet");

        JLabel jLabel = new JLabel();

        jLabel.setHorizontalAlignment(JLabel.CENTER);

        jLabel.setSize(400, 100);

        JPopupMenu jPopupMenu = new JPopupMenu("Edit");

        JMenuItem cut = new JMenuItem("Cut");

        JMenuItem copy = new JMenuItem("Copy");

        JMenuItem paste = new JMenuItem("Paste");

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

        cut.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                jLabel.setText("Cut MenuItem Clicked");
            }
        });

        copy.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                jLabel.setText("Copy MenuItem Clicked");
            }
        });

        paste.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                jLabel.setText("Paste MenuItem Clicked");
            }
        });

        jFrame.add(jPopupMenu);

        jFrame.add(jLabel);

        jFrame.setSize(400, 400);

        jFrame.setLayout(null);

        jFrame.setVisible(true);
    }

    public static void main(String[] args) {

        new PopUp_Menu_Example2();
    }
}
