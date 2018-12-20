class pattern4
{
	public static void main(String args[])
	{
		int i,j,k;
		int num=4;
		for(i=1;i<=4;i++)   //ROW 
		{
			for(j=4;j>=i;j--)   //CREATE SPACE TRIANGE  
			{
				System.out.print(" ");
			}
			for(k=1;k<=i;k++)   //CREATE STAR TRIANGLE
			{
				System.out.print("*");
			}
			System.out.println("");
		}
	}
}
//OUTPUT//
/*
	SUPPOSE this is space traiangle created as empty
	
	aaaa
	aaa
	aa
	a
	
	AND STAR IS A TRIANGLE 
	   *
	  **
	 ***
	****
	
	COMBINATION OT SPACE AND STAR PATTERN LIKE
	 
	 aaaa*
	 aaa**
	 aa***
	 a****
*/