import java.util.*;
import java.lang.*;
import java.io.*;

class MergeTwoArray {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int mlst = m - 1; 
        int nlst = n - 1;  
        int right = m + n - 1; 
        while (nlst >= 0) {
            if (mlst >= 0 && nums1[mlst] > nums2[nlst]) {
                nums1[right] = nums1[mlst];
                mlst--;  
            } else {
                nums1[right] = nums2[nlst];
                nlst--;  
            }
            right--; 
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the number of elements in nums1 (m): ");
        int m = sc.nextInt();
        
        System.out.println("Enter the elements of nums1: ");
        int[] nums1 = new int[m + 3]; 
        for (int i = 0; i < m; i++) {
            nums1[i] = sc.nextInt();
        }
        
        System.out.println("Enter the number of elements in nums2 (n): ");
        int n = sc.nextInt();
        
        System.out.println("Enter the elements of nums2: ");
        int[] nums2 = new int[n];
        for (int i = 0; i < n; i++) {
            nums2[i] = sc.nextInt();
        }
        
        MergeTwoArray mta = new MergeTwoArray();
        mta.merge(nums1, m, nums2, n);
        
        System.out.println("Merged array: " + Arrays.toString(nums1));
    }
}
