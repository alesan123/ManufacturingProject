package JPproject;

public class ScreenDriver {

  public static void main(String[] args) {
    Screen panel = new Screen("1080 x 1920", 60, 1);
    System.out.println(panel.getRefreshRate());
    System.out.println(panel.getResolution());
    System.out.println(panel.getResponseTime());
    System.out.println(panel.toString());
  }
}
