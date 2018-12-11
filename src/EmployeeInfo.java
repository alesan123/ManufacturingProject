import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Class is used to create Employee account and username.
 *
 * @author : Alejandro Sanchez Padron
 * @date : 11/07/2018
 */
public class EmployeeInfo {

  private StringBuilder name;
  private String code;
  private String deptId;
  private Pattern p;
  private Scanner in;

  /**
   * Constructor that creates employee info.
   */
  public EmployeeInfo() {
    in = new Scanner(System.in);
    p = Pattern.compile("[A-Z][a-z][a-z][a-z][0-9][0-9]");
    setName();
    setDeptId();
    in.close();
  }

  /**
   * Sets the name of employee.
   */
  private void setName() {
    name = new StringBuilder(inputName());

    if (checkName(name)) {
      createEmployeeCode(name);
    } else {
      createEmployeeCode(new StringBuilder("guest"));
    }
  }

  /**
   * Creates employee code (First letter of first name followed by last name). If incorrect name is
   * entered, employee code defaults to "guest".
   */
  private void createEmployeeCode(StringBuilder name) {
    //Create StringBuilder object to compare with name to see if it is guest

    StringBuilder guest = new StringBuilder("guest");

    String firstName;
    String surName;

    if (guest.toString().equals(name.toString())) {
      code = "guest";

    } else {

      int spaceInName = name.indexOf(String.valueOf(' '));

      firstName = name.substring(0, spaceInName + 1);
      surName = name.substring(spaceInName + 1, name.length());

      code = firstName.charAt(0) + surName;
    }
  }

  /**
   * Method that allows user to input their name.
   */
  private String inputName() {
    System.out.println("Please enter your first and last name: ");
    String name = in.nextLine();
    return name;
  }

  /**
   * Checks to see if the name has a space. The space is used to seperate first and last name.
   */
  private boolean checkName(StringBuilder name) {
    boolean hasSpace = false;
    if (name.toString().contains(" ")) {
      hasSpace = true;
    }
    return hasSpace;
  }

  /**
   * Allows employee to enter their department ID.
   */
  private String getId() {
    System.out.println(
        "Please enter the Department ID:");
    return in.nextLine();
  }

  /**
   * Sets the entered information from employee to the deptID.
   */
  private void setDeptId() {
    String id = getId();
    if (validId(id)) {
      id = reverseString(id);
      deptId = id;
    } else {
      deptId = "None01";
    }
  }

  /**
   * Checks to see if the id entered matches the pattern specified.
   */
  private boolean validId(String id) {
    Matcher matcher = p.matcher(id);
    return matcher.matches();
  }

  /**
   * Encodes by reversing the department id for security purposes.
   */
  public String reverseString(String id) {
    StringBuilder reverseId = new StringBuilder(id.length());
    for (int i = (id.length() - 1); i >= 0; i--) {
      reverseId.append(id.charAt(i));
    }
    return reverseId.toString();
  }


  public String getDeptId() {
    return deptId;
  }

  public String getCode() {
    return code;
  }

  public String toString() {
    return "Employee Code : " + code + "\n"
        + "Department Number : " + deptId + "\n";
  }
}