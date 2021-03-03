package src.entity;

public class Coordinate {

  int coordinate;

  public void setXCoordinate(int coordinate) {
    if ( coordinate >= GameSetting.getRaws() )
    this.coordinate = coordinate;
  }
  
}
