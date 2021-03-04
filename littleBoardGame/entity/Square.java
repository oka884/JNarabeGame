package littleBoardGame.entity;

import java.util.ArrayList;
import java.util.List;

import littleBoardGame.exception.CoordinateOutsideBoardException;

/**
 * 盤面の一マスのクラス
 */
public class Square {

  Coordinate x;
  Coordinate y;

  /**
   * コンストラクタ
   * 
   * @param x
   * @param y
   * @throws CoordinateOutsideBoardException
   */
  public Square( int x, int y ) throws CoordinateOutsideBoardException {
    this.setX( x );
    this.setY( y );
  }

  /**
   * セッター
   * 
   * @param x
   * @throws CoordinateOutsideBoardException
   */
  public void setX( int xCoordinate ) throws CoordinateOutsideBoardException {
    this.x = new Coordinate();
    x.setXCoordinate( xCoordinate );
  }

  /**
   * セッター
   * 
   * @param y
   * @throws CoordinateOutsideBoardException
   */
  public void setY( int yCoordinate ) throws CoordinateOutsideBoardException {
    this.y = new Coordinate();
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
   * このスクウェアが入った盤面の配列を返すメソッド
   * 
   * @throws CoordinateOutsideBoardException
   */
  public List<List> createGameBoardArray( Object s ) throws CoordinateOutsideBoardException {

    List<List> board = new ArrayList<>();
    
    for ( int y = 0 ; y < BoardSetting.getROWS() ; y++ ){

      List< s.getClass() > line = new ArrayList<>();

      for ( int x = 0 ; x < BoardSetting.getCOLUMNS() ; x++ ){
        
        line.add( s.clone() );
        setter();
      }

      board.add( line );
    }

    return board;
  }


  
}
