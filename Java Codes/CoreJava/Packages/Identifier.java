/** This class checks if a string is a legal java identifier.
   */

public class Identifier {

    /** Constructor. */
    protected Identifier() {
    }
    /** It checks if a string is a legal java identifier. */

    void checkIdentifier() {
        String s = "var1 ", message = "";
        if (s.length() == 0) {
            message = "Identifier should be atleast one character in length";
        }

        if (!Character.isJavaIdentifierStart(s.charAt(0))) {
            message += "\nIdentifier should always begin with a character";
        }

        for (int index = 1; index < s.length(); index++) {
            if (!Character.isJavaIdentifierPart(s.charAt(index))) {
                message += "\nIdentifier contains invalid characters";
                break;
             }
        }
         System.out.println(message);
    }

    /** This is a main method.
      * It creates object of the Identifier class and access its methods
      * @param args passed to the main method
      */

    public static void main(final String[] args) {
        Identifier objIdentifier = new Identifier();
        objIdentifier.checkIdentifier();
    }
}
