class pattern7
{
	public static void main(String args[])
	{
		int i,j,k;
		for(i=1;i<=4;i++)
		{
			for(j=3;j>=i;j--)
			{
				System.out.print(" ");
			}
			for(k=1;k<=i;k++)
			{
				System.out.print("* ");
			}
			System.out.println(" ");
		}
	}
}


// (OR)

/*

class pattern7
{
	public static void main(String args[])
	{
		int i,j;
		for(i=1;i<=4;i++)
		{
			for(j=4;j>=1;j--)
			{
				if(j>i)
				{
					System.out.print(" ");
				}
				else
				{
					System.out.print("* ");
				}
			}
			System.out.println("");
		}
	}
}

*/


//OUTPUT//

/*

		*
	   * *
	  * * *
	 * * * *
	 
*/