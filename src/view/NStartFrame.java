package src.view;

import java.awt.LayoutManager;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;

import littleBoardGame.view.StartFrame;
import src.model.logic.NGameStartLogic;

public class NStartFrame extends StartFrame{

  public NStartFrame(){
    super();

    // topPanel //
    JPanel topPanel = new JPanel();

    JLabel title = new JLabel( "nもくならべ" );
    title.setHorizontalAlignment( JLabel.CENTER );
    
    topPanel.add( title );
    addTopPanel( topPanel );

    
    // middlePanel //
    JPanel settingPanel = new JPanel();

    // もく数の入力
    JLabel labelVictoryConditions = new JLabel( "なんもくならべ？" );
    JComboBox comboBoxVictoryConditions = new JComboBox();

    // マス数の入力
    JLabel labelRowsAndColums = new JLabel( "なんます？" );
    JComboBox comboBoxRowsAndColumns = new JComboBox();

    settingPanel.setLayout((LayoutManager) new BoxLayout( settingPanel, BoxLayout.PAGE_AXIS));

    settingPanel.add( labelVictoryConditions );
    settingPanel.add( comboBoxVictoryConditions );
    settingPanel.add( labelRowsAndColums );
    settingPanel.add( comboBoxRowsAndColumns );

    addMiddlePanel( settingPanel );


    // bottomPanel //
    JPanel bottomPanel = new JPanel();

    JButton startButton = new JButton( "GameStart" );
    startButton.addActionListener( new NGameStartLogic( this ) );

    bottomPanel.add( startButton );
    addBottomPanel( bottomPanel );

  }
  
}
