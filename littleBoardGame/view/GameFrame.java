package littleBoardGame.view;

import java.awt.BorderLayout;
import java.awt.Container;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SpringLayout;
import javax.swing.UIManager;

import littleBoardGame.controller.Controller;
import littleBoardGame.model.entity.Baggage;

/**
 * すべての基礎になるゲームフレーム
 * 
 * top,middle,bottom の3枚のパネルで構成され、SpringLayoutで大枠のレイアウトをしている
 */
public class GameFrame extends JFrame {

  JPanel topPanel;
  JPanel middlePanel;
  JPanel bottomPanel;

  /**
   * コンストラクタ
   */
  public GameFrame( Baggage bag ) {

    // look&feelをシステムの持つものにする
    setLAF();

    // 基礎部分
    setTitle("フレーム");
    setSize( 600, 400 );
    setLocationByPlatform( true );
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    // topPanel
    this.topPanel = new JPanel();
    

    // middlePanel
    this.middlePanel = new JPanel();


    // bottomPanel
    this.bottomPanel = new JPanel();


    // 3つのパネルをレイアウトするwrapパネルの作成と、最後にそれをコンテントペインに格納する
    this.createWrapPanel();
    
  }


  /**
   * look&feelをシステムの持つものにする
   */
  protected void name() {
    
  } void setLAF() {
		try {
			System.out.println( UIManager.getSystemLookAndFeelClassName() );
			UIManager.setLookAndFeel( UIManager.getSystemLookAndFeelClassName() );
		} catch ( Exception e ) {
			e.printStackTrace();
		}
	}
  
  /**
   * セッター
   * @param panel
   */
  public void addTopPanel( JPanel panel ){
    getContentPane().removeAll();
    this.topPanel = panel;
    this.createWrapPanel();
  }

  /**
   * セッター
   * @param panel
   */
  public void addMiddlePanel( JPanel panel ){
    getContentPane().removeAll();
    this.middlePanel = panel;
    this.createWrapPanel();
  }

  /**
   * セッター
   * @param panel
   */
  public void addBottomPanel( JPanel panel ){
    getContentPane().removeAll();
    this.bottomPanel = panel;
    this.createWrapPanel();
  }



  /**
   * 大枠のレイアウトを決めるラップパネルを作り、レイアウトを定め、コンテントペインに格納する
   * 
   * 大きくレイアウトを変えるときはこのメソッドをオーバーライドする
   */
  public void createWrapPanel(){
    JPanel wrapPanel = new JPanel();
    SpringLayout layout = new SpringLayout();
    wrapPanel.setLayout( layout );

    wrapPanel.add( this.topPanel );
    wrapPanel.add( this.middlePanel );
    wrapPanel.add( this.bottomPanel );

    layout.putConstraint( SpringLayout.NORTH, this.topPanel, 30, SpringLayout.NORTH, wrapPanel );
    layout.putConstraint( SpringLayout.WEST, this.topPanel, 250, SpringLayout.WEST, wrapPanel );
    layout.putConstraint( SpringLayout.EAST, this.topPanel, -250, SpringLayout.EAST, wrapPanel );

    layout.putConstraint( SpringLayout.NORTH, this.middlePanel, 30, SpringLayout.SOUTH, topPanel );
    layout.putConstraint( SpringLayout.WEST, this.middlePanel, 250, SpringLayout.WEST, wrapPanel );
    layout.putConstraint( SpringLayout.EAST, this.middlePanel, -250, SpringLayout.EAST, wrapPanel );

    layout.putConstraint( SpringLayout.SOUTH, this.bottomPanel, -30, SpringLayout.SOUTH, wrapPanel );
    layout.putConstraint(SpringLayout.WEST, this.bottomPanel, 230, SpringLayout.WEST, wrapPanel );
    layout.putConstraint(SpringLayout.EAST, this.bottomPanel, -230, SpringLayout.EAST, wrapPanel );

    Container contentPane = getContentPane();
    contentPane.add( wrapPanel, BorderLayout.CENTER);

  }

  
}
