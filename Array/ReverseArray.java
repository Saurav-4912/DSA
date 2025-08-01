package Array;

public class ReverseArray {
  public static void main(String[] args) {
    int[] arr1 = { 2, 6, 9, 1, 8, 3, 5, 4, 7 };
    int[] arr2 = new int[arr1.length];

    int j = 0; // Index for the reversed array (magic line)
    for (int i = arr1.length - 1; i >= 0; i--) {
      arr2[j] = arr1[i]; // Assign the element from arr1 to arr2 in reverse order
      j++; // Increment index for the reversed array
    }

    for (int k = 0; k < arr2.length; k++) {
      System.out.print(arr2[k] + " "); // Print the elements of the reversed array
    }

  }
}
