import javax.swing.*;

public class LabelExample {


    public static void main(String[] args) {

        JFrame jFrame = new JFrame("Label Example");

        JLabel jLabel = new JLabel("First Label");

        jLabel.setBounds(50, 50, 100, 30);

        JLabel jLabel2 = new JLabel("Second Label");

        jLabel2.setBounds(50, 100, 100, 30);

        jFrame.add(jLabel);

        jFrame.add(jLabel2);

        jFrame.setSize(300, 300);

        jFrame.setLayout(null);

        jFrame.setVisible(true);
    }

}
