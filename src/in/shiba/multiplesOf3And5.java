package in.shiba;

/**
 * If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9.
 * The sum of these multiples is 23.Find the sum of all the multiples of 3 or 5 below 1000.
 *
 * Created by shibaprasad on 4/28/2015.
 */
public class MultiplesOf3And5 {

    public static void main(String[] args) {
        int totalSum = 0;
        for (int i = 1; i < 1000; i++) {
            if (isMultipleOf(i)) {
                totalSum += i;
                System.out.println(" Output : " + i + ", ");
            }
        }
        System.out.println(" Total sum is : " + totalSum);
    }

    static boolean isMultipleOf(int number) {
        int x = number / 3;
        if ((x * 3) == number) {
            return true;
        }
        x = number / 5;
        return (x * 5) == number;
    }

}
