class pattern5
{
	public static void main(String args[])
	{
		int i,j,k;
		for(i=1;i<=4;i++)
		{
			for(j=1;j<=i;j++) //CREATE SPACE TRIANGLE FOR LOOP
			{
				System.out.print(" ");
			}
			for(k=4;k>=i;k--) //CREATE STAR TRIANGLE FOR LOOP
			{
				System.out.print("*");
			}
			System.out.println("");
		}
	}
}

//OUTPUT//
/*
	
	****
	 ***
	  **
	   *
*/