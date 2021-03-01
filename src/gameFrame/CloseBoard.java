package src.gameFrame;

import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JFrame;



/**
 * ゲーム画面を閉じる際のクラス
 * 
 */
public class CloseBoard implements WindowListener {

  /**
   * コンストラクタ
   */
  private JFrame startFrame;

  public CloseBoard( JFrame frame ){
    this.startFrame = frame;
  }


  /**
   * ウィンドウクローズ時
   */
  @Override
  public void windowClosed(WindowEvent e) {

    this.startFrame.setVisible( true );

  }

  @Override
  public void windowOpened(WindowEvent e) {
    // TODO Auto-generated method stub

  }

  @Override
  public void windowClosing(WindowEvent e) {
    // TODO Auto-generated method stub

  }

  @Override
  public void windowIconified(WindowEvent e) {
    // TODO Auto-generated method stub

  }

  @Override
  public void windowDeiconified(WindowEvent e) {
    // TODO Auto-generated method stub

  }

  @Override
  public void windowActivated(WindowEvent e) {
    // TODO Auto-generated method stub

  }

  @Override
  public void windowDeactivated(WindowEvent e) {
    // TODO Auto-generated method stub

  }

}
