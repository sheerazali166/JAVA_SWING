import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JRadioButtonExample2 extends JFrame implements ActionListener {

    JRadioButton kinza;

    JRadioButton rabia;

    JButton jButton;


    public JRadioButtonExample2(){

        kinza = new JRadioButton("Kinza");

        kinza.setBounds(100, 50, 100, 30);

        rabia = new JRadioButton("Rabia");

        rabia.setBounds(100, 100, 100, 30);

        ButtonGroup buttonGroup = new ButtonGroup();

        buttonGroup.add(kinza);

        buttonGroup.add(rabia);

        jButton = new JButton("Kinza Rabia Click");

        jButton.setBounds(60, 150, 150, 30);

        jButton.addActionListener(this);

        add(kinza);

        add(rabia);

        add(jButton);

        setSize(300, 300);

        setLayout(null);

        setVisible(true);

        
    }


    @Override
    public void actionPerformed(ActionEvent e) {

        if (kinza.isSelected()){

            JOptionPane.showMessageDialog(this, "Kinza Amjad is so so cute");
        }

        else if(rabia.isSelected()){

            JOptionPane.showMessageDialog(this, "Rabia Amjad is so so sweet");

        }

    }

    public static void main(String[] args) {

        new JRadioButtonExample2();
    }
}
