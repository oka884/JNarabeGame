package gameFrame;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JPanel;
import java.awt.Container;
import java.awt.BorderLayout;

import startFrame.*;


/**
 *
 */
public class NarabeFrame extends JFrame {
  
  /**
   * コンストラクタ
   *
   */
  public NarabeFrame( StartFrame startFrame ) {

    setTitle("n目ならべ");
    setBounds( 100, 100, 600, 400);
    setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

    this.addWindowListener( new CloseBoard( startFrame ) );

  }
}
