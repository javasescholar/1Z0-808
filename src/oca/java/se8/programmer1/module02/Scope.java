package oca.java.se8.programmer1.module02;

/**
 *  Put simply, the scope of a variable is whereabouts in your program source you can actually see that variable used by its simple name.
 *  Initially, the scope of a variable is usually defined by the limits of where it is declared through to the closing curly brace of the block that encloses it.
 *  The essence of the scope of a simple variable is that it begins at its declaration and it ends at a closing curly brace of the block that it was declared in, but there are some exceptions.
 */
public class Scope {
    private  static int y = 99;                                                                                         // begin of scope of variable y starts with it's declaration

    public static void main(String[] args) {
        int x = y;                                                                                                      // begin of scope of variable x starts with it's declaration

        {
            // x = d;
            int j = 100;                                                                                                // begin of scope of variable j starts with it's declaration
            System.out.println("Values of j is " + j + " and x is " + x);
            int d = 100;                                                                                                // begin of scope of variable d starts with it's declaration
            x = d;
        }                                                                                                               // end of j and d variable scope

        // System.out.println("Value od j is " + j);
        // System.out.println("Value od d is " + d);
        System.out.println("Value od x is " + x);
    }                                                                                                                   // end of x variable scope

}                                                                                                                       // end of y variable scope
