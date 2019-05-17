package oca.java.se8.programmer1.module02.packageone;

//import java.util.Date;

/**
 * Packages - group classes together for maintenance reasons.
 * All classes within same package can refer to each other by it's class name.
 *
 * To use classes from another packages we have two ways:
 *  use full qualified name of  the class, e.g. java.util.Date
 *  use import statement, and refer to class name using it's short name
 *
 *  NOTE: Generated binary always use the long, full qualified class name, so imports are used just for code cleanup
 */
public class Imports1 {

    public static void main(String[] args) {
        System.out.println("Today is " + new java.util.Date());
        //System.out.println("Today is " + new Date());
    }
}
