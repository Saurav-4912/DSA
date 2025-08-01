package Array;

public class RemoveDuplicate {
  public static void main(String[] args) {
    int[] arr = {2, 6, 9, 1, 8, 3, 5, 4, 7, 2, 6}; // Example array with duplicates
    int n = arr.length;
    
    // Create a new array to hold unique elements
    int[] temp = new int[n];
    int j = 0; // Index for the temporary array

    for (int i = 0; i < n; i++) {
      boolean isDuplicate = false;
      // Check if the current element is already in the temporary array
      for (int k = 0; k < j; k++) {
        if (arr[i] == temp[k]) {
          isDuplicate = true;
          break;
        }
      }
      // If not a duplicate, add it to the temporary array
      if (!isDuplicate) {
        temp[j++] = arr[i];
      }
    }

    // Print the unique elements
    for (int i = 0; i < j; i++) {
      System.out.print(temp[i] + " ");
    }
    System.out.println(); // New line after printing all unique elements
  }
}
