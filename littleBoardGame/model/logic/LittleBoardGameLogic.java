package littleBoardGame.model.logic;

import littleBoardGame.controller.Controller;
import littleBoardGame.view.GameFrame;

/**
 * すべてのロジックのもとになる抽象クラス
 */
public abstract class LittleBoardGameLogic {

  /**
   * コントローラーをもつ
   */
  Controller controller;

  /**
   * コンストラクタ。引数にコントローラーをとる
   * @param c
   */
  public LittleBoardGameLogic( Controller c ){
    this.controller = c;
  }

  /**
   * ゲッター
   * @return
   */
  public Controller getController(){
    return this.controller;
  }
  
  /**
   * ロジック
   * コントローラーにviewを返す
   */
  abstract public GameFrame returnFrame();

  /**
   * ロジック
   * コントローラーにviewNameを返す
   * @return
   */
  abstract public String returnFrameName();
}
