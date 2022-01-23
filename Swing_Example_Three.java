import javax.swing.*;

public class Swing_Example_Three extends JFrame {

    public Swing_Example_Three(){

        JButton jButton = new JButton("Click");

        jButton.setBounds(130, 100, 100, 40);

        add(jButton);

        setSize(400, 400);

        setLayout(null);

        setVisible(true);

    }

    public static void main(String[] args) {

        new Swing_Example_Three();
    }
}
