/**
  * This program demonstrates user defined exception and multiple exceptions.
   */

/** This class Creates an exception. */

class NonIntResultException extends Exception {

    /** Constructor. */

    protected NonIntResultException() {
    }

    /** Variables declared. */
    private int n;

    /** Variables declared. */
    private int d;

    /** @param i number is passed.
      * @param j number is passed.
      */

    NonIntResultException(final int i, final int j) {
        n = i;
        d = j;
    }

    /** @return returns exception message. */
    public String toString() {

        return "Result of " + n + " / "
           + d + " is non-integer.";
    }

}

/** This class Creates an exception. */

class SameIntReturnException extends Exception {

    /** Constructor. */

    protected SameIntReturnException() {
    }

    /** Variables declared. */
    private int l;

    /** Variables declared. */
    private int m;

    /** @param x number is passed.
      * @param y number is passed.
      */

    SameIntReturnException(final int x, final int y) {
        l = x;
        m = y;
    }

    /** @return returns exception message. */

    public String toString() {

        return "Result of " + l + " / "
           + m + " is the number itself.";
    }

}

/**
  * This is a main class.
  */

class CustomException {

    /** Constructor. */

    protected CustomException() {
    }

    /**
     * Sole entry point to the class and application.
     * @param args Array of String arguments.
     */

    public static void main(final String[] args) {

        // Here, numer contains some odd values.

        int []numer = {4, 8, 15, 32, 64, 127, 256, 512 };
        int []denom = {2, 1, 0, 4, 4, 0, 8 };

        for (int i = 0; i < numer.length; i++) {

        try {

            if ((numer[i] % 2) != 0) {

                throw new NonIntResultException(numer[i], denom[i]);
            }

            if ((denom[i] == 1)) {

                throw new SameIntReturnException(numer[i], denom[i]);
            }


            System.out.println(numer[i] + " / "
                           + denom[i] + " is "
                           + numer[i] / denom[i]);
        } catch (ArithmeticException exc) {

            // catch the exception

            System.out.println("Can't divide by Zero!");

        } catch (ArrayIndexOutOfBoundsException exc) {

            System.out.println("No matching element found.");

        } catch (NonIntResultException exc) {

            System.out.println(exc);

        } catch (SameIntReturnException exc) {

            System.out.println(exc);

      }

    }

   }


}
