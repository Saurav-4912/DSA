package Array;

public class FindPairsWithSum {
  public static void main(String[] args) {
    int[] arr = { 1, 2, 3, 4, 5, 6 }; 
    int targetSum = 7; // Target sum for pairs
    int n = arr.length;

    System.out.println("Pairs with sum " + targetSum + ":");

    // Iterate through the array to find pairs
    for (int i = 0; i < n; i++) {
      for (int j = i + 1; j < n; j++) {
        if (arr[i] + arr[j] == targetSum) {
          System.out.println("(" + arr[i] + ", " + arr[j] + ")"); // Print the pair
        }
      }
    }
  }
}
