import java.lang.*;
import java.util.*;

class FindLargest{
	public static void main(String[] arg){
		int x,y,z;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter three integrs : ");
		x = sc.nextInt();
		y = sc.nextInt();
		z = sc.nextInt();
		if ( x > y && x > z )
 			System.out.println("First number is largest.");
 		else if ( y > x && y > z )
 			System.out.println("Second number is largest.");
 		else if ( z > x && z > y )
 			System.out.println("Third number is largest.");
		else
 			System.out.println("Entered numbers are not distinct.");
	}
}