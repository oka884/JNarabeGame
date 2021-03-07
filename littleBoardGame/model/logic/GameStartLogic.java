package littleBoardGame.model.logic;

import littleBoardGame.view.GameFrame;
import littleBoardGame.view.StartFrame;

public class GameStartLogic implements LittleBoardGameLogic{

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
