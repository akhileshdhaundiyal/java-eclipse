/** This class demonstrates use of methods of Integer class.
    */

public class Converse {
    /** Constructor. */

    protected Converse() {
    }

    /** This method converts integer value into
                binary, hexadecimal and octal values.
      * @param args passed to the method
      */

    void tobeConvert(final String []args) {
        String binary, hex, octal;
        int num = Integer.parseInt(args[0]);
        Integer obj = new Integer(num);

        binary = obj.toBinaryString(num);
        hex = obj.toHexString(num);
        octal = obj.toOctalString(num);

        System.out.println("Decimal value : " + args[0]);
        System.out.println("Binary equivalent = " + binary);
        System.out.println("Hexadecimal equivalent = " + hex);
        System.out.println("Octal equivalent = " + octal);
    }

    /** This is a main method.
      * It creates object of the Converse class and access its methods
      * @param args passed to the main method
      */

    public static void main(final String[] args) {
        Converse objConvert = new Converse();
        objConvert.tobeConvert(args);
    }
}
