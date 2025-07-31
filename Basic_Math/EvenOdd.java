package Basic_Math;

// 
// Even or Odd Number means a number that is divisible by 2 (even) or not (odd).
// This program checks if a number is even or odd.
public class EvenOdd {
  public static void main(String[] args) {
    int number = 45;

    if (number % 2 == 0) {
      System.out.println(number + " is an even number.");
    } else {
      System.out.println(number + " is an odd number.");
    }
  }
}
