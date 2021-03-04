package littleBoardGame.entity;


/**
 * 盤面の設定を保持するスタティックなクラス
 */
public class BoardSetting {

  /**
   * x座標にあたる縦の列の数を保持するフィールド
   */
  private static int COLUMNS = 0;

  /**
   * y座標にあたる横の行の数を保持するフィールド
   */
  private static int ROWS = 0;

  /**
   * デフォルトのx座標にあたる縦の列の数を保持するフィールド
   */
  private static int DEFAULT_COLUMNS = 0;

  /**
   * デフォルトのy座標にあたる横の行の数を保持するフィールド
   */
  private static int DEFAULT_ROWS = 0;


  /**
   * すべてのフィールドに一度にセットするセッター
   */
  public static void setALL( int columns, int rows, int defaultColumns, int defaultRows ){
    setCOLUMNS(columns);
    setROWS(rows);
    setDEFAULT_COLUMNS(defaultColumns);
    setDEFAULT_ROWS(defaultRows);
  }

  /**
   * プレイする盤面の値だけセットするセッター
   */
  public static void setBoardSetting( int columns, int rows ){
    setCOLUMNS(columns);
    setROWS(rows);
  }

  /**
   * 盤面のデフォルト値だけをセットするセッター
   */
  public static void setDefaultBoardSetting( int defaultColumns, int defaultRows ){
    setDEFAULT_COLUMNS(defaultColumns);
    setDEFAULT_ROWS(defaultRows);
  }

  /**
   * セッター
   * @param columns
   */
  public static void setCOLUMNS( int columns ){
    BoardSetting.COLUMNS = columns;
  }

  /**
   * セッター
   * @param rows
   */
  public static void setROWS( int rows ){
    BoardSetting.ROWS = rows;
  }

  /**
   * セッター
   * @param defaultColumns
   */
  public static void setDEFAULT_COLUMNS( int defaultColumns ){
    BoardSetting.DEFAULT_COLUMNS = defaultColumns;
  }

  /**
   * セッター
   * @param defaultRows
   */
  public static void setDEFAULT_ROWS( int defaultRows ){
    BoardSetting.DEFAULT_ROWS = defaultRows;
  }

  /**
   * ゲッター
   * @return
   */
  public static int getCOLUMNS() {
    return BoardSetting.COLUMNS;
  }

  /**
   * ゲッター
   * @return
   */
  public static int getROWS(){
    return BoardSetting.ROWS;
  }

  /**
   * ゲッター
   * @return
   */
  public static int getDEFAULT_COLUMNS() {
    return BoardSetting.DEFAULT_COLUMNS;
  }

  /**
   * ゲッター
   * @return
   */
  public static int getDEFAULT_ROWS(){
    return BoardSetting.DEFAULT_ROWS;
  }
  
}
