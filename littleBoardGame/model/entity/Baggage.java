package littleBoardGame.model.entity;

import java.util.Map;

import littleBoardGame.view.GameFrame;

public class Baggage {

  private Map<String, GameFrame> frames;
  private Map<String, Integer> numbers;
  private Map<String, String> texts;

  public void setFrame( String key, GameFrame value ){
    this.frames.put(key, value);
  }

  public void setNumber( String key, Integer value ){
    this.numbers.put(key, value);
  }

  public void setText( String key, String value ){
    this.texts.put(key, value);
  }

  public Map<String, GameFrame> getFrames(){
    return this.frames;
  }

  public Map<String, Integer> getNumbers(){
    return this.numbers;
  }

  public Map<String, String> getTexts(){
    return this.texts;
  }

  public GameFrame getFrame( String key ){
    return this.frames.get(key);
  }
  
  public Integer getNumber( String key ){
    return this.numbers.get(key);
  }

  public String getText( String key ){
    return this.texts.get(key);
  }
}
