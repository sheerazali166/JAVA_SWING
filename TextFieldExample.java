import javax.swing.*;

public class TextFieldExample {

    public static void main(String[] args) {

        JFrame jFrame = new JFrame("JTextField Frame");

        JTextField jtextField1, jTextField2;

        jtextField1 = new JTextField("Welcome to javapoint");

        jtextField1.setBounds(50, 100, 200, 30);

        jTextField2 = new JTextField("Welcome to some other point");

        jTextField2.setBounds(50, 150, 200, 30);

        jFrame.add(jtextField1);

        jFrame.add(jTextField2);

        jFrame.setSize(400, 400);

        jFrame.setLayout(null);

        jFrame.setVisible(true);
    }
}
