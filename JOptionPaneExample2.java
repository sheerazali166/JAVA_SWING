import javax.swing.*;

public class JOptionPaneExample2 {

    JFrame jFrame;

    public JOptionPaneExample2() {

        jFrame = new JFrame("Kinza Amjad Frame");

        JOptionPane.showMessageDialog(jFrame, "Successfully updated", "Alrt", JOptionPane.WARNING_MESSAGE);
    }

    public static void main(String[] args) {

        new JOptionPaneExample2();
    }
}
