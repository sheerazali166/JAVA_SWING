import javax.swing.*;
import java.awt.*;

public class ProgressBarExample extends Frame {

    JProgressBar jProgressBar;

    int i = 0, num = 0;

    public ProgressBarExample() {

        jProgressBar = new JProgressBar(0, 2000);

        jProgressBar.setBounds(40, 40, 160, 30);

        jProgressBar.setValue(0);

        jProgressBar.setStringPainted(true);

        add(jProgressBar);

        setSize(250, 150);

        setLayout(null);


    }

    public void iterate(){

        while (i <= 2000){

            jProgressBar.setValue(i);

            i = i + 20;

            try {
                Thread.sleep(150);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {

        ProgressBarExample progressBarExample = new ProgressBarExample();

        progressBarExample.setVisible(true);

        progressBarExample.iterate();
    }
}
