package src.startFrame;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;

import src.gameFrame.*;

/**
 * ゲームスタートゲームをスタートさせるクラス
 */
public class GameStart implements ActionListener {

  /**
   * コンストラクタ
   */
  private JFrame startFrame;

  public GameStart( JFrame frame ){
    this.startFrame = frame;
  }

  /**
   * ゲームスタートボタン押下
   * 
   */
  @Override
  public void actionPerformed(ActionEvent e) {

    // 新しくウィンドウを作る
    NarabeFrame frame = new NarabeFrame( this.startFrame );
    frame.setVisible( true );

    // スタート画面を隠す
    this.startFrame.setVisible( false );

  }
}
