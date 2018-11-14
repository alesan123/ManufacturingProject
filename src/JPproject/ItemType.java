// Alejandro Sanchez Padron
// 10/01/2018

/*Enumerator creates preset types for all instanced items
 */

package JPproject;

public enum ItemType {

  Audio("AU"), Visual("VI"), AudioMobile("AM"), VisualMobile("VM");


  public final String code;

  //constructor creates the item types and allows the use of strings as parameter
  private ItemType(String code) {
    this.code = code;
  }
}
