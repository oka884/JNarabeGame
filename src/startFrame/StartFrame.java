package src.startFrame;

import java.awt.Container;
import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JPanel;
import javax.swing.SpringLayout;
import javax.swing.UIManager;


/**
 *
 */
public class StartFrame extends JFrame {
  
  /**
   *
   */
  public StartFrame() {

    // システムの持つLAFにする
    setLAF();

    // 基礎
    setTitle("n目ならべ");
    setSize( 600, 400 );
    setLocationByPlatform( true );
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    // タイトル
    JLabel title = new JLabel( "n目並べ" );
    title.setHorizontalAlignment( JLabel.CENTER );

    // もく数
    JLabel labelVictoryConditions = new JLabel( "なんもくならべ？" );
    JComboBox comboBoxVictoryConditions = new JComboBox();

    // マス数
    JLabel labelRowsAndColums = new JLabel( "なんます？" );
    JComboBox comboBoxRowsAndColumns = new JComboBox();

    // gamesetting入力パネル
    JPanel panelInputSetting = new JPanel();
    panelInputSetting.setLayout(new BoxLayout(panelInputSetting, BoxLayout.PAGE_AXIS));

    panelInputSetting.add( labelVictoryConditions );
    panelInputSetting.add( comboBoxVictoryConditions );
    panelInputSetting.add( labelRowsAndColums );
    panelInputSetting.add( comboBoxRowsAndColumns );

    // GameStartボタン
    JButton buttonGameStart = new JButton( "GameStart" );
    buttonGameStart.addActionListener( new GameStart( this ) );

    // wrapパネル
    JPanel wrapPanel = new JPanel();
    SpringLayout layout = new SpringLayout();
    wrapPanel.setLayout( layout );

    wrapPanel.add( title );
    wrapPanel.add( panelInputSetting );
    wrapPanel.add( buttonGameStart );

    layout.putConstraint( SpringLayout.NORTH, title, 30, SpringLayout.NORTH, wrapPanel );
    layout.putConstraint( SpringLayout.WEST, title, 250, SpringLayout.WEST, wrapPanel );
    layout.putConstraint( SpringLayout.EAST, title, -250, SpringLayout.EAST, wrapPanel );

    layout.putConstraint( SpringLayout.NORTH, panelInputSetting, 30, SpringLayout.SOUTH, title );
    layout.putConstraint( SpringLayout.WEST, panelInputSetting, 250, SpringLayout.WEST, wrapPanel );
    layout.putConstraint( SpringLayout.EAST, panelInputSetting, -250, SpringLayout.EAST, wrapPanel );

    layout.putConstraint( SpringLayout.SOUTH, buttonGameStart, -30, SpringLayout.SOUTH, wrapPanel );
    layout.putConstraint(SpringLayout.WEST, buttonGameStart, 250, SpringLayout.WEST, wrapPanel );
    layout.putConstraint(SpringLayout.EAST, buttonGameStart, -250, SpringLayout.EAST, wrapPanel );

    Container contentPane = getContentPane();
    contentPane.add( wrapPanel, BorderLayout.CENTER);
  }

  // システムの持つLAFにする
  void setLAF() {
		try {
			System.out.println( UIManager.getSystemLookAndFeelClassName() );
			UIManager.setLookAndFeel( UIManager.getSystemLookAndFeelClassName() );
		} catch ( Exception e ) {
			e.printStackTrace();
		}
	}

}
