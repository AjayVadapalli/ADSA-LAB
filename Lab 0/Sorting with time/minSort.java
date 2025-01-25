import java.util.Scanner;
public class minSort {
	public static void main(String args[]){
		long start = System.nanoTime();
		Scanner read = new Scanner(System.in);
		
		System.out.print("Enter the no. of elements: ");
		int n = read.nextInt();
		int[] arr = new int[n];
		
		System.out.println("Enter the elements: ");
		for(int i = 0; i < n; i++){
			arr[i] = read.nextInt();
		}
		
		insertionSort(arr);
		
		System.out.println("Sorted Array:");
		for(int element : arr){
			System.out.print(element + " ");
		}
		long end = System.nanoTime();
		double time = (end - start) / 1000000.0;
		System.out.println("\nTime taken: " + time + " milliseconds");
	}
	static void insertionSort(int a[]){
		int n = a.length;
    		int i, j, item;
    		for(i=1; i< n; i++){
        		item = a[i];
        		for(j=i-1; j>=0 && a[j]>item; j--){
            			a[j+1] = a[j];
        		}
        		a[j+1] = item;
    		}
	}
}
