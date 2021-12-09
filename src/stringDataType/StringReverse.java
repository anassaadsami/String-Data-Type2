package stringDataType;

public class StringReverse {

	public static void main(String[] args) {
		String str = "aaaaaaabbbbbbb";
		// str is a immutable String which can not change the orignal form after methods
		// on it
		String str1 = reverse3(str);
		System.out.println(str1);
		System.out.println(str);
		System.out.println();
		StringBuilder str2 = new StringBuilder(reverse1(str1));
		System.out.println(str2);
		System.out.println();
		
		StringBuilder str3 = new StringBuilder("ali");
		System.out.println(reverse4(str3));
		
		
//		Stringbuilder str6 =reverse5(str3);     error casue reverse5 returns String so we can not 
// 												spare it in StringBuilder variable
	}

	public static void reverse2(String orignal) {
		for (int i = orignal.length() - 1; i >= 0; i--) {
			char newString = orignal.charAt(i);
			System.out.print(newString + "   ");
		}
	}

	// this method return String and we can (finally) spare it in a variable
	// but it can not takes a StringBuildert as a parameter

	public static String reverse3(String name) {
		String reversedName = "";
		for (int i = name.length() - 1; i >= 0; i--) {
			reversedName += name.charAt(i);
		}
		return reversedName;
	}

	// this method returns a String so it is not WORHTY

	public static String reverse1(String orignal) {
		String reverserad = new StringBuilder(orignal).reverse().toString();
		return reverserad;

	}
	
	//this method returns a StringBuilder 

	public static StringBuilder reverse4(StringBuilder name) {
		StringBuilder reversedName = new StringBuilder() ; // create a StringBuilder inside method 
		
		for (int i = name.length() - 1; i >= 0; i--) {
		reversedName = 	reversedName.append(name.charAt(i));
		}
		return reversedName ;
	}
	// this method retruns a String not Stringbuilder
	
	public static String reverse5(StringBuilder name) {
		return new StringBuilder(name).reverse().toString();
		
	}
		
}