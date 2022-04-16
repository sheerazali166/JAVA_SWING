package JAVA_SWING;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class JToggleButtonExample extends JFrame implements ItemListener {

    JToggleButton jToggleButton;

    public JToggleButtonExample() {


        setTitle("💕💕 Kinza Amjad 💕💕 is so so chocolaty");

        setLayout(new FlowLayout());

        setJToogleButton();

        setAction();

        setSize(400, 400);

        setVisible(true);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


    }

    private void setJToogleButton(){

        jToggleButton = new JToggleButton("Kinza");

        add(jToggleButton);
    }

    private void setAction(){

        jToggleButton.addItemListener(this);

    }

    @Override
    public void itemStateChanged(ItemEvent e) {

        if(jToggleButton.isSelected()){

            jToggleButton.setText("Rabia Amjad");
        }
        else{
            jToggleButton.setText("Kinza Amjad");
        }
    }

    public static void main(String[] args) {

        new JToggleButtonExample();
    }
}
