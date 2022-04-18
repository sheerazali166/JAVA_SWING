import javax.swing.*;

public class TabbedPaneExample {

    JFrame jFrame;

    public TabbedPaneExample() {

        jFrame = new JFrame();

        JTextArea jTextArea = new JTextArea(200, 200);

        JPanel jPanel = new JPanel();

        jPanel.add(jTextArea);

        JPanel jPanel2 = new JPanel();

        JPanel jPanel3 = new JPanel();

        JTabbedPane jTabbedPane = new JTabbedPane();

        jTabbedPane.setBounds(50, 50, 200, 200);

        jTabbedPane.add("Main", jPanel);

        jTabbedPane.add("Visit", jPanel2);

        jTabbedPane.add("Help", jPanel3);

        jFrame.add(jTabbedPane);

        jFrame.setSize(400, 400);

        jFrame.setLayout(null);

        jFrame.setVisible(true);

    }

    public static void main(String[] args) {

        new TabbedPaneExample();
    }
}
