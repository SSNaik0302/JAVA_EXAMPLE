package Arrays;

public class multidimenstional {
	
	public static void main(String[] args) {
		
		//multi dimensional array 
		
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
				
				
	}

}
