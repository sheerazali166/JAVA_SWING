import javax.swing.*;

public class JOptionPaneExample {

    JFrame jFrame;

    public JOptionPaneExample() {

        jFrame = new JFrame("Miss Chocolaty Kinzi Frame");

        JOptionPane.showMessageDialog(jFrame, "Hello, Welcome to kinza point");
    }

    public static void main(String[] args) {

        new JOptionPaneExample();
    }
}
