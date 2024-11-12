import java.util.*;
import java.io.*;
import java.lang.*;

class ReverseString{
	public static void main(String ar[]){
		Scanner sc = new Scanner(System.in);
		String str,nstr="";
		char ch;
		System.out.println("Enter the String : ");
		str = sc.nextLine();
		for(int i= 0;i<str.length();i++){
			ch = str.charAt(i);
			nstr = ch + nstr;
		}
		System.out.println(nstr);
	}
}