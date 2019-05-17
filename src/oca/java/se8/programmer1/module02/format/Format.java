package oca.java.se8.programmer1.module02.format;

import java.io.Console;

/**
 *  java.io.Console object is usually connected to the keyboard and screen that started the program.
 *  If the program's input or output was redirected, then the console object might not exist. - need to have null check to prevent NPE
 *
 *  System.in and System.out will be connected to the input and output streams of the program, whether they're redirected or not.
 */
public class Format {
    public static void main(String[] args) {
        int x = 99;
        float f = 5.2F;
        System.out.printf("The count is %d, and the mean is %f\n", x, f);

        Console c = System.console();
        if (c != null) {
            c.printf("java.io.Console formatirani %d text\n",x);
        }
    }
}
