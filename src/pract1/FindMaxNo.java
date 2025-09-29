package pract1;

import java.util.*;

public class FindMaxNo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter The size of an Array: ");
		int n = sc.nextInt();

		int arr[] = new int[n];
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;

		System.out.println("Enter the Number to Find Max: ");
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
			if (arr[i] > max) {
				max = arr[i];
			}
			if (arr[i] < min) {
				min = arr[i];
			}
		}
		System.out.println("The maximum number in the array is: " + max);
		System.out.println("The min number in the array is: " + min);
		sc.close();
	}
}
