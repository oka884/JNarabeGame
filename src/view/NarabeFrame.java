package src.view;


import littleBoardGame.view.PlayFrame;
import littleBoardGame.view.StartFrame;




/**
 * ならべゲームフレームのクラス
 *
 */
public class NarabeFrame extends PlayFrame {

  
  /**
   * コンストラクタ
   * 
   * ゲーム画面のフレーム。ゲーム終了時に前の画面を可視化するために引数にstartFrameを取る
   */
  public NarabeFrame( StartFrame startFrame ) {

    super( startFrame );

  }
}
