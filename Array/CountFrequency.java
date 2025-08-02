package Array;

public class CountFrequency {
  public static void main(String[] args) {
    int[] arr = { 4, 5, 4, 6, 5, 4 };

    for (int i = 0; i < arr.length; i++) {
      boolean isCounted = false;
      for (int j = 0; j < i; j++) {
        if (arr[i] == arr[j]) {
          isCounted = true; // Mark as counted if already processed
          break;
        }
      }
      if (!isCounted) {
        int count = 0;
        for (int j = 0; j < arr.length; j++) {
          if (arr[i] == arr[j]) {
            count++; // Count occurrences of the current element
          }
        }
        System.out.println("Element: " + arr[i] + ", Frequency: " + count); // Print the frequency of the element
      }
    }
  }
}
