public class Primes {
    /**
     * Print all primes up to ARG[0] (interpreted as
     * an integer), 10 to a line
     */

    public static void main(String[] args) {
//        printPrimes(Integer.parseInt(args[0]));
//        printPrimes(0, 1000, 0);

        PigLatin pigLatin = new PigLatin();
        System.out.println(pigLatin.numberOfConsonant("Programming"));
    }

    /**
     * Print all primes from VARY to LIMIT,inclusive.
     * 10 to a line,
     * given that there are initially COUNTER primes number on the current line
     */

    private static void printPrimes(int vary, int limit, int counter) {
        if (vary <= limit) {
            if (!isPrime(vary))
                printPrimes(vary + 1, limit, counter);
            else {
                if (counter == 10) {
                    System.out.println();
                    counter = 0;
                }
                System.out.print(vary + " ");
                printPrimes(vary + 1, limit, counter + 1);
            }
        }
    }

    /**
     * true iff X is a prime number
     */
    private static boolean isPrime(int x) {
        return x > 1 && !isDivisible(x, 2);
    }

    /**
     * true iff X is divisible by any positive number >= k < x,
     * given that k>1
     */
    private static boolean isDivisible(int x, int k) {
        if (k >= x) {
            return false;
        } else if (x % k == 0) {
            return true;
        } else {
            return isDivisible(x, k + 1);
        }
    }
}
