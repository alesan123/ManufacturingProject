//Alejandro Sanchez Padron
//10/07/2018
/*Class Screen that implements ScreenSpec
 */

package JPproject;

public class Screen implements ScreenSpec {

  String resolution;
  int refreshRate;
  int responseTime;

  //Constructor
  public Screen(String resolution, int refreshRate, int responseTime) {
    this.resolution = resolution;
    this.refreshRate = refreshRate;
    this.responseTime = responseTime;
  }

  @Override
  public String getResolution() {
    return resolution;
  }

  @Override
  public int getRefreshRate() {
    return refreshRate;
  }

  @Override
  public int getResponseTime() {
    return responseTime;
  }

  public String toString() {
    return "Resolution    : " + resolution + "\n" +
        "Refresh Rate  : " + refreshRate + "\n" +
        "Response Time : " + responseTime;
  }
}
