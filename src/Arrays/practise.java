package Arrays;

public class practise {

	public static void main(String[] args) {
		
		
		//search element from array 
		int a[] = {100,200,100,400,500,100,10};
		int search = 100;
		for(int f=0;f<a.length;f++) 
		{
			if(a[f] == search)
			{
				System.out.println("search number found: "+search);
				break;
			}
			
		}
		
		System.out.println("-------------------------");
		
		//search for duplicate 
		int b[] = {500,300,100,300,500,400,100};
		int temp =0;
		boolean status = false;   //false = not found   true = found 
	
		
		for(int i=0;i<b.length-1;i++) //first 
		{
			for(int j=i+1;j<=b.length-1;j++)
			{
				if(b[i] == b[j]) {
					temp = b[i];
					b[i] = b[j];
					b[j] = temp;
				
					System.out.print(temp+" ");
					status = true;
				}
			}	
		
		}
		
		if(status == false) {
			System.out.println("no duplicate found");
		}
		
		
		
		//find no.of repeated of particular number 
		int c[] = {10,20,10,30,20,40};
		int search1 = 10;
		int count =0;
		for(int i=0;i<c.length-1;i++)
		{
			if(c[i] == search1) {
				count++;
				System.out.println(search1+" "+count);
			}

		}
	}
}
