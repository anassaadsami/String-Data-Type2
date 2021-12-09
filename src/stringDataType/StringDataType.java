package stringDataType;

public class StringDataType {
	public static void main(String[] args) {
//	 1- equals -----> boolean
		String name = "anas saad";
		
		boolean y = name.equals("anas saad");
		System.out.println(y);
		
//   2-  equalsIgnorCase ----> boolean 		
		boolean x = name.equalsIgnoreCase("Anas saad");
		System.out.println(x);
		
//	 3- isEmpty ----> boolean 
		String g = "";  // g = " "; ----> false 
		boolean l = g.isEmpty();
		System.out.println(l);
		
//	 4- trim 
		String name1 = "    anas saad   ";
		String name2 = name1.trim();
		System.out.println(name2);
		System.out.println(name1.trim());
		
//   5- replace char or String  ----> String
		System.out.println(name2.replace('a','l'));
		System.out.println(name2.replace("anas","ahmed"));
		
//	 6- length(); -----> int
		System.out.println(name1.length());
		System.out.println(name2.length());
		
//	 7- toUpperCase() and toLowerCase()
		System.out.println(name1.toUpperCase());
//		in this case we make the both methods together
		System.out.println(name1.trim().toUpperCase());
		
//	 8- charAt();-----> char 
		char r = name1.charAt(10);
		System.out.println(r);
//		or we can do it direkt
		System.out.println(name1.charAt(10));	
// 		the last index are the length of string-1		
		char k = name2.charAt(name2.length()-1);
		System.out.println(k);
		
//	 9- indexOf -----> int 
		
//		if we put a char which not exist in the String it return -1
		System.out.println(name1.indexOf('g'));
		// if we put string so we get the index of start of this string :
		String name3 ="anas saad sami nadir saad";
		System.out.println(name1.indexOf("anas"));
//		 if there is more than one word it takes the first 
		System.out.println(name1.indexOf("saad"));
		
		int m = name1.indexOf('d');
		System.out.println(m);
		
		int t = name1.indexOf('a');
		System.out.println(t);
		
		
//	 10- concatenate 
		String w = "tania";
		String q = "fahad";	
		String z = "tania";
		
		System.out.println(w.concat(q)); // equal w+q
	    System.out.println(w+" ".concat(q));
		System.out.println(w+" "+q);
		System.out.println(w+q);
//		String a = System.out.println(w+q); 	its wrong
		String c = w +" "+ q ;
		System.out.println(c);
//		String d = System.out.println(c);
//		 WE CAN NOT EQUAL THE SYSTEM.OUT.PRITN() TO A VARIABLE
//		 VOID CAN NOT CONVERT TO any DATA TYPES
		System.out.println(c.indexOf("fahad"));
		System.out.println((w+q+z).lastIndexOf("tania"));
		
//	 11-subStirng
		String v = "fahad saad nadir ali\n";
		String v1 = "fahad saad nadir ali";
		System.out.println(v.substring(5));
		
		
//		String o = "fahad saad nadir ali".substring('s','d');
//		System.out.println(o);
//		 i dont know why we can not seperate the String with its char 
//		but we can do it by its index but this way works (:
		System.out.println(v1.substring(v1.indexOf('h')));
		System.out.println(v1.substring(v1.indexOf("saad")));
		
//		System.out.println(v1.substring('d'	, 'l'));
//		System.out.println(v1.charAt(2),v1.charAt(v1.length()-1));
		System.out.println(v1.indexOf(v1.length()-1));
		
		System.out.println("anas saad sami".substring(9, 13)); 
		System.out.println(v.substring(4,12));
		
		 name3 ="anas saad sami nadir saad";
		 System.out.println(name3.substring(name3.indexOf('n'), name3.indexOf('r')));
		
//	12-repeat 
		System.out.println(v.repeat(5));
		System.out.println(v); // \n is not account with String
		System.out.println(v.equals(v1)); // its not equal
		System.out.println(v);
//	13- startsWith   endsWith----->   boolean
//		its just apply with String not char
		System.out.println(v1.endsWith("fahad"));
		System.out.println(v1.startsWith("fahad"));
		
		
		
//	 14- contains   ----> boolean
//		we check if the String contains char or a part of text
		System.out.println(v1.contains("fah"));
		System.out.println(v.contains("\n"));
		System.out.println(v.contains(" nad"));
		

		
		
	
	}

}
