import java.util.*;
import java.io.*;
import java.lang.*;

class RemoveDuplicateString{
	public static void main(String ar[]){
		Scanner sc = new Scanner(System.in);
		String str,nstr="";
		boolean[] seen = new boolean[256];
		System.out.println("Enter the string :");
		str = sc.nextLine();
		StringBuilder sb = new StringBuilder(str.length());
		for(int i=0;i<str.length();i++){
			char c = str.charAt(i);
			if(!seen[c]){
				sb.append(c);
				seen[c] = true;
			}
		}
		System.out.println(sb.toString());
		
	}
}