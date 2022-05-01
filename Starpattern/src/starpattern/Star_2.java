package starpattern;

public class Star_2 
    {

	public static void main(String[] args)
	{
         int space =5, star =1;
         for (int row=1;row<=6;row++)
             {
        	 for (int j=1;j<=space;j++){
        		System.out.print(" "); 
        	 }
        	 for (int i=1;i<=star;i++){
        		 System.out.print("*");
        	 }
        	 System.out.println();
             star++;
             space--;
    }}}
