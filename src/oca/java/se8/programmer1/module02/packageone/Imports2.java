package oca.java.se8.programmer1.module02.packageone;

//import oca.java.se8.programmer1.module02.packageone.subpackage.ClassB;
//import oca.java.se8.programmer1.module02.packagetwo.ClassOne;

/**
 *  Package statement is optional, but if present it must come first.
 *  After that package statement, or first if there is no package statement, come the imports, which are optional too.
 *  After import statements comes code: classes, interfaces.
 *
 *  Using asterisk instead of class name we can import everything from that specific package:
 *      subpackage are not imported, as well as partial wildcard import is not possible
 *
 *  Special case is when we have two classes from different packages with same simple name - ambiguous import.
 *  Solution : explicit import one class, e.g. java.util.Date, and two another refer using fully qualified class name
 *  Solution : refer to both classes with fully qualified class name, just as the compiler do :)
 *
 *  NOTE: compiler will not complain for such imports, but it will complain if we try to reference e.g. Date object
 */

import java.util.*;
import java.sql.*;

public class Imports2 {
    public static void main(String[] args) {
        // we want this one to be from packageone
        ClassOne cOne = new ClassOne();
        System.out.println(cOne.toString());

        // class from different package can be referenced by using it's fully qualified class name
        oca.java.se8.programmer1.module02.packageone.subpackage.ClassA cA = new oca.java.se8.programmer1.module02.packageone.subpackage.ClassA();
        System.out.println(cA.toString());

        // class from different package can be referenced by using it's simple name if there is a proper import statement
        //ClassB cB = new ClassB();
        //System.out.println(cB.toString());

        // we want this one to be from packagetwo
        //oca.java.se8.programmer1.module02.packagetwo.ClassOne cOneAgain = new oca.java.se8.programmer1.module02.packagetwo.ClassOne();
        ClassOne cOneAgain = new ClassOne();
        System.out.println(cOneAgain.toString());

        //Date d = new Date();
    }
}
