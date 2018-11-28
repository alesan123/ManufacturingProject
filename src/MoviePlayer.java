/**
 * @author : Alejandro Sanchez Padron
 * @date : 11/07/2018
 * @description : Class implements MultiMedia control and extends product to describe a movie
 * player
 */
public class MoviePlayer extends Product implements MultimediaControl {

  /**
   * Screen store information of screen
   */
  private Screen screen;
  /**
   * Describes monitor type
   */
  private MonitorType monitorType;

  /**
   * Creates MoviePlayer object, calls Products constructor
   *
   * @param name the name of the product
   * @param screen the screen information
   * @param monitorType the monitorType
   */
  public MoviePlayer(String name, Screen screen, MonitorType monitorType) {
    super(name);
    this.monitorType = monitorType;
    this.screen = screen;
  }

  //Multimedia Controls used to display controls

  /**
   * Multimedia Controls used to display controls of MoviePlayer
   */
  @Override
  public void play() {
    System.out.println("Playing");
  }

  @Override
  public void stop() {
    System.out.println("Stopped");
  }

  @Override
  public void previous() {
    System.out.println("Previous");
  }

  @Override
  public void next() {
    System.out.println("Next");
  }

  /**
   * toString function that adds screen information and monitor type to Products
   *
   * @return String
   */
  public String toString() {
    return super.toString() +
        screen.toString() + "\n" +
        "Monitor       : " + monitorType.toString() + "\n";
  }
}
