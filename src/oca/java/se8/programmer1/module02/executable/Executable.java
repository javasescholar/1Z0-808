package oca.java.se8.programmer1.module02.executable;

/**
 * Entry point to every Java program is "legal" main method, which is called by the JVM.
 * Legal main method must be public.
 * Legal main method must be static.
 * Legal main method must be void.
 * Legal main method be called "main".
 * Legal main method take single array of strings as argument.
 *
 * Main method can be overloaded but those methods will not be used as entry point to your application.
 */
public class Executable {

    //public static void main(String... args){                                                                          // legal main method
    //public static void main(String[] args){                                                                           // legal main method
    public static void main(String argumenti[]){                                                                        // legal main method
        System.out.println("Test main method legality");
    }

    // overloaded main 1 - not executable
    public static int main(int[] a){
        return 0;
    }

    // overloaded main 2 - not executable
    public float main(){
        return 0;
    }

}
