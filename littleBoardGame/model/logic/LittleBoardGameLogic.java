package littleBoardGame.model.logic;

import littleBoardGame.model.entity.Baggage;
import littleBoardGame.view.GameFrame;

/**
 * すべてのロジックのもとになる抽象クラス
 */
public abstract class LittleBoardGameLogic {

  /**
   * MVC間のやりとりはBaggageクラスを使って行う
   */
  private Baggage baggage;

  /**
   * コンストラクタ
   * @param bag
   */
  public LittleBoardGameLogic( Baggage bag ){
    this.baggage = bag;
  }

  /**
   * ゲッター
   * @return
   */
  public Baggage getBaggage(){
    return this.baggage;
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
