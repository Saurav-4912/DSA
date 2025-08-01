package Array;
// MaximumNum means finding the maximum number in an array.
// This program finds the maximum number in a given array.
public class MaximumNum {
  public static void main(String[] args) {
    int[] arr = {2,6,9,1,8,3,5,4,7};
    int maxNumber = arr[0];  // Initialize maxNumber with the first element of the array

    for(int i = 1; i<= arr.length -1 ; i++){
      if(arr[i]> maxNumber){
        maxNumber = arr[i];
      }
    }

    System.out.println(maxNumber); // Print the maximum number in the array
  }
}
