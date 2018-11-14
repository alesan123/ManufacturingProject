//Alejandro Sanchez Padron
//11/07/2018
/* Class used to create instances of type AudioPlayer
 */

package JPproject;

public class AudioPlayerDriver {

  public static void main(String[] args) {
    AudioPlayer mp3 = new AudioPlayer("MP3", "Plays great music");
    System.out.println(mp3.toString());
  }
}
