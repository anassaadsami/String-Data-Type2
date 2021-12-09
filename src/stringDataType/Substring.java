package stringDataType;
public class Substring {

	public static void main(String[] args) {


		String str = "anas saad sami nadfir anas saad ksjdfhsldfk ";
//		              01234567890123456789012345678901234567890123
		System.out.println(str.substring(6,10));
		System.out.println(str.substring(6,str.length()-2));
		
		System.out.println(str.substring(str.indexOf("saad"),str.lastIndexOf('f')));
		System.out.println(str.substring(str.indexOf("saad"),str.indexOf('f')));
//		System.out.println(str.substring(str.charAt(0),str.length()-1));
		System.out.println(str);
//		System.out.println(str.substring("anas",str.length()-1));
//		we can not put String dirktly 
//		System.out.println(str.substring(str.charAt(20),str.charAt(30)));   its wronge
		

	}

}