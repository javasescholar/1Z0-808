package oca.java.se8.programmer1.module03;

/**
 *  The boolean primitive data can only have one of two values: true or false.
 *
 *  The char type is used to represent single characters: letters of the alphabet, symbols, and so on using 16-bit representation called Unicode.
 *  Literal char values are represented by surrounding the character with single quote marks.
 *  Char literals are converted by the input reading path of the Java compiler, meaning two things:
 *      - we can use them as part of a variable name
 *      - if used special symbols like 000a which is new line out program will break
 *  Escape sequence - backslash followed by one of a small range of specific characters
 *      \n  - line feed
 *      \b  - backslash
 *      \t  - horizontal tab
 *      \f  - form feed
 *      \r  - carriage return
 *      \"" - double quote
 *      \'  - single quote
 *      \\  - backslash
 *
 *   You can also use octal presentation w/o leading zero for characters that do not have more than eight significant bits.
 *   Numbers following a backslash, in the context of a char literal, are assumed to be octal.
 *   Max values is '\377'
 */
public class LogicalAndCharacterPrimitives {

    private void booleanDataTypes(){
        boolean istina = true;
        boolean laz = false;
        //boolean wrong = 1;
        boolean izraz = (1 != 0);
    }

    private void characterDataTypes(){
        char a = 'A';

        char shi = '\u559C';
        //char shi = '\U559C';
        char 喜 = '\u559C';

        char newLine = '\n';
        char newLine2 = '\12';

        char maxOctal = '\377';
        //char maxOctal2 = '\378';
    }

}
