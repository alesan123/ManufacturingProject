import java.util.Date;

/**
 * @author Alejandro Sanchez Padron
 * @Date: 10/01/2018.
 * @Description: Item.java class will force all classes to implement the following functions.
 */

public interface Item {

  /**
   * A String called manufacturer that would be set to “OracleProduction”.
   */
  String manufacturer = "OracleProduction";


  /**
   * Method setProductionNumber that would have one integer parameter
   */
  void setProductionNumber(int number);

  /**
   * A method setName that would have one String parameter
   */
  void setName(String name);


  /**
   * A method getName that would return a String
   */
  String getName();


  /**
   * // A method getManufactureDate that would return a Date
   */
  Date getManufactureDate();

  // A method getSerialNumber that would return an int

  /**
   * A method getSerialNumber that would return an int
   */
  int getSerialNumber();
}
