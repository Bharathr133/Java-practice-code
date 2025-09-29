package pract1;
import java.util.*;

public class TwoDArrays {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	int [][] arr = new int[2][1];
	for(int i =0; i<arr.length;i++) {
		for(int j = 0; j<arr[i].length;j++) {
			System.out.print("Enter the Values of Student " + (i+1)+" the Subject "+(j+1)+ ": ");
		arr[i][j] = sc.nextInt();
	}
	System.out.println();
	}

System.out.print("\n The Stored Student Marks are : ");
for(int i=0; i<arr.length;i++) {
	for(int j=0;j<arr[i].length;j++) {
		System.out.print(arr[i][j]+" ");
	}
}
}
}
