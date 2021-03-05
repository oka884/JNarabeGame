package src.model.logic;

import littleBoardGame.model.logic.GameStartLogic;
import littleBoardGame.view.StartFrame;
import src.view.NarabeFrame;

public class NGameStartLogic extends GameStartLogic {

  public NGameStartLogic( StartFrame frame ){
    super( frame );
  }

  @Override
  public void createGameFrameAndStartGame(){

    NarabeFrame frame = new NarabeFrame( getStartFrame() );
    frame.setVisible(true);
  };

}
