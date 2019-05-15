package oca.java.se8.programmer1.module02;

/**
 * Under certain circumstances, the scope of a variable might be, essentially, inside a block, even though the declaration is outside the block, coming just before it.
 * The two basic conditions under which this will occur are for simple for loops and also for the formal parameters of a method.
 */
public class SpecialScopeCase {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++)                                                                                    // scope of variable i starts with it's declaration
            System.out.println("i is " + i);                                                                            // end of variable i scope
        //System.out.println("final i is " + i);

        int j = 0;
        for (int i = 0; i < 10; i++){                                                                                   // scope of variable i starts with it's declaration
            System.out.println("i is " + i);                                                                            // end of variable i scope
            j += i;
        }
        //System.out.println("final i is " + i);
        System.out.println("final j is " + j);
    }

    public void doStuff(int i) {                                                                                        // scope of variable i starts with it's declaration
        System.out.println("i is " + i);
    }                                                                                                                   // end of variable i scope
}
