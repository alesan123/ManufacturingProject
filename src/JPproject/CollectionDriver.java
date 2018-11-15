//Alejandro Sanchez Padron
//11/14/2018
/* Driver class demonstrating the use of a collection to sort products */




package JPproject;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public abstract class CollectionDriver {

  public static void main(String[] args) {


    ArrayList<Product> products = new ArrayList<>();
    AudioPlayer a1 = new AudioPlayer("iPod Mini","MP3");
    AudioPlayer a2 = new AudioPlayer("Walkman","WAV ");
    MoviePlayer m1 = new MoviePlayer("DBPOWER MK101",
        new Screen(" 720x480", 40, 22), MonitorType.LCD);
    MoviePlayer m2 = new MoviePlayer("Pyle PDV156BK",
        new Screen("1366x768", 40, 22), MonitorType.LED);

    products.add(a1);
    products.add(a2);
    products.add(m1);
    products.add(m2);

    Collections.sort(products, Product::compareTo);

    print(products);
  }

  public static void print(Collection c) {
    for (Object o : c) {
      System.out.println(o);
    }
  }

}
