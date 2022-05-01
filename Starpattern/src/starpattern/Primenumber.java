package starpattern;

public class Primenumber {
	public static void main(String[] args) {
		int a=2;
		int b=89;
		for(int i=a;i<b;i++)
		{
		for (int j=2;j<i;j++)
		{
		if(i%j==0)
		{
		break;
		}
		System.out.println(i);
		}}}}
