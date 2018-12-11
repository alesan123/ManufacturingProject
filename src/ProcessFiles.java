import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

/**
 * Creates files and methods to write to the file.
 *
 * @author : Alejandro Sanchez Padron
 * @date : 12/11/2018
 */
public class ProcessFiles {

  private Path p;
  private Path p2;
  private Path p3;

  ProcessFiles() {
    CreateDirectory();
  }

  /**
   * Creates directory.
   */
  private void CreateDirectory() {
    String directoryPath = "C://LineTest(p)";
    String filePath = "TestResults.txt(p2)";
    File directory = new File(directoryPath);
    File file = new File(directoryPath, filePath);
    if (directory.mkdirs()) {
      System.out.println("File created.");
    } else {
      System.out.println("File already exists");
    }

    if (!file.exists()) {
      try {
        file.createNewFile();
      } catch (IOException e) {
        e.printStackTrace();
      }
    }
    //Paths retrieve file paths
    p = Paths.get(directoryPath);
    p2 = Paths.get(filePath);
    p3 = Paths.get(directoryPath, filePath);
  }

  /**
   * Prints employee info to file.
   */
  public void WriteFile(EmployeeInfo emp) throws IOException {
    FileWriter fw = new FileWriter(String.valueOf(p3), true);
    BufferedWriter writer = new BufferedWriter(fw);
    writer.write(emp.toString());
    writer.close();
  }

  /**
   * Prints production information to file.
   */
  public void WriteFile(ArrayList<Product> products) throws IOException {
    FileWriter fw = new FileWriter(String.valueOf(p3), true);
    BufferedWriter writer = new BufferedWriter(fw);
    writer.write("\n" + products.toString());
    writer.close();
  }
}


