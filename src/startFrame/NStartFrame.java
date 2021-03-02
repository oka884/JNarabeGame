package src.startFrame;

import java.awt.LayoutManager;

import javax.swing.BoxLayout;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class NStartFrame extends StartFrame{

  public NStartFrame(){
    super();
  }

  @Override
  public void createTopPanel() {
    JLabel title = new JLabel( "nもくならべ" );
    title.setHorizontalAlignment( JLabel.CENTER );
    this.topPanel = new JPanel();
    this.topPanel.add( title );
  }

  @Override
  public void createMiddlePanel() {
    
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

    this.setMiddlePanel( settingPanel );

  }

  @Override
  public void createBottomPanel() {

    setButtonGameStart( new NGameStart() );

    this.bottomPanel = new JPanel();
    this.bottomPanel.add( this.buttonGameStart );

  }
  
}
