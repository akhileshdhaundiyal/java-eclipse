import java.io.File;

/**
 * This program demonstrates the use File class.
 */

class ListDirectory {

/** Stores the name of directory to search. */
    String directoryName;

/** Declares a File object. */
    File fileObj;

/** Constructor.
 * @param name is a string
 */
    ListDirectory(final String name) {
       directoryName = name;
       fileObj = new File(name);
    }

/** Method listing the directory and sub directory.
 */
    void display() {
       if (fileObj.isDirectory()) {
          System.out.println("Directory is : " + directoryName);
          String[] fileName = fileObj.list();

          for (int ctr = 0; ctr < fileName.length; ctr++) {
              File nextFileObj = new File(directoryName + "/" + fileName[ctr]);

              if (nextFileObj.isDirectory()) {
                 System.out.println(fileName[ctr] + " is a directory");
              } else {
                 System.out.println(fileName[ctr] + " is a file");
              }
          }
        } else {
              System.out.println(directoryName + " is not a valid directory");
        }
    }
}

class DirectoryTest {

/** constructor. */
    protected DirectoryTest() {
    }

/**
 * This is a main method.
 * @param args passed to the main method
 */
    public static void main(final String[] args) {
        ListDirectory listObj = new ListDirectory("C:\\Program Files\\Java\\jdk1.8.0_65");
        listObj.display();
    }
}
