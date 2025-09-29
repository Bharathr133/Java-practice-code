package pract1;
import java.util.*;

public class arraysUserInput {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
//	System.out.println("Enter number of Products: ");
//	int n = sc.nextInt();
//	
//	int [] arr = new int[n];
//	
//	for(int i = 0; i < arr.length;i++) {
//		System.out.println("Enter the price of product: ");
//		arr[i]= sc.nextInt();
//	}
//	
//	System.out.println("\n Product Prices:");
//	for(int i=0; i<arr.length;i++) {
//		System.out.println("Prices of product "+(i+1)+":"+arr[i]);
//	 int[] arr = {1, 2, 3, 4, 5};
//	for(int i = arr.length - 1; i >= 0; i--){
//	    System.out.print(arr[i] + " ");
//	}
//	}
	// 2. Check if number is prime
	System.out.println("Enter the size of an array");
	int n = sc.nextInt();
	int[] arr = new int[n];
	
	for(int i = 0; i<n; i++) {
		arr[i] = sc.nextInt();
	}

    for (int i = arr.length - 1; i >= 0; i--) {
        System.out.print(Integer.toString(arr[i])+ " ");
    }
    sc.close();
}
}

