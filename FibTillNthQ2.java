package corejava;

import java.util.Scanner;

public class FibTillNthQ2 {
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number");
		int n = sc.nextInt();
		int firstN=0,secondN=1;
		System.out.println(firstN);
		System.out.println(secondN);
		for(int i=2;i<n;i++)
		{
			int thirdN=firstN+secondN;
			System.out.println(thirdN);
			firstN=secondN;
			secondN=thirdN;
			
		}
	}

}
