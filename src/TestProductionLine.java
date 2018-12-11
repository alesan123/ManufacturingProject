import java.io.IOException;
import java.util.ArrayList;

/**
 * Class is used to test production line.
 *
 * @author : Alejandro Sanchez Padron
 * @date : 11/07/2018
 */
public class TestProductionLine {

  /**
   * Tests the functionality of the production line.
   */
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

    ProcessFiles processFiles = new ProcessFiles();
    EmployeeInfo employee = new EmployeeInfo();
    System.out.println(employee.toString());

    try {
      processFiles.WriteFile(products);
      processFiles.WriteFile(employee);
    } catch (IOException e) {
      e.printStackTrace();
    }

  }


}

