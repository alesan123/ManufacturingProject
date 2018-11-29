//Alejandro Sanchez Padron
//11/07/2018

/* Defines method */

/**
 * Interface ScreenSpec will be used by products that require screen information.
 *
 * @author : Alejandro Sanchez Padron
 * @date : 11/07/2018
 */
public interface ScreenSpec {

  /**
   * Returns resolution of screen.
   *
   * @return String
   */
  String getResolution();

  /**
   * Returns refresh rate of screen.
   *
   * @return int
   */
  int getRefreshRate();

  /**
   * Returns response time of a screen.
   *
   * @return int
   */
  int getResponseTime();
}
