package pract1;

import java.util.*;

public class SecondLargestNumber {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Size of an Array: ");
		int n = sc.nextInt();

		int current[] = new int[n];
		// initializing the minimum values

		int largest = Integer.MIN_VALUE;
		int secondLargest = Integer.MIN_VALUE;
		int thirdLargest = Integer.MIN_VALUE;
		int fourthLargest = Integer.MIN_VALUE;

		System.out.println("Enter the number to find largest and Second Largest: ");
		for (int i = 0; i < n; i++) {
			current[i] = sc.nextInt();

			if (current[i] > largest) {
				fourthLargest = thirdLargest; // logical thinking
				thirdLargest = secondLargest;
				secondLargest = largest;
				largest = current[i];
			} else if (current[i] > secondLargest && current[i] != largest) {
				fourthLargest = thirdLargest;
				thirdLargest = secondLargest;
				secondLargest = current[i];
			} else if (current[i] > thirdLargest && current[i] != secondLargest) {
				fourthLargest = thirdLargest;
				thirdLargest = current[i];
			} else if (current[i] > fourthLargest && current[i] != thirdLargest) {
				fourthLargest = current[i];
			}
		}

		System.out.println("Largest number: " + largest);
		System.out.println("Second Largest number: " + secondLargest);

		if (thirdLargest != Integer.MIN_VALUE) {
			System.out.println("Third Largest number: " + thirdLargest);
		} else {
			System.out.println("Third Largest number: Not Given");
		}

		if (fourthLargest != Integer.MIN_VALUE) {
			System.out.println("Fourth Largest number: " + fourthLargest);
		} else {
			System.out.println("Fourth Largest number: Not given");
		}

		sc.close();
	}
}
