import javax.swing.*;

public class JOptionPaneExample3 {

    JFrame jFrame;

    public JOptionPaneExample3() {

        jFrame = new JFrame("Miss Chocolhaty Kinza Amjad Frame");

        JOptionPane.showInputDialog(jFrame,"Enter Name");



    }

    public static void main(String[] args) {

        new JOptionPaneExample3();
    }
}
