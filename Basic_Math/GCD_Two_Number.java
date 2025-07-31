package Basic_Math;
// GCD (Greatest Common Divisor) of two numbers is the largest number that divides both of them without leaving a remainder.
// This program calculates the GCD of two numbers.
public class GCD_Two_Number {
  public static void main(String[] args) {
    int a = 12;
    int b = 18;
    int gcd =1; // Let's assume the GCD is 1 initially
    for( int i = 12; i>= 1; i--){ // We start checking from the smaller of the two numbers down to 1
      if(a % i == 0  && b % i == 0){ // If both numbers are divisible by i, then i is a common divisor
       
        gcd = i;
        break;
      }
    }

    System.out.println("GCD of " + a + " and " + b + " is: " + gcd);
  }
}
