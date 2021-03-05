package littleBoardGame.model.entity;

import java.util.ArrayList;
import java.util.List;

import littleBoardGame.model.exception.CoordinateOutsideBoardException;

/**
 * 盤面の一マスのクラス
 */
public class Square implements Cloneable {

  Coordinate x;
  Coordinate y;

  /**
   * コンストラクタ
   * 
   * @param x
   * @param y
   * @throws CoordinateOutsideBoardException
   */
  public Square( int xCoordinate, int yCoordinate ) throws CoordinateOutsideBoardException {
    this.x = new Coordinate();
    x.setXCoordinate( xCoordinate );
    this.y = new Coordinate();
    y.setYCoordinate( yCoordinate );
  }

  /**
   * コンストラクタ
   */
  public Square(){
    this.x = new Coordinate();
    this.y = new Coordinate();
  }

  /**
   * クローンメソッド
   */
  @Override
  public Square clone() throws CloneNotSupportedException {
    Square clone = (Square) super.clone();
    return clone;
  }

  /**
   * セッター
   * 
   * @param x
   * @param y
   * @throws CoordinateOutsideBoardException
   */
  public void setXY(int xCoordinate, int yCoordinate) throws CoordinateOutsideBoardException {
    this.setX( xCoordinate );
    this.setY( yCoordinate );
  }

  /**
   * セッター
   * 
   * @param x
   * @throws CoordinateOutsideBoardException
   */
  public void setX( int xCoordinate ) throws CoordinateOutsideBoardException {
    x.setXCoordinate( xCoordinate );
  }

  /**
   * セッター
   * 
   * @param y
   * @throws CoordinateOutsideBoardException
   */
  public void setY( int yCoordinate ) throws CoordinateOutsideBoardException {
    y.setYCoordinate( yCoordinate );
  }

  /**
   * ゲッター
   */
  public Coordinate getX(){
    return this.x;
  }

  /**
   * ゲッター
   */
  public Coordinate getY(){
    return this.y;
  }

  /**
   * 引数に取ったスクウェアオブジェクトが入った盤面の配列を返すメソッド
   * 
   * @param square
   * @throws CoordinateOutsideBoardException
   * @throws CloneNotSupportedException
   */
  public List<List> createGameBoardArray( Square square )
      throws CoordinateOutsideBoardException, CloneNotSupportedException {

    List<List> lineArray = new ArrayList<>();
    
    for ( int y = 0 ; y < BoardSetting.getROWS() ; y++ ){

      List< ? extends Square > squareArray = new ArrayList<>();

      for ( int x = 0 ; x < BoardSetting.getCOLUMNS() ; x++ ){

        squareArray.add( square.clone() );
        squareArray.get( x ).setXY( x, y );
      }

      lineArray.add( squareArray );
    }

    return lineArray;
  }


  
}
