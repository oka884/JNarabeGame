package src.entity;

import java.util.ArrayList;

abstract public static class GameSetting {

  int rows;
  int columns;

  public static int getRaws(){
    return this.rows;
  };

  public static int getColumns(){
    return this.columns;
  }
  
  abstract public static ArrayList<Square> createGameBoardArray();
}
