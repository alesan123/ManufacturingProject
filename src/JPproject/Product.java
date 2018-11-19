// Alejandro Sanchez Padron
// 10/01/2018

/*Product will implement all
the basic functionality that all items on a production line should have.
*/

package JPproject;

import java.util.Date;

public class Product implements Item, Comparable<Product> {

  int serialNumber;
  String manufacturer;
  Date manufacturedOn;
  String name;
  static int currentProductionNumber = 1;

  //Constructor
  public Product(String name) {
    this.name = name;
    manufacturer = Item.manufacturer;
    serialNumber = currentProductionNumber;
    currentProductionNumber++;
    manufacturedOn = new Date();
  }

  @Override
  public void setProductionNumber(int number) {
    currentProductionNumber = number;
  }

  @Override
  public void setName(String name) {
    this.name = name;
  }

  @Override
  public String getName() {
    return name;
  }

  @Override
  public Date getManufactureDate() {
    return manufacturedOn;
  }

  @Override
  public int getSerialNumber() {
    return serialNumber;
  }

  //This method returns the data as a string
  public String toString() {
    return
        "Manufacturer  : " + manufacturer + "\n" +
            "Serial Number : " + serialNumber + "\n" +
            "Date          : " + manufacturedOn + "\n" +
            "Name          : " + name + "\n";
  }

  //Compares Products by Name
  @Override
  public int compareTo(Product o) {
    return name.compareTo(o.name);
  }
}
