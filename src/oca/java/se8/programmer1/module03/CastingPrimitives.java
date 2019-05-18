package oca.java.se8.programmer1.module03;

/**
 *  Casting - cast is that sometimes it's possible to look on a piece of data in a number of ways.
 *  Java is a strongly and statically typed language.
 *  The cast consists of parentheses containing a type name. The effect of the cast operator is to tell the system that you want to look at the thing you're casting as a whatever the cast type is.
 *  Notice this does not change the original value. It creates a new, actually temporary value of the target type.
 *
 *  Majority of arithmetic operators produce int sized results, even when their operands are both smaller than int.
 */
public class CastingPrimitives {

    private void castingExamples(){
        int x = 123;
        byte b = 123;

        //byte b2 = x;
        //byte b2 = 12345;               // too big
        byte b2 = (byte)x;

        float f = 1*2;                  // ok int literal
        //float f2 = 1 * 2.0;           // not ok double literal
        float f3 = 1*2.0f;

        byte b11 = 10;
        byte b22 = 12;
        //byte b3 = b11+b22;            // arithmetic results with integer type, being unable to cast it to byte

        byte b4 = (byte)1234;           // compiles but overflow occurs, and wrong result will be saved as a result
    }
}
