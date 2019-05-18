package oca.java.se8.programmer1.module03.initialization;

/**
 * Local variables don't have default value after their declarations, and compiler will complain if we try to read it.
 * Member variables get default "zero" value after they are declared:
 *  0 for numeric types, false for boolean, and null for reference types.
 *
 *  Variables can be initialized within the declaration statement or in own statement after it's declaration.
 *  Multiple variables of same type can be initialized from within the same statement.
 *  For variable initialization, besides literal value you can use other variables, computable expressions and methods.
 *
 */
public class Initializations {

    private void initializations(){
        int x = 666;
        float f = 23.0f;

        int computed = 5*(23-x)/7;

        double d = Math.random()*1000;

        int i = 1, j = 2, k = i + j;
    }
}
