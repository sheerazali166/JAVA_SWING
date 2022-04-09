package JAVA_SWING.rabia;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Menu_Example2 implements ActionListener {

    JFrame jFrame;

    JMenuBar jMenuBar;

    JMenu file, edit, help;

    JMenuItem cut, copy, paste, selectAll;

    JTextArea jTextArea;


    public Menu_Example2() {

        jFrame = new JFrame("Chocolaty Kinza Frame");

        cut = new JMenuItem("Cut");

        copy = new JMenuItem("Copy");

        paste = new JMenuItem("Paste");

        selectAll = new JMenuItem("Select All");

        cut.addActionListener(this);

        copy.addActionListener(this);

        paste.addActionListener(this);

        selectAll.addActionListener(this);

        jMenuBar = new JMenuBar();

        file = new JMenu("File");

        edit = new JMenu("Edit");

        help = new JMenu("Help");

        edit.add(cut);

        edit.add(copy);

        edit.add(paste);

        edit.add(selectAll);

        jMenuBar.add(file);

        jMenuBar.add(edit);

        jMenuBar.add(help);

        jTextArea = new JTextArea();

        jTextArea.setBounds(5, 5, 360, 320);

        jFrame.add(jMenuBar);

        jFrame.add(jTextArea);

        jFrame.setJMenuBar(jMenuBar);

        jFrame.setSize(400, 400);

        jFrame.setLayout(null);

        jFrame.setVisible(true);


    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if(e.getSource() == cut){

            jTextArea.cut();
        }

        if(e.getSource() == copy){

            jTextArea.copy();
        }

        if(e.getSource() == paste){

            jTextArea.paste();
        }

        if(e.getSource() == selectAll){

            jTextArea.selectAll();
        }
    }

    public static void main(String[] args) {

        new Menu_Example2();
    }
}
