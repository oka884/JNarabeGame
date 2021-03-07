package littleBoardGame.model.logic;

import littleBoardGame.view.GameFrame;
import littleBoardGame.view.StartFrame;
import src.view.NStartFrame;

public class StartUpLogic implements LittleBoardGameLogic{

  public StartUpLogic(){

    
  }
  
  @Override
  public GameFrame returnFrame(){
    StartFrame frame = new NStartFrame();
    frame.setVisible(true);
    return frame;    
  }

  @Override
  public String returnFrameName(){
    return "startFrame";
  }
}
