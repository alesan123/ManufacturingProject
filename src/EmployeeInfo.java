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
      createEmployeeCode(new StringBuilder("guest"));
    }
  }

  private void createEmployeeCode(StringBuilder name) {
    //Create StringBuilder object to compare with name to see if
    //it is guest
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

  private String inputName() {
    in = new Scanner(System.in);
    System.out.println("Please enter your first and last name: ");
    String name = in.nextLine();
    return name;
  }

  private boolean checkName(StringBuilder name) {
    boolean hasSpace = false;
    if (name.toString().contains(" ")) {
      hasSpace = true;
    }
    return hasSpace;
  }

  private void setDeptId(){
    getId();
  }
  private String getId(){
    in = new Scanner(System.in);
    System.out.println("Please enter your id: ");
    String id = in.nextLine();
    return id;
  }

  private boolean validId(String id){
    return true;
  }




  public String getCode() {
    return code;
  }

  public String getName() {
    return name.toString();
  }

  public String getDeptId(){
    return deptId;
  }
}