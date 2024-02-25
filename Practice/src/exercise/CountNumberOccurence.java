package exercise;

import java.util.Scanner;

public class CountNumberOccurence {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int[] num = new int[10];
		
		System.out.println("Enter the integers between 1 and 50: ");
		addElement(num, input);
		int[] count = countElements(num);
		printElements(count);
		}
	
	public static void addElement(int[] arr, Scanner input) {
		for (int i = 0; i < arr.length; i++)
			arr[i] = input.nextInt();
	}
	
	public static void printElements(int[] arr) {
		for (int i = 0; i < arr.length; i++)
			if (arr[i] == 0)
				continue;
			else
				System.out.println(i + " occurs " + arr[i] + " time/s");
	}
	
	public static int[] countElements(int[] arr) {
		int[] count = new int[50];
		for (int i = 0; i < 10 ; i++) {
			count[arr[i]]++;
		}
		return count;
	}
}