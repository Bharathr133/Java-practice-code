package pract1;
import java.util.*;
import java.util.Arrays;

public class arraysClaas {
//public static void main(String[] args) {
//	int [] arr = {3,5,7,9};
//	
//	int [] newArr = Arrays.copyOf(arr,6);
//	System.out.println("Copied Array: " + Arrays.toString(newArr));
//	
//	Arrays.fill(newArr, 4,6,0);
//	System.out.println("After Fill: " + Arrays.toString(newArr));
//	
//	System.out.println("Arrays equal: " + Arrays.equals(arr, newArr));
//	int[] arr1 = new int[5];
//	Arrays.fill(arr1, 10);
//	System.out.println();
// }
//}
	    public static void main(String[] args) {
	    Scanner scanner = new Scanner(System.in);
	    
	    System.out.print("Enter the Size of an array: ");
	    
	    int size = scanner.nextInt();
	    
	    int[] arr = new int[size];
	    int[] reversed = new int[size];

	    System.out.print("Enter "+size+" Elements: ");
	    for (int i = 0; i < size; i++) {
	    arr[i] = scanner.nextInt();
	}

	    for (int i = 0; i < size; i++) {
	    reversed[i] = arr[size - 1 - i];
	}

	    System.out.println("Original array: " + Arrays.toString(arr));
	    System.out.println("Reversed array: " + Arrays.toString(reversed));

	    scanner.close();
	    }
	}

















