public class GreatestCommonDivisor {


    public static void main (String[] args){
       System.out.println(gcdLoop(9,3));
       System.out.println(gcdRecursive(9,3));


    }

    /**
     * The greatest common divisor of A and B where A,B >= 0
     * Using recursive approach
     */
    static int gcdRecursive (int a, int b){
        /*
        *Condition considered for this function
        * if one of the number is 0, the second number becomes the gcd(since every positive integer divides 0)
         */

        if (b != 0)
            return gcdRecursive(b,a % b);

        return a;
    }

    /**
     * The greatest common divisor of two numbers A and B where A,B >= 0
     * Using loop approach
     * @param a
     * @param b
     * @return
     */

    static int gcdLoop (int a, int b){
        while (b != 0){
            int b1 = a%b;
            a = b; b =b1;
        }// until b == 0
        return a;
    }


}
