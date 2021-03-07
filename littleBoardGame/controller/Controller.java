package littleBoardGame.controller;

import java.awt.event.ActionListener;
import java.awt.event.WindowListener;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.swing.JFrame;

import littleBoardGame.model.logic.CloseGameBoardLogic;
import littleBoardGame.model.logic.GameStartLogic;
import littleBoardGame.model.logic.StartUpLogic;
import littleBoardGame.view.GameFrame;
import littleBoardGame.view.StartFrame;

public class Controller {

  Map<String, GameFrame> frames = new HashMap<>();
  
  StartUpLogic startUpLogic;
  GameStartLogic gameStartLogic;
  CloseGameBoardLogic closeGameBoardLogic;



  public ActionListener buttonPush( int ID, StartFrame frame){
    return new GameStartLogic( frame );
  }

  public WindowListener closeWindow( int ID, StartFrame frame){
    return new CloseGameBoardLogic( frame );
  }

  public void run(){
    StartUpLogic startUpLogic = new StartUpLogic();
    this.frames.put( startUpLogic.returnFrameName(), startUpLogic.returnFrame() );
  }
  
}
