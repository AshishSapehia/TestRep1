package Package;

import java.util.Scanner;

public class LargestNumber {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);		
		System.out.println("Enter the array of strings");
		int number = s.nextInt();		
		int arr[] = new int[number];
		System.out.println("Enter element of array");
		for(int i=0; i<number; i++)
		{
			arr[i] = s.nextInt();
		}
		int b = arr[0]; 				
		for(int i=0; i<number; i++)		 // logic for larger number
		{
			if (b<arr[i])
			{
				b = arr[i];
			}
		}
		System.out.println("Largets value is "+b);
}
}