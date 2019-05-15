package oca.exam.ch01;

public class DeclarationsAndAccessControlMain {

	public static void main(String[] args) {
		printPadded("Example01 : LegalIdentifiers.java - examples of legal identifiers");
		printPadded("Example02 : IlegalIdentifiers.java - examples of ilegal identifiers");
		printPadded("Example03 : ExecutableMain1.java - example of special main method 1");
		printPadded("Example04 : ExecutableMain2.java - example of special main method 2");
		printPadded("Example05 : ExecutableMain3.java - example of special main method 3");
		printPadded("Example06 : StaticImports.java - example of static import feature");
		printPadded("Example07 : PackageAccess1.java - example of accessing class with package access from another package");
		printDPadded("Example07 : Companion classes used in example - PackageAccess2.java,PackageAccess3.java");
		printPadded("Example08 : Interfaces.java - examples of interfaces, interface methods and interface constants");
		printPadded("Example09 : PublicMemberAccess.java - examples of accessing public members from another class");
		printPadded("Example10 : PrivateMemberAccess.java - examples of accessing private members from another class");
		
	}

	private static final int n = 160;
	private static final char c = '*';
	private static final String BREAK_STRING = "*******************************************************************************************";
	private static final String PRE_POST_FMT = "**********";

	private static void printDPadded(String s) {
		System.out.println(RPad(LPad(PRE_POST_FMT + " " + s + " " + PRE_POST_FMT, n-10, c), n + 10, c));
	}

	private static void printPadded(String s) {
		System.out.println(RPad(LPad(PRE_POST_FMT + " " + s + " " + PRE_POST_FMT, n, c), n + 10, c));
	}

	private static String LPad(String str, Integer length, char car) {
		return (str + String.format("%" + length + "s", "").replace(" ", String.valueOf(car))).substring(0, length);
	}

	private static String RPad(String str, Integer length, char car) {
		return (String.format("%" + length + "s", "").replace(" ", String.valueOf(car)) + str).substring(str.length(),
				length + str.length());
	}
	
}
