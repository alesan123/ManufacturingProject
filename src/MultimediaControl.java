
/**
 * @author : Alejandro Sanchez Padron
 * @date : 9/25/2018
 * @description : Interface will create functions that al the items in producton line will have
 */
public interface MultimediaControl {

  /**
   * methods will be used by other classes to show the functionality of play, stop, previous, next.
   */
  void play();

  void stop();

  void previous();

  void next();

}
