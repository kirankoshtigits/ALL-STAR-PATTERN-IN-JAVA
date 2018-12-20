class pattern11
{
	public static void main(String args[])
	{
		int i,j,k;
		for(i=1;i<=8;i++)
		{
			for(j=1;j<=i;j++)
			{
				if(j<i)
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
		for(i=1;i<=8;i++)
		{
			for(j=7;j>=i;j--)
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
				  *

				  
*/