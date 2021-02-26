import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GameStart implements ActionListener {

  @Override
  public void actionPerformed(ActionEvent e) {

    NarabeFrame frame = new NarabeFrame();
    frame.setVisible(true);

  }
}
