/**
 * Driver class used to test Multimedia Controls.
 *
 * @author : Alejandro Sanchez Padron
 * @date : 11/07/2018
 */
public class MultimediaControlDriver {

  /**
   * Main method.
   */
  public static void main(String[] args) {
    MoviePlayer one = new MoviePlayer("DVD", new Screen("1920 x 1080", 60,
        1), MonitorType.LCD);
    AudioPlayer two = new AudioPlayer("MP3", "Play music");
    one.play();
    two.play();

  }
}
