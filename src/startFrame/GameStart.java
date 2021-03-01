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
   * このActionListenerのボタンがあるフレームをフィールドに持たせる
   */
  private JFrame startFrame;

  /**
   * コンストラクタ
   */
  public GameStart( JFrame frame ){
    this.startFrame = frame;
  }

  /**
   * セッター
   * 
   * @param startFrame
   */
  private public void setStartFrame( JFrame startFrame ) {
    this.startFrame = startFrame;
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
