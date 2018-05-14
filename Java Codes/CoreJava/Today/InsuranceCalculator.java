/** describe class. */
class InsuranceRate {
    /** Constructor. */

    protected InsuranceRate() {
    }

    /** @param birth passes the date of birth.
      * @return returns insurance amount.
      */
    public static int calculateRate(final String birth)throws Exception {

        final int year = 2015;
        int age = 0;
        /** @param birth passes the date of birth. */
        int birthYear = Integer.parseInt(birth);
        age = year - birthYear;

        if (age < 16) {

            System.out.println("Age is: " + age);
            throw new Exception();
        } else {

             int drivenYears = age - 16;
             if (drivenYears < 4) {
                 return 1000;
             } else {
                 return 600;
             }
        }
     }

}

/**
  * This is a main class.
  */

class InsuranceCalculator {

    /** Constructor. */

    protected InsuranceCalculator() {
    }

    /**
     * Sole entry point to the class and application.
     * @param args Array of String arguments.
     */

    public static void main(final String[] args) {

        InsuranceRate obj = new InsuranceRate();

        String inData = args[0];

        try {

        System.out.println("Your insurance is: " + obj.calculateRate(inData));

        } catch (Exception oops) {

        System.out.println("Too young for insurance!");

        }

    }
}
