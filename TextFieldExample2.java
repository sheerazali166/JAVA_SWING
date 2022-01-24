import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TextFieldExample2 implements ActionListener {

    JTextField jTextField1, jTextField2, jTextField3;

    JButton jButton1, jButton2;

    public TextFieldExample2() {

        JFrame jFrame = new JFrame();

        jTextField1 = new JTextField();

        jTextField1.setBounds(50, 50, 150, 20);

        jTextField2 = new JTextField();

        jTextField2.setBounds(50, 100, 150, 20);

        jTextField3 = new JTextField();

        jTextField3.setBounds(50, 150, 150, 20);

        jTextField3.setEditable(false);

        jButton1 = new JButton("+");

        jButton1.setBounds(50, 200, 50, 50);

        jButton2 = new JButton("-");

        jButton2.setBounds(120, 200, 50, 50);

        jButton1.addActionListener(this);

        jButton2.addActionListener(this);

        jFrame.add(jTextField1);

        jFrame.add(jTextField2);

        jFrame.add(jTextField3);

        jFrame.add(jButton1);

        jFrame.add(jButton2);

        jFrame.setSize(300, 300);

        jFrame.setLayout(null);

        jFrame.setVisible(true);


    }

    @Override
    public void actionPerformed(ActionEvent e) {

        String number1 = jTextField1.getText();

        String number2 = jTextField2.getText();

        int num1 = Integer.parseInt(number1);

        int num2 = Integer.parseInt(number2);

        int result = 0;

        if(e.getSource() == jButton1){

            result = num1 + num2;
        }

        else if(e.getSource() == jButton2){

            result = num1 - num2;
        }

        String finalResult = String.valueOf(result);

        jTextField3.setText(finalResult);
    }

    public static void main(String[] args) {

        new TextFieldExample2();
    }
}
