import java.util.*;
import java.io.*;
import java.lang.*;
 
class StringPalindrome{
	public boolean findStringPalindrome(String str){
		String rev = "";
		Boolean ans =false;
		for(int i =str.length()-1;i>=0;i--){
			rev = rev+str.charAt(i);
		}
		if(str.equals(rev)){
			ans = true;
		}
		return ans;
	}
	public static void main(String ar[]){
		Scanner sc = new Scanner(System.in);
		StringPalindrome sp = new StringPalindrome();
		System.out.println("Enter string : ");
		String str = sc.nextLine();
		str.toLowerCase();
		Boolean a = sp.findStringPalindrome(str);
		if(a == true){System.out.println("The String is Palindrome");}
		else{System.out.println("The String is not Palindrome");}
		
	}
}