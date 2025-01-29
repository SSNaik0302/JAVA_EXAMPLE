package Looping;

public class pattern {
	
	/*
	  ****
	  ***
	  **
	  *
	  */
	public static void main(String[] args) {
		
		//nested for loop 
		int a[][] = {{100,200,300},{400,500,600},{700,800,900}};
		
		System.out.println("length of row: "+a.length);
		System.out.println("length of column: "+a[0].length);
		
		for(int r=0;r<a.length;r++)   //row
		{
			for(int c=0;c<a[r].length;c++)   //column
			{
				System.out.print(a[r][c]+" ");
			}
			System.out.println(" ");
		}
		
		
		System.out.println("--------------");
		
		/*
		 100
		 200 300
		 400 500 600
		 700 800 900 1000
		 */
		int num1 = 100;
		for(int r=1;r<=4;r++)  //row
		{
			for(int c=1;c<=r;c++)  //column
			{
				
				System.out.print(num1+" ");
				num1+=100;
				
			}
			System.out.println();
		}
		
		
		
		
		
		System.out.println("--------------");
		
		for(int r=4;r>=0;r--)  //row
		{
			for(int c=r;c>=0;c--)//column
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
		
		System.out.println("--------------------------");
		
		/*
		  *
		  **
		  ***
		  ****
		  */
		
		for(int r=1;r<=4;r++)  //row
		{
			for(int c=1;c<=r;c++)  //column 
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println("----------------------");
		/*
		    *
		   * *
		  * * *
		 * * * *
		  */
		
		for(int r=1;r<=5;r++)  //row
		{
			for(int space=5;space>r;space--) //spaces 
			{
				System.out.print(" ");
			}
			for(int c=1;c<=r;c++)  //column 
			{
				System.out.print("*"+" ");
			}
			System.out.println();
		}
		System.out.println("----------");
		
		/*
	    * * * *
	     * * *
	      * *  
	       * 
	  */
		
		for(int r=4;r>=1;r--)  //row
		{
			for(int s=1;s<=4-r;s++)  //spaces 
			{
				System.out.print(" ");
			}
			for(int c=r;c>=1;c--) //column
			{
				System.out.print("* ");
			}
			System.out.println(" ");
		}
		
	}
}
