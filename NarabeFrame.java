import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JPanel;
import java.awt.Container;
import java.awt.BorderLayout;

public class NarabeFrame extends JFrame {
  
  public NarabeFrame() {

    setTitle("n目ならべ");
    setBounds( 100, 100, 600, 400);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    JButton button1 = new JButton("button");
    button1.addActionListener( new GameStart() );

    JPanel board = new JPanel();

    board.add(button1);

    Container contentPane = getContentPane();
    contentPane.add( board, BorderLayout.CENTER);
  }
}
