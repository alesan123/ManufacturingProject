import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * Class used to view file contents in the console.
 *
 * @author : Alejandro Sanchez Padron
 * @date : 12/11/2018
 */
public class ViewFileInfo {

  /**
   * Views the file contents and prints it to console.
   */
  public static void main(String[] args) throws Exception {
    String file = "C:/LineTest(p)/TestResults.txt(p2)";
    BufferedReader reader;

    //BufferedReader reads each line of text file and prints to console
    try {
      reader = new BufferedReader(new FileReader(file));
      String line;
      while ((line = reader.readLine()) != null) {
        System.out.println(line);
      }
      reader.close();
    } catch (FileNotFoundException e) {
      System.out.println("File is not found.");
      e.printStackTrace();
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}

