import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;

public class BookUI extends JFrame {
    public BookUI() {
        setTitle("Book Information");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);

        JLabel label = new JLabel("Book Information System", SwingConstants.CENTER);
        label.setFont(new Font("Times New Roman", Font.BOLD, 20));
        add(label);
    }
}
