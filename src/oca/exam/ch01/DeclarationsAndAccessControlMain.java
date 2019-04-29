package oca.exam.ch01;

public class DeclarationsAndAccessControlMain {

	public static void main(String[] args) {
		printPadded("Example01 : LegalIdentifiers.java - examples of legal identifiers");
		printPadded("Example02 : IlegalIdentifiers.java - examples of ilegal identifiers");

	}

	private static final int n = 160;
	private static final char c = '*';
	private static final String BREAK_STRING = "*******************************************************************************************";
	private static final String PRE_POST_FMT = "**********";

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
