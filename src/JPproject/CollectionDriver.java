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
    products.add(new MoviePlayer("DVD Player", new Screen("1920x108", 60, 0),MonitorType.LED));
    products.add(new AudioPlayer("iPod", "MP3"));

    Collections.sort(products, Product::compareTo);

    print(products);
  }

  public static void print(Collection c) {
    for (Object o : c) {
      System.out.println(o);
    }
  }

}
