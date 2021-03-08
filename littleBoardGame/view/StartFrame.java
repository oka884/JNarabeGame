package littleBoardGame.view;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JPanel;


import littleBoardGame.controller.Controller;
import littleBoardGame.model.entity.Baggage;
import littleBoardGame.model.logic.GameStartButtonListener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;



/**
 * GameFrameを継承したスタートフレームのクラス
 * 
 *
 */
abstract public class StartFrame extends GameFrame {

  /**
   * コンストラクタ
   */
  public StartFrame( Baggage bag ) {

    super( bag );

    // 基礎部分の変更
    setTitle("スタートフレーム");
    setSize( 600, 400 );
    setLocationByPlatform( true );
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    // topPanel
    JPanel tPanel = new JPanel();

    JLabel title = new JLabel( "タイトル" );
    title.setHorizontalAlignment( JLabel.CENTER );

    tPanel.add( title );

    addTopPanel( tPanel );
    


    // bottomPanel
    JPanel bPanel = new JPanel();

    JButton startButton = new JButton( "button" );
    startButton.addActionListener( new GameStartButtonListener( getBaggage().getFrame( "gameFrame" ) );

    bPanel.add( startButton );

    addBottomPanel( bPanel );

    
  }

}
