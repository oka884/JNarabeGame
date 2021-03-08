package littleBoardGame.model.logic;

import littleBoardGame.model.entity.Baggage;
import littleBoardGame.view.GameFrame;
import littleBoardGame.view.StartFrame;

public class GameStartLogic extends LittleBoardGameLogic{


  public GameStartLogic(Baggage bag) {
    super(bag);
    //TODO Auto-generated constructor stub
  }

  @Override
  public GameFrame returnFrame() {
    StartFrame frame = new StartFrame( getBaggage() );
    return null;
  }

  @Override
  public String returnFrameName() {
    // TODO Auto-generated method stub
    return null;
  }
  
}
