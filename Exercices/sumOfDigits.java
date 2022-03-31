/*Use recursion to complete the sumOfDigits method. It takes an integer value as a parameter, 
and returns the sum of the digits in the decimal representation of that integer. 
You may assume that the parameter will be non-negative.

Examples:

sumOfDigits(0) => 0
*/

public static int sumOfDigits(int n) {
  if(n == 0) {
    return n;
  }
  return ( (n % 10) + sumOfDigits(n / 10) );
}
