package JAVA_SWING;


import javax.swing.*;

public class ScrollBarExample {

    public ScrollBarExample() {

        JFrame jFrame = new JFrame("Kinza Scroll Bar");

        JScrollBar jScrollBar = new JScrollBar();

        jScrollBar.setBounds(100, 100, 50, 100);

        jFrame.add(jScrollBar);

        jFrame.setSize(400, 400);

        jFrame.setLayout(null);

        jFrame.setVisible(true);



    }

    public static void main(String[] args) {

        new ScrollBarExample();
    }
}
