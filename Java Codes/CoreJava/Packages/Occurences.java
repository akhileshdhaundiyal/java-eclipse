/** This class finds occurences of a certain character in String.
   */

class Occurences {

    /** Constructor. */

    protected Occurences() {
    }

    /** This method finds occurences of 'e' character in the given String. */

    void findOccur() {

        String text = "Seize the day";
        int count = 0;

        for (int index = 0; index < text.length(); index++) {
            if (text.charAt(index) == 'e') {
                count++;
            }
        }

        System.out.println("The character 'e' occurs "
             + count + " times in the string \"Seize the day\"");
        }

    /** This is a main method.
      * It creates object of the Occurences class and access its methods
      * @param args passed to the main method
      */

    public static void main(final String[] args) {
        Occurences objOccur = new Occurences();
        objOccur.findOccur();
    }
}
