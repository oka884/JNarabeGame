package littleBoardGame.model.logic;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import littleBoardGame.view.StartFrame;



/**
 * ボタンが押された際にそのフレームを不可視にするボタンのロジックです。
 * 
 * 
 */
public class GameStartLogic implements ActionListener{

  /**
   * このボタンの親であるフレームをフィールドに持たせる
   */
  StartFrame startFrame = null;

  /**
   * コンストラクタ
   */
  public GameStartLogic( StartFrame frame ){
    setStartFrame( frame );
  }

  /**
   * セッター
   * 
   * @param startFrame
   */
  public void setStartFrame(StartFrame frame) {
    this.startFrame = frame;
  }

  /**
   * ゲッター
   * 
   * @return
   */
  public StartFrame getStartFrame(){
    return this.startFrame;
  }

  /**
   * ゲームスタートボタン押下
   * 
   */
  @Override
  public void actionPerformed(ActionEvent e) {

    // 新しくウィンドウを作る
    createGameFrameAndStartGame();

    // スタート画面を隠す このクラスのメイン
    this.startFrame.setVisible( false );
  }

  /**
   * ゲーム画面へ推移のための抽象メソッド
   */
  public void createGameFrameAndStartGame(){};

}
