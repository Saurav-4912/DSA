package Array;
// Majority Element means an element that appears more than n/2 times in the array,
// where n is the size of the array.
public class MajorityElement {
  public static void main(String[] args) {
    int[] arr = {3,3,4,2,3,3,3};

    int num = arr.length/2;

    for(int i = 0 ; i<arr.length; i++) {
      int count = 0; // Initialize count for the current element
      for(int j = 0; j<arr.length; j++) {
        if(arr[i] == arr[j]) {
          count++; // Increment count if the element matches
        }
      }
      if(count > num) { // Check if count exceeds half the array length
        System.out.println("Majority Element: " + arr[i]); // Print the majority element
        return; // Exit after finding the first majority element
      }
    }
  }
}
