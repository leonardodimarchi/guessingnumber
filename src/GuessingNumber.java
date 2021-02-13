import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Dimension;

public class GuessingNumber {
    private JButton btnOk;
    private JPanel panel;
    private JTextField txtAnswer;
    private JLabel lblGameName;
    private JLabel lblExplanation;
    private JLabel lblTxtArea;
    private JLabel lblStatus;
    private JLabel lblScore;

    public GuessingNumber() {
        RandomNumber gameNumbers = new RandomNumber(1,10);

        btnOk.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                gameNumbers.rollNumber();

                try{
                    int userAnswer = Integer.parseInt(txtAnswer.getText());

                    if(userAnswer == gameNumbers.getCurrentNumber()){
                        gameNumbers.addScore();
                        lblStatus.setText("You did it !");
                        lblExplanation.setText("It generated again ! COME ON...");
                        lblScore.setVisible(true);
                        lblScore.setText("Score: "+ gameNumbers.getCountScore());
                    }else{
                        lblStatus.setText("Try it again !");
                        if (gameNumbers.getCountScore() > 0) {
                            lblExplanation.setText("Come on... You can do it !");
                        } else {
                            lblExplanation.setText("Nope.. Try it again !");
                        }
                    }

                }catch(Exception e){
                    e.printStackTrace();
                }


            }
        });
    }

    public static void main(String[] args) {
        JFrame gameFrame = new JFrame("GuessingNumber");
        gameFrame.setContentPane(new GuessingNumber().panel);
        gameFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        gameFrame.setSize(new Dimension(500, 300));
        gameFrame.setVisible(true);
    }
}
