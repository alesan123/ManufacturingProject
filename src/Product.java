import java.util.Date;

/**
 * Product will implement all the basic functionality that all items on a production line should
 * have.
 *
 * @author : Alejandro Sanchez Padron
 * @date : 11/07/2018
 */

public class Product implements Item, Comparable<Product> {

  /**
   * serialNumber for product.
   */
  private int serialNumber;

  /**
   * name of manufacturer.
   */
  private String manufacturer;

  /**
   * date that the product is manufactured on.
   */
  private Date manufacturedOn;

  /**
   * name of product.
   */
  private String name;

  /**
   * used to track current number in the production line, also used to set the serialNumber.
   */
  private static int currentProductionNumber = 1;

  /**
   * Constructor will create object of type Product, will assign serialNumber to
   * currentProductionNumber and sets the current date as the date manufactured.
   *
   * @param name the name of the product
   */
  public Product(String name) {
    this.name = name;
    manufacturer = Item.manufacturer;
    serialNumber = currentProductionNumber;
    incCurrentProductionNumber();
    manufacturedOn = new Date();
  }

  private static void incCurrentProductionNumber() {
    currentProductionNumber++;
  }

  /**
   * Sets the Products production number.
   *
   * @param number Products production number
   */
  @Override
  public void setProductionNumber(int number) {
    currentProductionNumber = number;
  }

  /**
   * Sets the name of Product.
   *
   * @param name name of Product
   */
  @Override
  public void setName(String name) {
    this.name = name;
  }

  /**
   * Return name of product.
   *
   * @return the name of Product
   */
  @Override
  public String getName() {
    return name;
  }

  /**
   * Return date.
   *
   * @return the date of Product
   */
  @Override
  public Date getManufactureDate() {
    return manufacturedOn;
  }

  /**
   * Return serial number.
   *
   * @return the serial number of Product
   */
  @Override
  public int getSerialNumber() {
    return serialNumber;
  }

  /**
   * toString function.
   *
   * @return the data of Product
   */
  public String toString() {
    return
        "Manufacturer  : " + manufacturer + "\n"
            + "Serial Number : " + serialNumber + "\n"
            + "Date          : " + manufacturedOn + "\n"
            + "Name          : " + name + "\n";
  }

  /**
   * Compare method that compares Products by name.
   */
  @Override
  public int compareTo(Product o) {
    return name.compareTo(o.name);
  }
}
