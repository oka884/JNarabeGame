package src.startFrame;

import java.awt.LayoutManager;

import javax.swing.BoxLayout;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class NStartFrame extends StartFrame{

  public NStartFrame(){
    super();

    // topPanel //
    JLabel title = new JLabel( "nもくならべ" );
    title.setHorizontalAlignment( JLabel.CENTER );
    JPanel topPanel = new JPanel();
    topPanel.add( title );
    addTopPanel( topPanel );

    
    // middlePanel //
    // もく数
    JLabel labelVictoryConditions = new JLabel( "なんもくならべ？" );
    JComboBox comboBoxVictoryConditions = new JComboBox();

    // マス数
    JLabel labelRowsAndColums = new JLabel( "なんます？" );
    JComboBox comboBoxRowsAndColumns = new JComboBox();

    JPanel settingPanel = new JPanel();

    settingPanel.setLayout((LayoutManager) new BoxLayout( settingPanel, BoxLayout.PAGE_AXIS));

    settingPanel.add( labelVictoryConditions );
    settingPanel.add( comboBoxVictoryConditions );
    settingPanel.add( labelRowsAndColums );
    settingPanel.add( comboBoxRowsAndColumns );

    addMiddlePanel( settingPanel );


    // bottomPanel //
    setButtonGameStart( new NGameStart() );

    JPanel bottomPanel = new JPanel();
    bottomPanel.add( this.buttonGameStart );
    addBottomPanel( bottomPanel );

  }

  
}
