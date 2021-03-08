package littleBoardGame.model.logic;

import littleBoardGame.controller.Controller;
import littleBoardGame.view.GameFrame;
import littleBoardGame.view.StartFrame;
import src.view.NStartFrame;

public class StartUpLogic extends LittleBoardGameLogic{

  public StartUpLogic( Controller c ){
    super( c );
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
