import java.util.Scanner;
public class bsort {
	public static void main(String args[]){
		Scanner read = new Scanner(System.in);
		
		System.out.print("Enter the no. of elements: ");
		int n = read.nextInt();
		int[] arr = new int[n];
		
		System.out.println("Enter the elements: ");
		for(int i = 0; i < n;i++){
			arr[i] = read.nextInt();
		}
		
		bubbleSort(arr);
		
		System.out.println("Sorted Array:");
		for(int element : arr){
			System.out.print(element + " ");
		}
	}
	static void bubbleSort(int[] a){
		int n = a.length;
		int temp;
		for(int i = 0; i < n - 1; i++){
			for(int j = 0; j < n - i - 1; j++){
				if(a[j] > a[j+1]){
					temp = a[j];
					a[j] = a[j+1];
					a[j+1] = temp;
				}
			}
		}
	}
}
