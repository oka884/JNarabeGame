package littleBoardGame.entity;

import littleBoardGame.exception.CoordinateOutsideBoardException;


/**
 * 座標のクラス
 * 
 * x か y どちらかの座標を持つ
 */
public class Coordinate {

  int coordinate;

  /**
   * x座標のセッター
   * 
   * セットする座標とゲームセッティングを引数に与え、
   * 座標の値がゲームセッティングが定めるx座標の範囲内でなければ例外搬出する。
   * @param num
   * @param gameSetting
   * @throws CoordinateOutsideBoardException
   */
  public void setXCoordinate( int num ) throws CoordinateOutsideBoardException {
    if ( num <= BoardSetting.getCOLUMNS() && num >= 0 ){
    this.coordinate = num;
    } else {
      CoordinateOutsideBoardException e = new CoordinateOutsideBoardException();
      throw e;
    }
  }

  /**
   * y座標のセッター
   * 
   * セットする座標とゲームセッティングを引数に与え、
   * 座標の値がゲームセッティングが定めるy座標の範囲内でなければ例外搬出する。
   * @param num
   * @param gameSetting
   * @throws CoordinateOutsideBoardException
   */
  public void setYCoordinate( int num ) throws CoordinateOutsideBoardException {
    if ( coordinate <= BoardSetting.getROWS() && num >= 0 ){
    this.coordinate = num;
    } else {
      CoordinateOutsideBoardException e = new CoordinateOutsideBoardException();
      throw e;
    }
  }

  /**
   * ゲッター
   * @return
   */
  public int getCoordinate(){
    return this.coordinate;
  }
  
}
