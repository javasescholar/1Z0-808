package oca.java.se8.programmer1.module02.structure;

/**
 * A Java class can contain variables : static variables and nonstatic variables.
 * A Java class can contain methods : static methods and nonstatic methods.
 *
 * A Java class can contain constructors : special method used to initialize objects of that class before they are made available for regular use.
 * Cannot have return value and name must exactly match it's class name.
 *
 * A Java class can contain another class called inner or nested classes.
 *
 * The class, unlike the lines of code that you would get inside a method, does not mind what order things are declared in.
 *
 * public class is available from anywhere in our Java program.
 * !public class can only be used from inside the same package that the class was declared in.
 * abstract class cannot be instantiated.
 */
public class ClassStructure {
    public float getTemperature() {
        return temperature;
    }

    public static int getABigNumber(){
        return A_BIG_NUMBER;
    }

    private static int A_BIG_NUMBER = 123456;
    private float temperature;

    public ClassStructure(){

    }

    public void makeOne(){
        AConcept ac = new AConcept();
    }

    public oca.java.se8.programmer1.module02.structure.substructure.SecretiveClass sc;

    class AnInnerClass {
        public void doStuff(){}
    }
}
