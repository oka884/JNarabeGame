package littleBoardGame.controller;

import java.awt.event.ActionListener;
import java.awt.event.WindowListener;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.swing.JFrame;

import littleBoardGame.model.entity.Baggage;
import littleBoardGame.model.logic.CloseGameBoardLogic;
import littleBoardGame.model.logic.GameStartLogic;
import littleBoardGame.model.logic.LittleBoardGameLogic;
import littleBoardGame.model.logic.StartUpLogic;
import littleBoardGame.view.GameFrame;
import littleBoardGame.view.StartFrame;

public class Controller {

  /**
   * フレームをハッシュマップでもたせる
   */
  Map<String, GameFrame> frames = new HashMap<>();
 
  /**
   * ロジックをもたせたほうがいいかなと考えるがハッシュマップで持たせるかそれぞれ持たせるかを考え中
   */
  Map<String, LittleBoardGameLogic> logics = new HashMap<>();
  
  StartUpLogic startUpLogic;
  GameStartLogic gameStartLogic;
  CloseGameBoardLogic closeGameBoardLogic;



  public ActionListener buttonPush( int id, StartFrame frame){
    
    return new GameStartLogic( frame );
  }

  public WindowListener closeWindow( int ID, StartFrame frame){
    return new CloseGameBoardLogic( frame );
  }

  public void run(){
    StartUpLogic startUpLogic = new StartUpLogic( new Baggage() );
    this.frames.put( "startFrame", startUpLogic.returnFrame() );
  }

  public void buttonPush( int id, Baggage baggage ){

    switch( id ){

      case ListenerID.ID_BUTTON_GAMESTART:
        GameStartLogic startLogic = new GameStartLogic( baggage ); 
        break;

    }
    

  }
  
}
