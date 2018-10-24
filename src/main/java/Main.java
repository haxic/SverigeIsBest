import de.javasoft.plaf.synthetica.SyntheticaBlackStarLookAndFeel;
import de.javasoft.plaf.synthetica.SyntheticaPlainLookAndFeel;
import de.javasoft.plaf.synthetica.SyntheticaStandardLookAndFeel;
import de.javasoft.swing.JYButton;
import de.javasoft.swing.JYSwitchButton;
import org.jdesktop.swingx.JXButton;

import javax.swing.*;
import java.awt.*;

public class Main {


    public static void main(String[] args) {


        JXButton jxButton = new JXButton("HEJSA");



        UIManager.put("Synthetica.window.decoration", Boolean.FALSE);
//        try {
//            UIManager.setLookAndFeel(new SyntheticaStandardLookAndFeel());
//        } catch (Exception e) {
//            e.printStackTrace();
//        }

//        try {
//            UIManager.setLookAndFeel(new SyntheticaBlackStarLookAndFeel());
//        } catch (Exception e) {
//            e.printStackTrace();
//        }

        try {
            UIManager.setLookAndFeel(new SyntheticaPlainLookAndFeel());
        } catch (Exception e) {
            e.printStackTrace();
        }


        JFrame frame = new JFrame("JFrame Example");

        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout());

        JLabel label = new JLabel("This is a label!");

        JYButton test = new JYButton("Test JYButton");

        JButton button = new JButton();
        button.setText("Press me");

        panel.add(label);
        panel.add(button);
        panel.add(test);
        panel.add(jxButton);


        JComboBox<String> stringJComboBox = new JComboBox<>(new String[]{"test1", "test2"});

        panel.add(stringJComboBox);

        panel.add(new Checkbox());


        JYSwitchButton switchButton2 = new JYSwitchButton("JYSwitchButton deselected", false);
        switchButton2.setOnText("On");
        switchButton2.setOffText("Off");
//        switchButton2.setTextGap(12);
        panel.add(switchButton2);

        frame.add(panel);
        frame.setSize(300, 300);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setVisible(true);

    }


}
