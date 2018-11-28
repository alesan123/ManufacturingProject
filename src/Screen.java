/**
 * @author : Alejandro Sanchez Padron
 * @date : 11/07/2018
 * @description : Class Screen that describes a screen item and implements ScreenSpec line should
 * have.
 */

public class Screen implements ScreenSpec {

  /**
   * Resolution of the Screen
   */
  String resolution;
  /**
   * Refresh rate of the Screen
   */
  int refreshRate;
  /**
   * Response time of the Screen
   */
  int responseTime;

  /**
   * Constructor that create objects of type Screen
   *
   * @param resolution resolution of Screen
   * @param refreshRate refresh rate of Screen
   * @param responseTime response time of Screen
   */
  public Screen(String resolution, int refreshRate, int responseTime) {
    this.resolution = resolution;
    this.refreshRate = refreshRate;
    this.responseTime = responseTime;
  }

  /**
   * @return resolution
   */
  @Override
  public String getResolution() {
    return resolution;
  }

  /**
   * @return refresh rate
   */
  @Override
  public int getRefreshRate() {
    return refreshRate;
  }

  /**
   * @return response time
   */
  @Override
  public int getResponseTime() {
    return responseTime;
  }

  /**
   * toString method that uses variables and converts returns a String
   *
   * @return String
   */
  public String toString() {
    return "Resolution    : " + resolution + "\n" +
        "Refresh Rate  : " + refreshRate + "\n" +
        "Response Time : " + responseTime;
  }
}
