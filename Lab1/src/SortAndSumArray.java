import java.util.Arrays;

public class SortAndSumArray {
	public static void main(String arg[]) {
		int sum = 0;
		int[] randomArray = {9, 7, 56, 69, 72, 60, 0, 61, 50, 37};
		System.out.println("Original Array: ");
		for (int num : randomArray) {
			System.out.print(num + " ");
		}
		
		Arrays.sort(randomArray);
		
        System.out.println("\nThe sorted array is: ");
        for (int num : randomArray) {
            System.out.print(num + " ");
            sum += num;
        }

        System.out.println("\nThe sum of array is: " + sum);
        System.out.println("\nThe average of array is: " + sum/randomArray.length);
	}

}
