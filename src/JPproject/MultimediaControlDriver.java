//Alejandro Sanchez Padron
//11/07/2018
/* Driver class used to test Multimedia Controls
 */
package JPproject;

public class MultimediaControlDriver {

  public static void main(String[] args) {
    MoviePlayer one = new MoviePlayer("DVD", new Screen("1920 x 1080", 60,
        1));
    AudioPlayer two = new AudioPlayer("MP3", "Play music");
    one.play();
    two.play();

  }
}
