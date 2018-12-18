package com.tom;

public class StringTester {

	public static void main(String[] args) {
		int n = 100;
		
		String s = "Hello world";
		//          01234567890
		String s2 = new String("Hello world");
		System.out.println(s == s2);
		System.out.println(s.substring(8));
		
		//up4tj  dlrow olleH (將s字串反過來印)
		for(int i = s.length()-1; i>=0; i--){
			System.out.print(s.charAt(i));
		}
		//Jack boss Eric (將s3的字串內的Tom改成boss)
		String s3 = new String("Jack Tom Eric");
		//                      0123456789012
		System.out.println();
		s3 = s3.replace("Tom", "boss");
		System.out.println(s3);
		System.out.println(s2.indexOf("r"));
		System.out.println(s2.lastIndexOf("c"));
		
		/*String name = "Tom";
		int index = s3.indexOf(name);
		System.out.println(index);
		System.out.print(s3.substring(0,  index) + "boss"
		+ s3.substring(index+name.length()));*/
		
		int nn = Integer.parseInt("12");
		float f = Float.parseFloat("55.3");
		nn++;
		System.out.println(nn);
		String.valueOf(nn);
	
	}

	}


