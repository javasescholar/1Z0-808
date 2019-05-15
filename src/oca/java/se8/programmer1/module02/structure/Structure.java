package oca.java.se8.programmer1.module02.structure;

import java.util.Date;
import java.util.List;
import java.util.ArrayList;

/**
 * Right at the top, the very first thing will be package statement.
 * The next thing can be one or more import statements.
 * You actually don't have to have a package statement, and you don't have to have any import statements.
 *
 * You can only have at most one public class or interface in one source file.
 *
 * The name of the Java class, if it's public, must exactly match the name, including it's capitalization, of the file that it is stored in.
 * The name of the package that the class belongs to must exactly match, including capitalization, the directory structure that the file is stored in.
 */
public class Structure {

    public static void main(String[] args){
        Date d = new Date();
        System.out.println("Today is " + d);
        List l = new ArrayList();
            // new java.util.ArrayList();
    }
}

class OtherClass{

}

interface AnInterface{

}