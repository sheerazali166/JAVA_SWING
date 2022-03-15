package JAVA_SWING;

import javax.swing.*;
import java.awt.event.AdjustmentEvent;
import java.awt.event.AdjustmentListener;

public class ScrollBarExample2 {

    public ScrollBarExample2() {

        JFrame jFrame = new JFrame("Rabia Scroll Bar");

        JLabel jLabel = new JLabel();

        jLabel.setHorizontalAlignment(JLabel.CENTER);

        jLabel.setSize(400, 100);

        JScrollBar jScrollBar = new JScrollBar();

        jScrollBar.setBounds(100, 100, 50, 100);

        jFrame.add(jLabel);

        jFrame.add(jScrollBar);

        jFrame.setSize(400, 400);

        jFrame.setLayout(null);

        jFrame.setVisible(true);

        jScrollBar.addAdjustmentListener(new AdjustmentListener() {
            @Override
            public void adjustmentValueChanged(AdjustmentEvent e) {

                jLabel.setText("Vertical Scrollbar Value is: " + e.getValue());
            }
        });
    }

    public static void main(String[] args) {

        new ScrollBarExample2();
    }
}
