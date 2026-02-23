import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;

public class StaffUI extends JFrame {
    public StaffUI() {
        setTitle("Staff Information");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);

        JLabel label = new JLabel("Staff Information System", SwingConstants.CENTER);
        label.setFont(new Font("Times New Roman", Font.BOLD, 20));
        add(label);
    }
}
