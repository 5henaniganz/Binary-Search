import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// Simple static array for example
		int arr[] = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
		// BinarySearch Object
		BinarySearch search = new BinarySearch();
		// User input
		System.out.println("Search for a number:");
		Scanner userNumber = new Scanner(System. in );
		int result = userNumber.nextInt();
		// Instantiates binary search
		System.out.println("The index of your number is: " + search.startSearch(arr, result, 0, arr.length - 1));
	}
}