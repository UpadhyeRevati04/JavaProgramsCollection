import java.lang.*; 
import java.util.*;

class GetInput{
	public static void main(String[] arg){
	int a; 
	String str;
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter your name : ");
	str = sc.nextLine();
	System.out.println("Enter your age : ");
	a = sc.nextInt();
	System.out.println("Your name is "+str.toUpperCase()+" and age is "+a);
}
}