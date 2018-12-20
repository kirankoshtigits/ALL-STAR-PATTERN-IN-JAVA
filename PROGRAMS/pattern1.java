class pattern1
{
	public static void main(String args[])
	{
		int i,j;
		for(i=1;i<=4;i++)    //Row For Loop
		{
			for(j=1;j<=i;j++) //Column For Loop
			{
				System.out.print("*");
			}
			System.out.println("");
		}
	}
}

//OUTPUT//
/*

		*
	    * *
	    * * *
		* * * *
		
*/