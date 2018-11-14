//Alejandro Sanchez Padron
//11/07/2018
/* Class used to create instances of type MoviePLayer
 */
package JPproject;

public class MoviePLayerDriver {

  public static void main(String[] args) {
  MoviePlayer DVD = new MoviePlayer("DVD", new Screen("1920 x 1080",60,1) );
    System.out.println(DVD.toString());
  }
}
