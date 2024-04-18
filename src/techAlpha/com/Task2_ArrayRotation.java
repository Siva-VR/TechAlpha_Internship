package techAlpha.com;

import java.util.Scanner;

public class Task2_ArrayRotation {
	 // Function to rotate array to the left by d positions
	public static void rotateArray(int arr[],int r) {
		
		int length = arr.length;
		// Create a temporary array to store elements to be rotated
		int temp[] = new int[r];
		// Copy the first r elements to temp array
		for (int i = 0; i < r; i++) {
			temp[i] = arr[i];
		}
		// Shift the remaining elements of arr[]
		for (int i = r; i < arr.length; i++) {
			arr[i-r]=arr[i];
		}
		 // Copy the elements from temp[] back to arr[] to the end
		for (int i = 0; i < r; i++) {
			arr[length-r+i] = temp[i];
		}		
	}
	// Function to print the array
	public static void printArray(int arr[]) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int sz = sc.nextInt();
		//create integer array 
		int arr[] = new int[sz];
		System.out.println("Enter elements of array");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("Enter number of elements to rotate");
		int r = sc.nextInt();
		rotateArray(arr,r);
		System.out.println("Array After Rotation ");
		printArray(arr);
		sc.close();
		
		
		
	}

}
