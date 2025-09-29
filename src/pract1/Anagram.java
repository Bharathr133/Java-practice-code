package pract1;
import java.util.*;

public class Anagram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the first String (word): ");
        String n = sc.nextLine();

        System.out.println("Enter the second String (word): ");
        String n1 = sc.nextLine();

        // Normalize inputs
        n = n.toLowerCase().replaceAll(" ", "");
        n1 = n1.toLowerCase().replaceAll(" ", "");

        // Quick length check
        if (n.length() != n1.length()) {
            System.out.println("Not an Anagram");
            sc.close();
            return;
        }

        // Convert to char arrays and sort
        char[] arr1 = n.toCharArray();
        char[] arr2 = n1.toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        // Compare arrays
        if (Arrays.equals(arr1, arr2)) {
            System.out.println("\nThe given strings are Anagrams!");
        } else {
            System.out.println("\nThe given strings are NOT Anagrams.");
        }

        // Debug info
        System.out.println("\n--- Debug Info ---");
        System.out.println("the length word 1 is: " + n.length() + "\nThe length of 2nd word is : " + n1.length());
        System.out.println("Sorted String 1: " + new String(arr1));
        System.out.println("Sorted String 2: " + new String(arr2));
        System.out.println("Original String 1: " + n);
        System.out.println("Original String 2: " + n1);

        sc.close();
    }
}
