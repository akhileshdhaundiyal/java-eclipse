/**
 * This program imports the required classes.
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.FileOutputStream;
import java.io.DataOutputStream;
import java.io.FileReader;
import java.io.IOException;



class FileEditor {

/** Declaring a BufferedReader object. */
    BufferedReader bufferObj;

/** Declaring a string variable. */
    String lines;

/** Decalring a DataOutoutStream object. */
    DataOutputStream fileoutObj;

/** Constructor. */
    FileEditor() {
      lines = new String();
    }
/** Method accepting the content and writing to file.
 * @param name accepts a String value
 * @throws IOException object
 */
    void accept(final String name) throws IOException {

      bufferObj = new BufferedReader(new InputStreamReader(System.in));
      System.out.println("\nEnter lines of text");
      System.out.println("Enter 'quit' to exit");

      fileoutObj = new DataOutputStream(new FileOutputStream(name));
      System.out.println("-------------------------");

      while ((lines = bufferObj.readLine()) != null) {
             if (lines.equals("quit")) {
                 break;
             } else {
                 fileoutObj.writeBytes(lines + "\r\n");
             }
      }
      fileoutObj.close();
    }

/** Method displaying the content from file.
 * @param name accepts a String value
 * @throws IOException object
 */
    void display(final String name) throws IOException {

       BufferedReader bufferoutObj = new BufferedReader(new FileReader(name));

       System.out.println("\nPrinting the contents");
       System.out.println("----------------------");

       while ((lines = bufferoutObj.readLine()) != null) {
             if (lines.equals("quit")) {
                 break;
             } else {
             System.out.println(lines);
             }
       }
       bufferoutObj.close();
    }

}

class FileEditorTest {

/** constructor. */
    protected FileEditorTest() {
    }

/**
 * This is a main method.
 * @param args passed to the main method
 */
    public static void main(final String[] args) {

        FileEditor textObj = new FileEditor();
        try {
          textObj.accept(args[0]);
          textObj.display(args[0]);
        } catch (IOException ioe) {
           System.out.println("Error");
        }
    }
}
