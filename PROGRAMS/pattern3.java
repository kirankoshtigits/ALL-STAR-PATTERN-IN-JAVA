class pattern3
{
	public static void main(String args[])
	{
		int i,j;
		for(i=1;i<=4;i++)      //First For Loop       
		{
			for(j=1;j<=i;j++)
			{
				System.out.print("*");
			}
			System.out.println("");
		}
		for(i=1;i<=3;i++)   //Second For Loop
		{
			for(j=3;j>=i;j--)
			{
				System.out.print("*");
			}
			System.out.println("");
		}
	}
}

//OUTPUT
/*
	FIRST YOU CAN UNDERSTAND PATTERN1 AND PATTERN2 TTHEN U CAN UNDERSTAND PATTERN3
	
	*
	**
	***
	****
	***
	**
	*
	
	This pattern devide two parts
	
	1.First For Loop  			  2. Second For Loop
		*           			  *** 
		**			  			  **	
		***			  			  *
		****
*/