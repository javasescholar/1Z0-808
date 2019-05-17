package oca.java.se8.programmer1.module02.executable;

/**
 * Entry point to every Java program is "legal" main method, which is called by the JVM.
 * Legal main method must be public.
 * Legal main method must be static.
 * Legal main method must be void.
 * Legal main method must be called "main".
 * Legal main method take single array of strings as argument.
 *
 * Main method can be overloaded but those methods will not be used as entry point to your application.
 *
 * In order to run this app from CLI you need to use fully qualified class name
 * e.g. from within the root package
 *  $ java oca.java.se8.programmer1.module02.executable.Executable 1 2 3 4 5
 * e.g. from another directory which is not one that directly contains root package, we need to use classpath
 *  $ java -cp H:\DevOps\learning_workspace\Java\1Z0-808\bin\ oca.java.se8.programmer1.module02.executable.Executable 1 2 3 4 5
 *
 *
 * Classpath is list of places where Java will search for source files, and it need to be specified if we want to run application from
 * within folder which is not the folder under which is root package folder placed.
 */
public class Executable {

    //public static void main(String... args){                                                                          // legal main method
    //public static void main(String[] args){                                                                           // legal main method
    public static void main(String argumenti[]){                                                                        // legal main method
        System.out.println("Test main method legality");
        for (int i = 0; i < argumenti.length; i++) {
            System.out.println("argumenti[" + i + "] = " + argumenti[i]);
        }
        System.out.println("END");
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
