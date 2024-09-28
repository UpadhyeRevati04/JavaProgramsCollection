import java.lang.*;
import java.util.*;

class SwapT{
	public static void main(String[] arg){
	int x,y,temp;
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter values of X and Y ");
	x = sc.nextInt();
	y = sc.nextInt();
	System.out.println("Values are\nX = "+x+"\nY = "+y);
	x = x + y;
	y = x - y;
	x = x - y;
	System.out.println("\nValues after swapping are\nX = "+x+"\nY = "+y);
}
}