public class PrimeNumbers {
    public static String nPrimes(int limit) {
        String primes = "";
        int divisor, number;

        for (number = 2; number <= limit; number++) {
            boolean primo = true;
            for (divisor = 2; divisor <= limit; divisor++) {
                if ((number % divisor == 0) && (divisor != number)) {
                    primo = false;
                }
            }
            if (primo) {
                primes += number + ", ";
            }
        }
        return primes;
    }

    public static boolean isPrime(long number) {
        int count = 0;

        for (int div = 1; div <= number; div++) {
            if (number % div == 0) {
                count += 1;
            }
        }
        if (count == 2) {
            return true;
        }
        return false;
    }
}