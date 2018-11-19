// Alejandro Sanchez Padron
// 10/01/2018

/*This class will force all classes to implement the following functions
 */

package JPproject;

import java.util.Date;

//Create an interface called Item that will force all classes to implement the following functions.

public interface Item {

  // A constant called manufacturer that would be set to “OracleProduction”.
  public final String manufacturer = "OracleProduction";

  // A method setProductionNumber that would have one integer parameter
  void setProductionNumber(int number);

  // A method setName that would have one String parameter
  void setName(String name);

  // A method getName that would return a String
  String getName();

  // A method getManufactureDate that would return a Date
  Date getManufactureDate();

  // A method getSerialNumber that would return an int
  int getSerialNumber();
}
