package littleBoardGame.view;

import javax.swing.JFrame;
import javax.swing.JPanel;

import littleBoardGame.controller.Controller;
import littleBoardGame.model.entity.Baggage;



/**
 * ゲームフレームのクラス
 *
 */
public class PlayFrame extends GameFrame {

  /**
   * コンストラクタ
   * 
   * ゲーム画面のフレーム。ゲーム終了時に前の画面を可視化するために引数にstartFrameを取る
   */
  public PlayFrame( Baggage bag ) {

    super( bag );

    // 基礎部分の変更
    setTitle("プレイフレーム");
    setSize( 800, 800);
    setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    setLocationRelativeTo(null);

    this.addWindowListener( this.controller.closeWindow( 1, startFrame ) );


    // topPanel
    JPanel tPanel = new JPanel();

    

    // middlePanel
    JPanel mPanel = new JPanel();
    JPanel board = new JPanel();


    // bottomPanel
    JPanel bPanel = new JPanel();


  }
}
