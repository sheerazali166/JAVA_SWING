import javax.swing.*;

public class JRadioButtonExample {

    JFrame jFrame;

    public JRadioButtonExample() {

        jFrame = new JFrame("Choclaty Kinza Frame");

        JRadioButton kinza = new JRadioButton("(A) Kinza");

        JRadioButton rabia = new JRadioButton("(B) Rabia");

        kinza.setBounds(70, 50, 100, 30);

        rabia.setBounds(75, 100, 100, 30);

        ButtonGroup buttonGroup = new ButtonGroup();

        buttonGroup.add(kinza);

        buttonGroup.add(rabia);

        jFrame.add(kinza);

        jFrame.add(rabia);

        jFrame.setSize(300, 300);

        jFrame.setLayout(null);

        jFrame.setVisible(true);
    }

    public static void main(String[] args) {

        new JRadioButtonExample();
    }
}
