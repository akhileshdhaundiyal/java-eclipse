

/** Object of this class is called in main class. */
class Demo {

    /** Constructor. */

    protected Demo() {
    }

    /** Through an exception out of the method. */

    public static void displayA() {

        try {

            System.out.println("inside displayA");
           // throw new RuntimeException("demo");
        } finally {

                System.out.println("inside displayA finally");
        }
    }

    /** Return from within a try block. */

    public static void displayB() {

        try {

            System.out.println("inside displayB");
            return;

        } finally {

                System.out.println("inside displayB finally");
        }
    }

    /**Execute a try block normally. */

    public static void displayC() {

        try {

            System.out.println("inside displayC");

        } finally {

                System.out.println("inside displayC finally");
        }
    }
}

/**
  * This is a main class.
  */

class FinallyDemo {
    /** Constructor. */

    protected FinallyDemo() {
    }

    /**
     * Sole entry point to the class and application.
     * @param args Array of String arguments.
     */


    public static void main(final String[] args) {

        Demo obj = new Demo();
        try {

            obj.displayA();
        } catch (Exception e) {

        System.out.println("Exception caught");
        }
    obj.displayB();
    obj.displayC();
    }
}

