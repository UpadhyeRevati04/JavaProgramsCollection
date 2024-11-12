import java.util.*;
import java.io.*;
import java.lang.*;

class MaxConsecutiveOnes {
    public int findMaxConsecutiveOnes(int[] nums) {
        int n = nums.length;
        int count =0;
        int maxCount=0;
        for(int i =0;i<n;i++){
            if(nums[i]==1){
                count++;
            }
            else{
                maxCount=Math.max(maxCount,count);
                count=0;
            }
        maxCount = Math.max(maxCount, count);
        }
        return maxCount;
    }
	public static void main(String ar[]){
		Scanner sc = new Scanner(System.in);
		MaxConsecutiveOnes mco = new MaxConsecutiveOnes();
		System.out.println("how many elements you want to store : ");
		int n = sc.nextInt();
		System.out.println("Enter elements into array: ");
		int[] arr = new int[n];
		for(int i=0;i<n;i++){
			arr[i] = sc.nextInt();
		}
		int result= mco.findMaxConsecutiveOnes(arr);
		System.out.println("The maximum number of consecutive 1's is: " + result);
	}
}