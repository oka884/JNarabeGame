package src.startFrame;

import java.awt.Container;
import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JComponent;
import javax.swing.JPanel;
import javax.swing.SpringLayout;
import javax.swing.UIManager;


/**
 * top,middle,bottom の3枚のパネルで構成されるゲームスタートフレームの抽象クラス
 * 
 *
 */
abstract public class StartFrame extends JFrame {

  JPanel topPanel;
  JPanel middlePanel;
  JPanel bottomPanel;
  GameStartButton buttonGameStart;

  /**
   * コンストラクタ
   */
  public StartFrame() {

    // look&feelをシステムの持つものにする
    setLAF();

    // 基礎部分
    setTitle("フレーム");
    setSize( 600, 400 );
    setLocationByPlatform( true );
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    // topPanel
    createTopPanel();
    

    // middlePanel
    createMiddlePanel();


    // bottomPanel
    createBottomPanel();


    // 3つのパネルをレイアウトするwrapパネルの作成と、最後にそれをコンテントペインに格納する
    this.createWrapPanel();
    
  }

  /**
   * look&feelをシステムの持つものにする
   */
  void setLAF() {
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
  public void setTopPanel( JPanel panel ){
    this.topPanel = panel;
  }

  /**
   * セッター
   * @param panel
   */
  public void setMiddlePanel( JPanel panel ){
    this.middlePanel = panel;
  }

  /**
   * セッター
   * @param panel
   */
  public void setBottomPanel( JPanel panel ){
    this.bottomPanel = panel;
  }

  /**
   * セッター
   * @param gameStartButton
   */
  public void setButtonGameStart( GameStartButton button ){
    this.buttonGameStart = button;
    button.setStartFrame( this );
  }

  ///// ここからがパネル生成メソッド
  ///// それぞれ パネル精製後は this.top,middle,bottomPanel に格納をするように

  /**
   * topパネルのクラス。オーバーライドも前提としている
   * 
   */
  public void createTopPanel(){

    JLabel title = new JLabel( "タイトル" );
    title.setHorizontalAlignment( JLabel.CENTER );
    this.topPanel = new JPanel();
    this.topPanel.add( title );
  }

  /**
   * middlePanelのクラス。スタート画面で様々な操作をさせることを前提とした抽象クラス
   * 
   * 作ったパネルを this.middlePanel に格納するように
   */
  abstract public void createMiddlePanel();

  /**
   * bottomPanelのクラス。
   * 
   */
  abstract public void createBottomPanel();


  /**
   * 大枠のレイアウトを決めるラップパネルを作り、レイアウトを定め、コンテントペインに格納する
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
