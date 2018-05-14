

/** This class demonstrate the various Math class mehods.
  *

  */
class MathExample {

    /** Constructor. */
    protected MathExample() {
    }

    /** Variable initialization. */
    private static int i = 7;

    /** Variable initialization. */
    private static int j = -9;

    /** Variable initialization. */
    private static double x = 72.3;

    /** Variable initialization. */
    private static double y = 0.34;


    /**
     * Helper utility used to print a String to STDOUT.
     * @param s String that will be printed to STDOUT.
     */
    public static void prt(final String s) {
        System.out.println(s);
    }

    /** Method to print the line. */
    public static void prt() {
        System.out.println();
    }

   /**
     * The Math library defines several useful constants.
     */
    public static void printMathConstants() {
        prt("MATH CONSTANTS");
        prt("===========================================");
        prt("  Pi is " + Math.PI);
        prt("  e  is " + Math.E);
        prt();
    }

  
   /**
     * Comparison operators. min() returns the smaller of the two arguments
     * (numbers) you pass it.
     * <p>
     * max() returns the the larger of the two arguments (numbers) you pass it.
     */
   public static void doComparisonOperators() {
        prt("COMPARISON OPERATORS");
        prt("===========================================");
        prt("  min(" + i + ", " + x + ") is " + Math.min(i, x));
        prt();
        prt("  max(" + x + ", " + y + ") is " + Math.max(x, y));
        prt();
    }


    /**
     * Trigonometric Methods.  All arguments are given in radians.
     */
    public static void doTrigonometricMethods() {
        prt("TRIGONOMETRIC METHODS");
        prt("===========================================");

        /** Convert a 45 degree angle to radians. */
        double angle = 45.0 * 2.0 * Math.PI / 360.0;
        prt("  cos(" + angle + ") is " + Math.cos(angle));
        prt("  sin(" + angle + ") is " + Math.sin(angle));

        // Inverse Trigonometric methods.  All values are returned as radians
        double value = 0.707;
        prt("  acos(" + value + ") is " + Math.acos(value));
        prt("  asin(" + value + ") is " + Math.asin(value));
        prt("  atan(" + value + ") is " + Math.atan(value));
        prt();
    }


    /**
     * Exponential and Logarithmic Methods.
     */
    public static void doExponentialLogarithmicMethods() {
        prt("EXPONENTIAL AND LOGARITHMIC METHODS");
        prt("===========================================");

        // exp(a) returns e (2.71828...) raised to the power of a.
        prt("  exp(1.0)    is " + Math.exp(1.0));
        prt("  exp(10.0)   is " + Math.exp(10.0));
        prt();

    }


    /**
     * Using Power Method. pow(x, y) returns the x raised to the yth power.
     */
   public static void doPower() {
        prt("POWER METHOD");
        prt("===========================================");

        prt("  pow(2.0, 2.0)  is " + Math.pow(2.0, 2.0));
        prt("  pow(8, -1)     is " + Math.pow(8, -1));
        prt();
    }


    /**
     * Using Power Method.  qrt(x) returns the square root of x.
     */
    public static void doSquareRoot() {
        prt("SQUARE ROOT METHOD");
        prt("===========================================");

        for (i = 0; i < 5; i++) {
            prt("  The square root of " + i + " is " + Math.sqrt(i));
        }
        prt();
    }


    /**
     * Random Numbers.  Java provides a Random method that returns a
     * pseudo-random number between 0.0 and 1.0.
     */
    public static void doRandomNumbers() {
        prt("RANDOM NUMBERS");
        prt("===========================================");
        prt("  Random number: " + Math.random());
        prt("  Random number: " + Math.random());
        prt();
    }
}

/** This is a main class. */

class MathLibraryExample {

    /** Constructor. */
    protected MathLibraryExample() {
    }

    /**
      * Sole entry point to the class and application.
      * @param args Array of String arguments.
      */

    public static void main(final String[] args) {

        MathExample obj = new MathExample();
        obj.prt();
        obj.printMathConstants();
        obj.doComparisonOperators();
        obj.doTrigonometricMethods();
        obj.doExponentialLogarithmicMethods();
        obj.doPower();
        obj.doSquareRoot();
        obj.doRandomNumbers();
    }

}
