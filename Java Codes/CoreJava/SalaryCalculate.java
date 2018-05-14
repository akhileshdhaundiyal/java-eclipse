//  * This program demonstrates the use of abstract class and methods.
  
abstract class Staff {
    /** Stores the name. */
    protected String name;

    /** Constructor.*/
    Staff() {
    }

    /** Constructor.
     * @param str passed to the constructor
     */
    Staff(String str) {
    name = str;
    }

    /** Abstract method.
     * @return double
     */
    abstract double calculatePay();
}


class Teacher extends Staff {

    /** Stores the number of class taken. */
    protected int classTaken;

    /** Constructor.
     */
    Teacher() {
    }

    
    Teacher(String str, int num) {
       super(str);
       classTaken = num;
    }

    /** Method Overriden.
     * @return classTaken
     */
    double calculatePay() {
        return 100 * classTaken;
    }
}




class NonTeachingStaff extends Staff {

    /** Stores the hours worked. */
    protected int hoursWorked;

    /** Constructor.
     */
    NonTeachingStaff() {
    }

    /** Constructor.
     * @param str passed to the constructor
     * @param hours passed to the constructor
     */
    NonTeachingStaff(String str, int hours) {
        super(str);
        hoursWorked = hours;
    }

    /** Method Overriden.
     * @return classTaken
     */
    double calculatePay() {
        return 50 * hoursWorked;
    }
}

/**
  * This class tests the object references.
  * @version 1.0 20 May 2005
  * @author Michael
  */

class SalaryCalculate {

    /** Constructor. */
    protected SalaryCalculate() {
    }

     /**
      * This is a main method.
      * @param args passed to the main method
      */
    public static void main(String[] args) {

        Teacher teachObj = new Teacher("John", 48);
        double earning = teachObj.calculatePay();
        System.out.println("The teacher " + teachObj.name
        + " is earning: " + earning);
        NonTeachingStaff nonTeachObj = new NonTeachingStaff("Paul", 64);
        earning = nonTeachObj.calculatePay();
        System.out.println("The non teaching staff "
        + nonTeachObj.name + " is earning: " + earning);
    }
}
