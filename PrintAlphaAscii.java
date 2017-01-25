
/*  Program to print the characters corresponding to ASCII codes from 65 to 90 */

public class PrintAlphaAscii {
	
	public static void main(String args[])
	{
		/*char ch = 'a';
		
		for (int i=65;i<=90;i++)
		{
			System.out.print(""+ch+" ascii is => ");
			System.out.println(""+i);
		}*/
		
		for (int c=65; c<=90; c++)
		{
			System.out.println(c + ": " + (char)c);
		} 
	}

}
