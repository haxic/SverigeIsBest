import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.UIManager;
import javax.swing.WindowConstants;
import java.awt.Checkbox;
import java.awt.FlowLayout;

public class Main {

    public static void main(String[] args) {
        JButton jxButton = new JButton("HEJSA");
        UIManager.put("Synthetica.window.decoration", Boolean.FALSE);
        JFrame frame = new JFrame("JFrame Example");
        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout());
        JLabel label = new JLabel("This is a label!");
        JButton test = new JButton("Test JYButton");
        JButton button = new JButton();
        button.setText("Press me");
        panel.add(label);
        panel.add(button);
        panel.add(test);
        panel.add(jxButton);
        panel.add(new Checkbox());
        frame.add(panel);
        frame.setSize(300, 300);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
