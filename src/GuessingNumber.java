import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;

public class GuessingNumber {
    private JButton btnOk;
    private JPanel panel;
    private JTextField txtAnswer;
    private JLabel lblGameName;
    private JLabel lblExplanation;
    private JLabel lblTxtArea;

    public GuessingNumber() {
        btnOk.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                txtAnswer.setText("Did it");
            }
        });
    }

    public static void main(String[] args) {
        JFrame gameFrame = new JFrame("GuessingNumber");
        gameFrame.setContentPane(new GuessingNumber().panel);
        gameFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        gameFrame.setVisible(true);
    }
}
