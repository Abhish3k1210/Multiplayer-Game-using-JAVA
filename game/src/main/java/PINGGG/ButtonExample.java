import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonExample {
    public void createAndShowGUI() {
        JFrame frame = new JFrame("Button Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        JButton button1 = new JButton("Pong Game");
        button1.setBounds(600, 250, 150, 40);
        button1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                GameFrame frame = new GameFrame();
            }
        });
        
        JButton button2 = new JButton("TicTacToe");
        button2.setBounds(600, 200, 150, 40);
        button2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
               tictactoe tictactoe = new tictactoe();
            }
        });
        
        frame.add(button1);
        frame.add(button2);
        
        frame.setSize(1500, 700);
        frame.setLayout(null);
        frame.setVisible(true);
    }
}
