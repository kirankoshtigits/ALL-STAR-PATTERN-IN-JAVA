class pattern14
{
	public static void main(String args[])
	{
		int i,j;
		for(i=1;i<=8;i++)
		{
			for(j=8;j>=i;j--)
			{
				if(j>i)
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
			*
		   *
		  *
		 *
		*
	   * 
*/