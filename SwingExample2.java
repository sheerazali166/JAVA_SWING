import javax.swing.*;

public class SwingExample2 {

    public SwingExample2() {

        JFrame jFrame = new JFrame();

        JButton jButton = new JButton("Click");

        jButton.setBounds(130, 100, 100, 40);

        jFrame.add(jButton);

        jFrame.setSize(400, 400);

        jFrame.setLayout(null);

        jFrame.setVisible(true);
    }

    public static void main(String[] args) {

        new SwingExample2();
    }
}
