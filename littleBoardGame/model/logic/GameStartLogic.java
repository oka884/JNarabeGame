package littleBoardGame.model.logic;

import littleBoardGame.controller.Controller;
import littleBoardGame.view.GameFrame;
import littleBoardGame.view.StartFrame;

public class GameStartLogic extends LittleBoardGameLogic{

  GameStartLogic( Controller c ){
    super( c );
  }

  @Override
  public GameFrame returnFrame() {
    StartFrame frame = new StartFrame();
    return null;
  }

  @Override
  public String returnFrameName() {
    // TODO Auto-generated method stub
    return null;
  }
  
}
