package oca.java.se8.programmer1.module03.declaration;

/**
 * Variables can be declared as member(instance,attributes) variables or local(stacked,automatic) variables.
 * Variable names must conform to Java's rule for identifiers - must start with a letter, and underscore, or a dollar symbol,
 * after the first character numbers can be used to.
 * Multiple variables of the same type can be declared in a single line, each separated by the comma.
 *
 * Both are declared in the same way with addition of access modifiers which can be used when declaring member variables
 *  <access_modifier> <variable_type> <variable_name>
 *
 * Access modifiers controls what parts of a program's code can see and use the value of a variable.
 * Access modifiers can be one of public, protected, private, or default if nothing is specified explicitly.
 */
public class Declarations {

    // member variable declaration examples
    public int a;
    private java.util.Date someDate;
    protected int[] aa;
    String someString1,someString2,someString3;


    // local variable declaration examples, notice that access modifier is forbidden for local variables
    public void someMethod(){
        //private int _a;
        //int 2wrongIdentifier;

        int _localA;
        java.util.Date $localDate;
        int[] localArray23;
    }
}
