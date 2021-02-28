package startFrame;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;

import gameFrame.*;

/**
 * ゲームスタートゲームをスタートさせるクラス
 */
public class GameStart implements ActionListener {

  /**
   * ゲームスタートボタン押下
   * 
   */
  @Override
  public void actionPerformed(ActionEvent e) {

    NarabeFrame frame = new NarabeFrame();
    frame.setVisible( true );

    this.startFrame.setVisible( false );

  }
}
