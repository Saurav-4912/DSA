package Array;
// 
// MinimumNum means finding the minimum number in an array.
// This program finds the minimum number in a given array.
public class MinimumNum {
  public static void main(String[] args) {
    int[] arr = { 2, 6, 9, 1, 8, 3, 5, 4, 7 };
    int minNumber = arr[0]; // Initialize minNumber with the first element of the array

    for (int i = 1; i <= arr.length - 1; i++) {
      if (arr[i] < minNumber) {
        minNumber = arr[i]; // Update minNumber if a smaller number is found
      }
    }

    System.out.println(minNumber); // Print the minimum number in the array
  }

}
