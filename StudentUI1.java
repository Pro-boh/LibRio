import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;

public class StudentUI1 extends JFrame {
    public StudentUI1() {
        setTitle("Student Information");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);

        JLabel label = new JLabel("Student Information System", SwingConstants.CENTER);
        label.setFont(new Font("Times New Roman", Font.BOLD, 20));
        add(label);
    }
}
