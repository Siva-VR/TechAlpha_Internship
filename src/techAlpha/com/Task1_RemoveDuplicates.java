package techAlpha.com;

import java.util.Scanner;

class Remove_Duplicates{
	public int[]remove_Duplicates(int arr[]){
		int length = arr.length;
		if(length==1 || length ==0) {
			return arr;
		}
		//Here sort the array or else we can use this predefined method Arrays.sort(arr);
		int temp;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length-i-1; j++) {
				if(arr[j]>arr[j+1]) {
					temp =arr[j+1];
					arr[j+1] = arr[j];
					arr[j]=temp;
				}
			}
		}
		int j = 0;
		for (int i = 0; i < arr.length-1; i++) {
			if (arr[i]!= arr[i+1]) {
				arr[j++]=arr[i];
			}
		}
		arr[j]= arr[length-1]; 
		//int uniquearr[] = Arrays.copyOf(arr, j);
		
		int uniquearr[]= new int[j+1];
		for (int i = 0; i < uniquearr.length; i++) {
			uniquearr[i]=arr[i];
		}
		return  uniquearr;
	}
}
class Task1_RemoveDuplicates {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Size of the Array");
		int n = sc.nextInt();
		int arr[] = new int[n];
		System.out.println("Enter "+n+" elements into the array");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		// Here Object is created
		Remove_Duplicates rd = new Remove_Duplicates();
		//Here method is called through the object and store the result of that into array variable
		int uniqueArray[] =rd.remove_Duplicates(arr); 
		System.out.println("Array after duplicates removed ");

		for (int i = 0; i < uniqueArray.length; i++) {
			System.out.print(uniqueArray[i]+" ");
		}
		sc.close();
		
	}

}
