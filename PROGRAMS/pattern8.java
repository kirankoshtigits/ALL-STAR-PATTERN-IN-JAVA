class pattern8
{
	public static void main(String args[])
	{
		int i,j,k,l;
		for(i=1;i<=4;i++)
		{
			for(j=1;j<=i;j++)
			{
				System.out.print(" ");
			}
			for(k=4;k>=i;k--)
			{
				System.out.print("* ");
			}
			System.out.println(" ");
		}
	}
}


//OUTPUT//
/*

  * * * *
   * * *
    * *
	 *
	 
*/
