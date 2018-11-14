package JPproject;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionDriver {

  public static void main(String[] args) {
    ArrayList<Product> product = new ArrayList<>();
    product.add(new MoviePlayer("DVD Player", new Screen("1920x108",60,0)));
    product.add(new AudioPlayer("iPod","MP3"));
  }
}
