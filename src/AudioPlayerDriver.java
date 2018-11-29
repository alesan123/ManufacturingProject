/**
 * Class used to create and tests AudioPlayer objects.
 *
 * @author : Alejandro Sanchez Padron
 * @date : 11/07/2018
 */
public class AudioPlayerDriver {

  public static void main(String[] args) {
    AudioPlayer mp3 = new AudioPlayer("iPod", "MP3");
    System.out.println(mp3.toString());
  }
}
