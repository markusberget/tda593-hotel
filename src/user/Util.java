package user;

class Util {

	// convert a number to its corresponding unicode character.
	static public String toChar(int c) {
		return Character.toString((char)c);
	}
	
	// repeat the character c exactly n times.
	static public String repeatChar(char c, int n) {
		StringBuilder sb = new StringBuilder(n);
		while (n-- > 0)
		  sb.append(c);
		return sb.toString();
	}
	
	// Used in the test cases. 
	public final static String NON_ASCII_STRING1 = "innebandymålvaktsskyddsförsäljare";
	public final static String NON_ASCII_STRING2 = "笑うかどには福来る";
	
	public final static String adminUsername = "pelle";
	public final static String adminPassword = "hunter2";
	
}
