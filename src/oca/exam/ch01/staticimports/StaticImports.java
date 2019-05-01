package oca.exam.ch01.staticimports;

// static import static member out from class System 
import static java.lang.System.out;
// static import of all static members in Integer class
import static java.lang.Integer.*;

public class StaticImports {

	public static void main(String[] args) {
		out.println(MAX_VALUE);
		out.println(toHexString(42));
	}
	
}
