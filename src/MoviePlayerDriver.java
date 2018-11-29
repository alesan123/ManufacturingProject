/**
 * Class used to create instances of type MoviePLayer.
 *
 * @author : Alejandro Sanchez Padron
 * @date : 11/07/2018
 */
public class MoviePlayerDriver {

  /**
   * Main method.
   */
  public static void main(String[] args) {
    MoviePlayer one = new MoviePlayer("DVD", new Screen("1920 x 1080", 60, 1), MonitorType.LCD);
    System.out.println(one.toString());
  }
}
