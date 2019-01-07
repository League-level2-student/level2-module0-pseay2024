package arrays;

import java.util.Random;

public class _00_ArrayCheatSheet {
	public static void main(String[] args) {
		//1. make an array of 5 Strings
		String[] ar = {"hello","there","person","number","1"};
		//2. print the third element in the array
		System.out.println(ar[2]);
		//3. set the third element to a different value
		ar[2] = "human";
		//4. print the third element again
		System.out.println(ar[2]);
		//5. use a for loop to print all the values in the array
		//   BE SURE TO USE THE ARRAY'S length VARIABLE
		for (String s : ar)
		{
			System.out.println(s);
		}
		
		//6. make an array of 50 integers
		int[] fifty = new int[50];
		//7. use a for loop to make every value of the integer array a random number
		Random r = new Random();
		for (int i = 0; i < 50; i++)
		{
			fifty[i] = r.nextInt(50);
		}
		//8. without printing the entire array, print only the smallest number in the array
		int smallest = 49;
		for (int i : fifty)
		{
			if (i < smallest)
			{
				smallest = i;
			}
		}
		System.out.println(smallest);
		//9 print the entire array to see if step 8 was correct
		System.out.println();
		int largest = 0;
		for(int i : fifty)
		{
			if (i > largest)
			{
				largest = i;
			}
			System.out.print(i + " ");
		}
		//10. print the largest number in the array.
		System.out.println( "largest: " + largest);
	}
}
