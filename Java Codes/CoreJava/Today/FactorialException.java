/**
  * This program demonstrates how multiple exceptions are handled.
   */

/** This class computes the factorial. */
class FactorialCompute {
  /** Constructor. */

    protected FactorialCompute() {
    }

    /** @param x is number passed.
      * @return returns factorial.
      */

    public static long factorial(final int x) {

          long fact = 1;
          if (x < 0) {

              throw new IllegalArgumentException("Number must be non-negative.");
          }
          for (int i = 1; i <= x; i++) {

              fact *= i;
          }
                return (fact);
        }
}

/**
  * This is a main class.
  */

class FactorialException {

   /** Constructor. */

    protected FactorialException() {
    }

    /**
     * Sole entry point to the class and application.
     * @param args Array of String arguments.
     */


    public static void main(final String[] args) {

        FactorialCompute obj = new FactorialCompute();

   // Try to compute a factorial.  If something goes wrong, handle it below.

    try {

      /** @param args Array of String arguments . */

      int x = Integer.parseInt(args[0]);
      System.out.println(x + "! = " + obj.factorial(x));
    } catch (ArrayIndexOutOfBoundsException e) {

// The user forgot to specify an argument.  Thrown if args[0] is undefined.

      System.out.println("You must specify an argument");
      System.out.println("Usage: java FactComputer <number>");
    } catch (NumberFormatException e) {

// The argument is not a number.  Thrown by Integer.parseInt().
      System.out.println("The argument you specify must be an integer");

    } catch (IllegalArgumentException e) {
// The argument is < 0.  Thrown by Factorial4.factorial()
    //Display the message sent by the factorial() method:

      System.out.println("Bad argument: " + e.getMessage());

    }

}

}
