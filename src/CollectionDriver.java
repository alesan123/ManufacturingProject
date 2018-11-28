import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

/**
 * @author : Alejandro Sanchez Padron
 * @date : 11/14/2018
 * @description : Driver class demonstrating the use of a collection to sort products
 */
public abstract class CollectionDriver {

  public static void main(String[] args) {
    // Creates and initialzies ArrayList of type Product
    ArrayList<Product> products = new ArrayList<>();

    //Creates AudioPlayer Products
    AudioPlayer a1 = new AudioPlayer("iPod Mini", "MP3");
    AudioPlayer a2 = new AudioPlayer("Walkman", "WAV ");

    //Creates MoviePlayer Products
    MoviePlayer m1 = new MoviePlayer("DBPOWER MK101",
        new Screen(" 720x480", 40, 22), MonitorType.LCD);
    MoviePlayer m2 = new MoviePlayer("Pyle PDV156BK",
        new Screen("1366x768", 40, 22), MonitorType.LED);

    //Adds Products created to the ArrayList
    products.add(a1);
    products.add(a2);
    products.add(m1);
    products.add(m2);

    // Compares every product in list and sorts them by  lexicographically.
    Collections.sort(products, Product::compareTo);

    print(products);
  }

  /**
   * Prints every object in the collection
   *
   * @param c Collection created in main method
   */
  public static void print(Collection c) {
    for (Object o : c) {
      System.out.println(o);
    }
  }
}
