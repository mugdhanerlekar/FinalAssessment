package corejava;

import java.util.Scanner;

public class VowelQ1 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a string");
		String str = sc.nextLine();
				for(int i=0;i<str.length();i++) {
					if(str.charAt(i) =='a'|| str.charAt(i)=='e'|| str.charAt(i)=='i'||str.charAt(i)=='0' ||str.charAt(i)=='u') {
						//System.out.println("string contains vowel");
					}
				//System.out.println("string contains vowel");
					//else //{
						//System.out.println("string doesn't contain vowel");
					//}
						
				}
				System.out.println("string contains vowel");
				
	}

}
