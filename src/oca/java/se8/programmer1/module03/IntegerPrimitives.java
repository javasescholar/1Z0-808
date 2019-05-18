package oca.java.se8.programmer1.module03;

/**
 * Integer data types are used to represent whole numbers, and there is for types of them in Java: byte, short,int and long.
 * Char data type although used to represent characters has integer numeric properties.
 *
 * byte - can store 8 bit numbers
 * short - can store 16 bit numbers
 * int - can store 32 bit numbers
 * long - can store 64 bit numbers
 * char - almost a number data type can store up to 16 bit of storage, but it doesn't store negative numbers.
 *
 * Java platform independence allow that integer data type actually takes more memory, but still they must behave like they have
 * exact number of bits as it's defined above.
 *
 * Integer literal value is a number that's been written out in the source code, and it's not restricted to initialization expressions.
 * decimal literals, octal literal, hexadecimal literal and binary literal are all int(32bit) types by default.
 * This means that if we try to write a literal which is larger that 32 bits, compiler will complain.
 *
 * long literal is decimal literal with suffix l or L at the end of it.
 *
 * Assigning a literal value or a expression to a variable of smaller range is possible only if the value can be calculated at the compile time,
 * i.e. if the initialization value is obtained during the runtime Java will prohibit such initialization. This is also not possibe if the
 * expression is of a long type, even if the value fits.
 *
 * Underscore character can be used in integer literal as a separator between two digits in a number.
 * You can't put it at the beginning, at the end or next to the X of a hex declaration or the B of a binary declaration.
 *
 *
 */
public class IntegerPrimitives {

    private void integerDataTypes(){
        byte b = 1;                     // decimal literal
        short s = 077;                  // octal literal
        //short s2 = 078;

        int i = 0xFF;                   // hexadecimal literal
        long l = 0b0101010101010;       // binary literal
        int i2 = 0XFF;                  // hexadecimal literal
        long l2 = 0B0101010101010;      // binary literal

        char c = 1;

        // assigning a literal to a variable of smaller type
        short maliBroj = 100;
        //short maliBroj2 = i;
        //short maliBroj3 = 100+i;

        short maliBroj4 = 100+45;
    }

    private void integerSeparator(){
        int sepN = 1_0_0_0_0;

        //int sepN1 = 0xFF_;
        //int sepN2 = 0x_FF;
        //int sepN3 = _100;
        //int sepN4 = 0_xFF;
    }
}
