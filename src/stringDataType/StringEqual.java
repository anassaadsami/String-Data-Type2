package stringDataType;

public class StringEqual {

	public static void main(String[] args) {
	String x = "anas saad";
	String y = "anas saad";
	System.out.println(x==y); // == compare the address not the value and the both
// variable stored in the same addres in memory and thats why we can not use it with objects
	
	System.out.println(x.equals(y));   // equals compare the values, we use it with objects
	
	String x1 = new String("anas saad");
	String y1 = new String("anas saad");
	System.out.println(x1==y1);   // its false cause they have different address
	System.out.println(x1.equals(y1));     // true 
	
	if(!(x1 == "anas saad")) {
		System.out.println("that is true");
	}else {
		System.out.println("that is false");
	
	}
	
	if(!(x1.equals("ali"))){		// or (!x1.equals("ali"))
		System.out.println("that is true");
	}else {
		System.out.println("that is false");
	
	}
	// here x1 == "anas saad" its false cause we use new String("anas saad")
	
	if((x1 == "anas saad")== true) {		
		System.out.println("that is true");
	}else {
		System.out.println("that is false");
	
	}

}
}
