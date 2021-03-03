package src.gameFrame;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JPanel;
import java.awt.Container;
import java.awt.BorderLayout;


/**
 *
 */
public class NarabeFrame extends JFrame {
  
  /**
   * コンストラクタ
   * 
   * ゲーム画面のフレーム。ゲーム終了時に前の画面を可視化するために引数にstartFrameを取る
   */
  public NarabeFrame( JFrame startFrame ) {

    setTitle("n目ならべ");
    setBounds( 200, 200, 800, 600);
    setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    setLocationRelativeTo(null);

    this.addWindowListener( new CloseBoard( startFrame ) );

    JPanel board = new JPanel();

    Container contentPane = getContentPane();
    contentPane.add( board, BorderLayout.CENTER);

  }
}
