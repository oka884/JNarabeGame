package littleBoardGame.model.exception;


public class CoordinateOutsideBoardException extends Exception {

  public CoordinateOutsideBoardException(){
    super( "Boardの外の座標です" );
  }
  
}
