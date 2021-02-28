package gameFrame;

import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JFrame;

import startFrame.*;

/**
 * ゲーム画面を閉じる際のクラス
 * 
 */
public class CloseBoard implements WindowListener {

  private StartFrame startFrame;

  /**
   * コンストラクタ
   * 
   */
  public CloseBoard ( JFrame startFrame ){
    this.startFrame = startFrame;
  }
  
  /**
   * ウィンドウクローズ時
   */
  @Override
  public void windowClosing(WindowEvent e) {

    this.startFrame.setVisible(true);
  }
}
