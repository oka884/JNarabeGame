package src.startFrame;

import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import src.gameFrame.*;

/**
 * ボタンが押された際にそのフレームを不可視にするボタンです。
 * 
 * 
 */
public class GameStartButton extends JButton implements ActionListener{

  /**
   * このボタンの親であるフレームをフィールドに持たせる
   */
  JFrame startFrame = null;

  /**
   * コンストラクタ
   * 
   * 引数に与えられたframeはボタン押下に不可視にされます。
   * 
   * @param text
   * @param startFrame
   */
  public GameStartButton( String text, JFrame frame ){
    super( text );
    addActionListener( this );
    this.startFrame = frame;
  }

  /**
   * コンストラクタ
   * 
   * 引数に与えられたframeはボタン押下に不可視にされます。
   * 
   * @param startFrame
   */
  public GameStartButton( JFrame frame ){
    super();
    addActionListener( this );
    this.startFrame = frame;
  }

  /**
   * コンストラクタ
   * 
   * 引数に与えられたframeはボタン押下に不可視にされます。
   * 
   * @param startFrame
   */
  public GameStartButton( String text ){
    super( text );
    addActionListener( this );
  }

  /**
   * コンストラクタ
   * 
   * 引数に与えられたframeはボタン押下に不可視にされます。
   * 
   * @param startFrame
   */
  public GameStartButton(){
    super();
    addActionListener( this );
  }

  /**
   * セッター
   * @param fram
   */
  public void setStartFrame(JFrame sf) {
    this.startFrame = sf;
  }

  /**
   * ゲームスタートボタン押下
   * 
   */
  @Override
  public void actionPerformed(ActionEvent e) {

    // 新しくウィンドウを作る
    createGameFrame();

    // スタート画面を隠す
    this.startFrame.setVisible( false );
  }

  /**
   * ゲーム画面へ推移のための抽象メソッド
   */
  public void createGameFrame(){};

}
