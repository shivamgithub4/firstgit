package starpattern;

public class star_3 {

	public static void main(String[] args) {
int space=0,star=3;
for(int row=1;row<=5;row++){
	for(int i=1;i<=star;i++){
		System.out.print("*");
	}
	for (int j=0;j<=space;j++){
		System.out.print(" ");
	}
	
System.out.println();
star--;
space++;
}}}
