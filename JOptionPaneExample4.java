import javax.swing.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class JOptionPaneExample4 extends WindowAdapter {

    JFrame jFrame;

    public JOptionPaneExample4() {

        jFrame = new JFrame("My Love Chocolaty Kinzi");

        jFrame.addWindowListener(this);

        jFrame.setSize(400, 400);

        jFrame.setLayout(null);

        jFrame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);

        jFrame.setVisible(true);


    }

    @Override
    public void windowClosing(WindowEvent e) {
        super.windowClosing(e);

        int kinza = JOptionPane.showConfirmDialog(jFrame, "Are you sure");

        if(kinza == JOptionPane.YES_OPTION){

            jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        }

    }

    public static void main(String[] args) {

        new JOptionPaneExample4();
    }
}
