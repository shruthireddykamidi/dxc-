package jp;

public class primitive {

	public static void main(String[] args) {
	
		
		int[] num= {1,2,3,4};
		int toFind=5;
		
	for(int n: num)
	{
		if(n== toFind)
		{
			
			System.out.println(toFind + " this is founded");

			System.exit(0);
		}
	}
	
	
	
		System.out.println(toFind + " this is not  founded");

	}		
}

	


