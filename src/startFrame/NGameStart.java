package src.startFrame;

import src.gameFrame.NarabeFrame;

public class NGameStart extends GameStartButton{

  public NGameStart(){
    super( "GameStart" );
  }

  @Override
  public void createGameFrame(){

    NarabeFrame frame = new NarabeFrame( this.startFrame );
    frame.setVisible(true);
  };

}
