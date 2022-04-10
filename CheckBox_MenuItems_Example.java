import javax.swing.*;
import javax.swing.event.MenuKeyEvent;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CheckBox_MenuItems_Example {

    public static void main(String[] args) {

        JFrame jFrame = new JFrame("Chocolaty Kinza frame");

        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JMenuBar jMenuBar = new JMenuBar();

        JMenu fileJMenu = new JMenu("File");

        fileJMenu.setMnemonic(MenuKeyEvent.VK_F);

        jMenuBar.add(fileJMenu);

        JMenuItem jMenuItem = new JMenuItem("Onpen", MenuKeyEvent.VK_C);

        fileJMenu.add(jMenuItem);

        JCheckBoxMenuItem caseBoxMenuItem = new JCheckBoxMenuItem("Option_1");

        caseBoxMenuItem.setMnemonic(MenuKeyEvent.VK_C);

        fileJMenu.add(caseBoxMenuItem);

        ActionListener actionListener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                AbstractButton abstractButton = (AbstractButton) e.getSource();

                boolean selected = abstractButton.getModel().isSelected();

                String newlabel;

                Icon newIcon;

                if (selected){

                    newlabel = "Value-1";
                }
                else{
                    newlabel = "Value-2";
                }

                abstractButton.setText(newlabel);



            }
        };

        caseBoxMenuItem.addActionListener(actionListener);

        jFrame.setJMenuBar(jMenuBar);

        jFrame.setSize(350, 250);

        jFrame.setVisible(true);

    }

}
