package Looping;

import java.util.Scanner;

public class Assignment {
	
	//reverse number 
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number: ");
		int num = sc.nextInt();
		
		int reverse = 0;
		while(num!=0)
		{
			reverse = reverse*10 + num%10; //to find last digit of number
			
			num = num/10;  // to eliminate the last digit of number 
			
		}
		System.out.println("reversed number: "+reverse);


		System.out.println("Enter String: ");
		String str = sc.next();
		String str1 = " ";
		for(int i=str.length()-1;i>=0;i--)
		{
			str1 = str1 + str.charAt(i);
		}
		System.out.println("reversed string: "+str1);
	}
	
	
	

}
