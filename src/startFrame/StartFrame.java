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
abstract public class StartFrame extends JFrame {

  /**
   *
   */
  public StartFrame() {

    // look&feelをシステムの持つものにする
    setLAF();

    // 基礎部分
    setTitle("");
    setSize( 600, 400 );
    setLocationByPlatform( true );
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    // タイトル
    JLabel title = new JLabel( "n目並べ" );
    title.setHorizontalAlignment( JLabel.CENTER );

    // // もく数
    // JLabel labelVictoryConditions = new JLabel( "なんもくならべ？" );
    // JComboBox comboBoxVictoryConditions = new JComboBox();

    // // マス数
    // JLabel labelRowsAndColums = new JLabel( "なんます？" );
    // JComboBox comboBoxRowsAndColumns = new JComboBox();

    // gamesetting入力パネル
    JPanel panelSettingInput = new PanelSettingInput();

    // panelInputSetting.setLayout(new BoxLayout(panelInputSetting, BoxLayout.PAGE_AXIS));

    // panelInputSetting.add( labelVictoryConditions );
    // panelInputSetting.add( comboBoxVictoryConditions );
    // panelInputSetting.add( labelRowsAndColums );
    // panelInputSetting.add( comboBoxRowsAndColumns );

    // GameStartボタン
    GameStartButton buttonGameStart = new ButtonGameStart();

    // wrapパネル
    JPanel wrapPanel = new JPanel();
    SpringLayout layout = new SpringLayout();
    wrapPanel.setLayout( layout );

    wrapPanel.add( title );
    wrapPanel.add( panelSettingInput );
    wrapPanel.add( buttonGameStart );

    layout.putConstraint( SpringLayout.NORTH, title, 30, SpringLayout.NORTH, wrapPanel );
    layout.putConstraint( SpringLayout.WEST, title, 250, SpringLayout.WEST, wrapPanel );
    layout.putConstraint( SpringLayout.EAST, title, -250, SpringLayout.EAST, wrapPanel );

    layout.putConstraint( SpringLayout.NORTH, panelSettingInput, 30, SpringLayout.SOUTH, title );
    layout.putConstraint( SpringLayout.WEST, panelSettingInput, 250, SpringLayout.WEST, wrapPanel );
    layout.putConstraint( SpringLayout.EAST, panelSettingInput, -250, SpringLayout.EAST, wrapPanel );

    layout.putConstraint( SpringLayout.SOUTH, buttonGameStart, -30, SpringLayout.SOUTH, wrapPanel );
    layout.putConstraint(SpringLayout.WEST, buttonGameStart, 250, SpringLayout.WEST, wrapPanel );
    layout.putConstraint(SpringLayout.EAST, buttonGameStart, -250, SpringLayout.EAST, wrapPanel );

    Container contentPane = getContentPane();
    contentPane.add( wrapPanel, BorderLayout.CENTER);
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

  abstract public class PanelSettingInput extends JPanel{
    // abstract public PanelSettingInput();
  };

  abstract public class ButtonGameStart extends GameStartButton{
    // abstract public ButtonGameStart();
  };


}
