import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;

public class CheckinUI extends JFrame {
    public CheckinUI() {
        setTitle("Check-In Book");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);

        JLabel label = new JLabel("Check-In Book System", SwingConstants.CENTER);
        label.setFont(new Font("Times New Roman", Font.BOLD, 20));
        add(label);
    }
}
