/**
 * This class will be used to create a product Audio Player, it will implement Multimedia Controls
 * and is a subclass of product.
 *
 * @author : Alejandro Sanchez Padron
 * @date : 11/17/2018
 */
public class AudioPlayer extends Product implements MultimediaControl {

  /**
   * audioSpecification will describe the specification of product.
   */
  private String audioSpecifications;
  /**
   * mediaType will describe the type of product.
   */
  private ItemType mediaType;

  /**
   * Constructor creates Audio Player object by extending Product constructor, and assigns ItemType
   * to AUDIO.
   *
   * @param name the name of the audioPlayer
   * @param audioSpecifications a brief specification of the audioPlayer
   */
  public AudioPlayer(String name, String audioSpecifications) {
    super(name);
    this.audioSpecifications = audioSpecifications;
    mediaType = ItemType.AUDIO;
  }

  /**
   * Multimedia controls to display controls of AudioPlayer.
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
   * toString function that adds Audio spec and Type description to Products.
   *
   * @return String
   */
  public String toString() {
    return
        //calls Products toString function
        super.toString()
            + "Audio Spec    : " + audioSpecifications + "\n"
            + "Type          : " + mediaType + "\n";
  }
}
