package Array;

public class IsArraySorted {
  public static void main(String[] args) {

    /*
     * int[] arr = {1,2,3,4,5,6,7,8,9};
     * int i = 0;
     * 
     * boolean isSorted = true; // Assume the array is sorted initially
     * 
     * for(int j = 1; j<arr.length ; j++){
     * if(arr[j] > arr[i]){
     * i++;
     * }else{
     * isSorted = false; // If any element is not greater than the previous, set
     * isSorted to false
     * break; // Exit the loop as we found the array is not sorted
     * }
     * }
     * if(isSorted){
     * System.out.println("The array is sorted.");
     * }else{
     * System.out.println("The array is not sorted.");
     * }
     * 
     */
    int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };

    boolean isSorted = true; // Assume the array is sorted initially

    for (int i = 1; i < arr.length; i++) {
      if (arr[i] < arr[i - 1]) {
        isSorted = false; // If any element is less than the previous, set isSorted to false
        break; // Exit the loop as we found the array is not sorted
      }
    }
    if (isSorted) {
      System.out.println("The array is sorted.");
    } else {
      System.out.println("The array is not sorted.");
    }

  }
}
