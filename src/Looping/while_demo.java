package Looping;

public class while_demo {

	public static void main(String[] args) 
	{
		
		//while loop 
		int i =1;
		while(i<=10)
		{
			if(i%2 == 0)
			{
				System.out.println(i + " even");
			}
			else {
				System.out.println(i + " odd");
			}
			i++;
		}
		
	}
}
