//Alejandro Sanchez Padron
//11/07/2018
/* Class implements MultiMedia control and extends product to describe a movie player
 */
package JPproject;

public class MoviePlayer extends Product implements MultimediaControl {

  Screen screen;
  MonitorType monitorType;

  public MoviePlayer(String name, Screen screen, MonitorType monitorType) {
    super(name);
    this.monitorType = monitorType;
    this.screen = screen;
  }

  //Multimedial Controls used to display controls
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

  public String toString() {
    return super.toString() +
        screen.toString() + "\n" +
        "Monitor       : " + monitorType.toString() + "\n";
  }
}
