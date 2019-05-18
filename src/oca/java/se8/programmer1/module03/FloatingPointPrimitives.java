package oca.java.se8.programmer1.module03;

/**
 * Floating point data types are used to represent numbers with decimal point.
 * They are stored in a special way that allows them to represent a far greater total range than the int and long variables, but with less precision overall.
 * Limitation of precision results in rounding errors.
 *
 * float - can store 32 bit numbers
 * double - can store 64 bit numbers
 *
 * Double literal is a number that's been written out in the source code, e.g. 6.66, 1e25, 1e-25, .22e-23, etc.
 * The suffix D can actually be appended to any of the literal forms for floating point numbers,
 * but this is generally redundant because as soon as the compiler recognizes you have a floating point type literal format, it creates a double by default.
 *
 * To make a literal floating point you need to use suffix F.
 * Assigning a double literal value to a float data type is not possible even if the value fits.
 *
 *
 */
public class FloatingPointPrimitives {

    private void floatingPointDataTypes(){
        double d = 6.66;
        double d2 = 1e25;
        double d3 = 1e-25;
        double d4 = .22e-23;
        double d5 = 1D;
        double d6 = 7.77D;                      // suffix D here is redundant since compiler will do this for us

        //float f = 1.0;                        // 1.0 is double literal, and assigning double to float implicitly is not possible
        float f2 = 1.0F;

        float ff1 = Float.NaN;
        float ff2 = Float.NEGATIVE_INFINITY;
        float ff3 = Float.POSITIVE_INFINITY;

        double dd1 = Double.NaN;
        double dd2 = Double.NEGATIVE_INFINITY;
        double dd3 = Double.POSITIVE_INFINITY;
    }
}
