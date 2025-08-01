package Array;

public class SecondLargestNum {
  public static void main(String[] args) {
    int[] arr = {2, 6, 9, 1, 8, 3, 5, 4, 7};
    int firstLargest = Integer.MIN_VALUE; // Initialize to the smallest possible integer
    int secondLargest = Integer.MIN_VALUE; // Initialize to the smallest possible integer

    for (int i = 0; i < arr.length; i++) {
      if (arr[i] > firstLargest) {
        secondLargest = firstLargest; // Update second largest before updating first largest
        firstLargest = arr[i]; // Update first largest
      } else if (arr[i] > secondLargest && arr[i] != firstLargest) {
        secondLargest = arr[i]; // Update second largest if current number is not equal to first largest
      }
    }

   System.out.println(secondLargest); // Print the second largest number in the array
  }
}
