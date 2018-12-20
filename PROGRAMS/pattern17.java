class pattern17
{
	public static void main(String arsgs[])
	{
		int i,j;
		for(i=1;i<=5;i++)
		{
			for(j=1;j<=5;j++)
			{
				if(i>=2&&j>=2&&i<=4&&j<=4)
				{
					System.out.print(" ");
				}
				else
				{
					System.out.print("*");
				}
			}
			System.out.println("");
		}
	}
}
//OUTPUT//
/*
	* * * * *
	*	    *
	*	    *
	*	    *
	* * * * *
*/