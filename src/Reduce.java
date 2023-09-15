/**
 * Reduce a number to 0
 */
public class Reduce {
    public static void main(String[] args) {
        int n = 100;
        int steps = 0; //counter

        while(n > 0) {
            // if n is even
            if (n % 2 == 0){
                n = n/2;
            }
            // if n is odd
            else {
                n -= 1;
            }
            steps += 1;
        }

        System.out.println("Steps to reach 0: " + steps);
    }
}
