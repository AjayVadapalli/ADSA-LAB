import java.util.Scanner;
public class mselSort {
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
		
		selectionSort(arr);
		
		System.out.println("Sorted Array:");
		for(int element : arr){
			System.out.print(element + " ");
		}
		long end = System.nanoTime();
		double time = (end - start) / 1000000.0;
		System.out.println("\nTime taken: " + time + " milliseconds");
	}
	static void selectionSort(int[] a){
   		int n = a.length;
   		int i, j, temp, minpos;
    		for(i = 0; i <= (n - 2); i++){
        		minpos = i;
        		for(j = i + 1; j <= (n - 1); j++){
            			if( a[j] < a[minpos]) minpos = j;
        		}
        		temp = a[i];
        		a[i] = a[minpos];
        		a[minpos] = temp;
    		}
	}
}
