package littleBoardGame.model.logic;

import littleBoardGame.model.entity.Baggage;
import littleBoardGame.view.GameFrame;
import littleBoardGame.view.StartFrame;
import src.view.NStartFrame;

public class StartUpLogic extends LittleBoardGameLogic{

  public StartUpLogic( Baggage bag ){
    super( bag );
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
