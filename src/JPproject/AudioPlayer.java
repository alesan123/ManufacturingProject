//Alejandro Sanchez Padron
//11/17/2018

/*This class will be used to create type Audio PLayer, it will implement Multimedia Controls
and is a subclass of product, it will also return in a toString Function
 */

package JPproject;

public class AudioPlayer extends Product implements MultimediaControl {

  String audioSpecifications;
  ItemType mediaType;

  //Constructor
  public AudioPlayer(String name, String audioSpecifications) {
    super(name);
    this.audioSpecifications = audioSpecifications;
    mediaType = ItemType.Audio;
  }

  //Multimedia Controls used to display controls
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

  //toString function that adds Audio and Type to product
  public String toString() {
    return
        super.toString() +
            "Audio Spec    : " + audioSpecifications + "\n" +
            "Type          : " + mediaType +"\n";
  }
}
