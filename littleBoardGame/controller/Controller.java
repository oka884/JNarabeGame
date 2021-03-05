package littleBoardGame.controller;

import java.awt.event.ActionListener;
import java.awt.event.WindowListener;
import java.util.List;

import javax.swing.JFrame;

import littleBoardGame.model.logic.CloseGameBoardLogic;
import littleBoardGame.model.logic.GameStartLogic;
import littleBoardGame.model.logic.StartUpLogic;
import littleBoardGame.view.StartFrame;

public class Controller {

  List<JFrame> frame;

  public ActionListener buttonPush( int ID, StartFrame frame){
    return new GameStartLogic( frame );
  }

  public WindowListener closeWindow( int ID, StartFrame frame){
    return new CloseGameBoardLogic( frame );
  }

  public void run(){
    StartUpLogic startUpLogic = new StartUpLogic();
    startUpLogic.
  }
  
}
