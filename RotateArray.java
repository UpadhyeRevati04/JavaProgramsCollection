import java.util.*;
import java.io.*;
import java.lang.*;

class RotateArray {
    public static void rotateArrayByLeft(int[] arr, int lst) {
        int n = arr.length;
        
        lst = lst % n;
        reverse(arr, 0, lst - 1);
        reverse(arr, lst, n - 1);        
        reverse(arr, 0, n - 1);
    }
    
    public static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the number of elements in the array: ");
        int n = sc.nextInt();
        
        int[] arr = new int[n];
        
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        
        System.out.print("Enter the number of positions to rotate to the left: ");
        int lst = sc.nextInt();
        
        System.out.println("Original array: " + Arrays.toString(arr));
        
        rotateArrayByLeft(arr, lst);
        System.out.println("Array after rotating by " + lst + " positions to the left: " + Arrays.toString(arr));
        sc.close();
    }
}
