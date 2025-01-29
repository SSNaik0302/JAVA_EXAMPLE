package Looping;

public class Jumping {
	
	public static void main(String[] args) {
		
		//break statement 
		for(int i=1;i<=10;i++)
		{
			if(i==5)
			{
				break; //exist the looping statement 
			}
			System.out.println(i);
		}
		
		//continue statement 
		for(int i=1;i<=10;i++)
		{
			if(i%2 == 1)
			{
				continue; //skips particular statement when condition is true 
			}
			System.out.println(i);
			
		}
	}

}
