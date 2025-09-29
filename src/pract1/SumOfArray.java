package pract1;
import java.util.Scanner;
public class SumOfArray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Size of an Array: ");
		int n = sc.nextInt();
		int arr[]= new int[n];
		
		int sum = 0;
		
		System.out.println("Enter the Number to Sum ");
		for (int i =0; i<n;i++) {
			arr[i]= sc.nextInt();
			sum += arr[i];
		}
		
		System.out.println("Displaying the Sum: ");
		
			System.out.print("The Sum of an Array: " + sum);
		
		
			sc.close();
	}
}
