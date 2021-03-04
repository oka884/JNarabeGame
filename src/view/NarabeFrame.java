package src.view;

import javax.swing.JFrame;
import javax.swing.JPanel;

import littleBoardGame.logic.CloseGameBoardLogic;

import java.awt.Container;
import java.awt.BorderLayout;


/**
 * ゲーム画面フレームのクラス
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
    setBounds( 200, 200, 800, 800);
    setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    setLocationRelativeTo(null);

    this.addWindowListener( new CloseGameBoardLogic( startFrame ) );

    JPanel board = new JPanel();

    Container contentPane = getContentPane();
    contentPane.add( board, BorderLayout.CENTER);

  }
}
