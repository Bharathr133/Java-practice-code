package pract1;

import java.util.Scanner;

public class StudentMarks {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		System.out.println(" Enter Number of Students: ");
		int n = sc.nextInt();

		int marks[] = new int[n];

		System.out.println("Enter the marks of an Each Student: ");
		for (int i = 0; i < n; i++) {
			marks[i] = sc.nextInt();
		}

		System.out.println("Here is the marks of All Students ");
		for (int i = 0; i < marks.length; i++) {
			System.out.println("Student " + (i + 1) + " marks: " + marks[i]);
		}
			sc.close();
	}
}
