package starpattern;

public class Starpattern {
	public static void main(String[] args) 
	{
		int space=52;
		int star=1;
		for (int i=1;i<=52;i++)
		    {
			for(int j=1;j<=space;j++)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=star;j++)
			{
				System.out.print("*");
			}
			System.out.println();
			space++;
			star--;
		    }}}
