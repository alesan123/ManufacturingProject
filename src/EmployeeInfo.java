import java.util.Scanner;

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
  private Scanner in;
  
  
  
  
  
  public EmployeeInfo() {
    setName();
  }

  private void setName() {
    name = new StringBuilder(inputName());

    if (checkName(name)) {
      createEmployeeCode(name);
    } else {
      createEmployeeCode(new StringBuilder("Guest"));
    }
  }

  private void createEmployeeCode(StringBuilder name) {
    StringBuilder guest = new StringBuilder("Guest");

    String firstName;
    String surName;

    if (guest.toString().equals(name.toString())) {
      code = "Guest";

    } else {

      int index = name.indexOf(String.valueOf(' '));
      firstName = name.substring(0, index + 1);
      surName = name.substring(index + 1, name.length());

      code = firstName.charAt(0) + surName;
    }
  }

  private String inputName() {
    Scanner userInput = new Scanner(System.in);
    System.out.println("Please Enter Full Name :");
    String name = userInput.nextLine();
    return name;
  }

  private boolean checkName(StringBuilder name) {
    boolean hasSpace = false;
    if (name.toString().contains(" ")) {
      hasSpace = true;
    }
    return hasSpace;
  }


  public String getCode() {
    return code;
  }

  public String getName() {
    return name.toString();
  }
}
