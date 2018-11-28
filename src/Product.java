import java.util.Date;

/**
 * @author : Alejandro Sanchez Padron
 * @date : 11/07/2018
 * @description : Product will implement all the basic functionality that all items on a production
 * line should have.
 */

public class Product implements Item, Comparable<Product> {

  /**
   * serialNumber for product
   */
  int serialNumber;

  /**
   * name of manufacturer
   */
  String manufacturer;

  /**
   * date that the product is manufactured on
   */
  Date manufacturedOn;

  /**
   * name of product
   */
  String name;

  /**
   * used to track current number in the production line, also used to set the serialNumber
   */
  static int currentProductionNumber = 1;

  /**
   * Constructor will create object of type Product, will assign serialNumber to
   * currentProductionNumber and sets the current date as the date manufactured
   *
   * @param name the name of the product
   */
  public Product(String name) {
    this.name = name;
    manufacturer = Item.manufacturer;
    serialNumber = currentProductionNumber;
    currentProductionNumber++;
    manufacturedOn = new Date();
  }

  /**
   * Sets the Products production number
   *
   * @param number Products production number
   */
  @Override
  public void setProductionNumber(int number) {
    currentProductionNumber = number;
  }

  /**
   * Sets the name of Product
   *
   * @param name name of Product
   */
  @Override
  public void setName(String name) {
    this.name = name;
  }

  /**
   * @return the name of Product
   */
  @Override
  public String getName() {
    return name;
  }

  /**
   * @return the date of Product
   */
  @Override
  public Date getManufactureDate() {
    return manufacturedOn;
  }

  /**
   * @return the serial number of Product
   */
  @Override
  public int getSerialNumber() {
    return serialNumber;
  }

  /**
   * toString function
   *
   * @return the data of Product
   */
  public String toString() {
    return
        "Manufacturer  : " + manufacturer + "\n" +
            "Serial Number : " + serialNumber + "\n" +
            "Date          : " + manufacturedOn + "\n" +
            "Name          : " + name + "\n";
  }

  /**
   * Compare method that compares Products by name
   */
  @Override
  public int compareTo(Product o) {
    return name.compareTo(o.name);
  }
}
