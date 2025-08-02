package Array;
// Left Rotate By 1 means shifiting all elements of the array to the left by one position,

// and the first element moves to the end of the array.

public class LeftRoateBy1 {
  public static void main(String[] args) {
    int[] arr = { 10, 20, 30, 40, 50 };

    int firstElement = arr[0]; // Store the first element to place it at the end after rotation

    // Shift all elements to the left by one position
    for (int i = 1; i < arr.length; i++) {
      arr[i - 1] = arr[i]; // Move each element to the left
    }
    arr[arr.length - 1] = firstElement; // Place the first element at the end of the array

    // Print the rotated array
    for (int i = 0; i < arr.length; i++) {
      System.out.print(arr[i] + " ");
    }
  }
}
