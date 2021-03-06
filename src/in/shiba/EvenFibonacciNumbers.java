package in.shiba;

/**
 * Problem 2
 * Each new term in the Fibonacci sequence is generated by adding the previous two terms.
 * By starting with 1 and 2, the first 10 terms will be:1, 2, 3, 5, 8, 13, 21, 34, 55, 89, ...
 * By considering the terms in the Fibonacci sequence whose values do not exceed four million,
 * find the sum of the even-valued terms.
 * <p>
 * Created by shibaprasad on 4/28/2015.
 */
public class EvenFibonacciNumbers {

    public static void main(String[] args) {
        long sum = 0;

        long first = 0;
        long second = 1;
        long third = 0;

        while (third < 4_000_000) {
            third = generate(first, second);
            first = second;
            second = third;
            if (isEvenNumber(third)) {
                sum += third;
                System.out.print(third + ", ");
            }
        }
        System.out.print("Sum = " + sum);
    }

    static long generate(long x, long y) {
        return (x + y);
    }

    static boolean isEvenNumber(long x) {
        // x / 2 = 3
        // 2 * 3 == x

        long y = x / 2;
        return (y * 2) == x;
    }
}
