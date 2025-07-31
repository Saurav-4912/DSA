package Basic_Math;
// Prime Number means a number that is greater than 1 and has no positive divisors other than 1 and itself.
// This program checks if a number is prime or not.
class PrimeNumber{
  public static void main(String[] args) {
    int number = 28;
    boolean isPrime = true;  // Let's assume the number is prime number

    if(number <= 1){   // Number less than or equal to 1 are not prime number
      isPrime = false;
    }else{              // if number is greater than 1, we check for divisibility
      for( int i =2; i<= Math.sqrt(number); i++){
        if(number % i == 0){
          isPrime = false;  // If number is divisible by any number other than 1 and itself, it is not prime
          break;
        }
      }
    }

    if(isPrime){ // If isPrime is still true, then the number is prime
      System.out.println(number + " is a prime number, ");
    }else{    // If isPrime is false, then the number is not prime
      System.out.println(number + " is not a prime number, ");
    }


  }
}