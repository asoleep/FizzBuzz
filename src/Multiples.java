/**
 * Prints how many multiples of 3 or 5 there are below 1000
 */
public class Multiples {
    public static void main(String[] args) {

        int multiples = 0; //counter

        for (int i = 1; i < 1000; i++){

            if (i % 3 == 0 || i % 5 == 0) {
               multiples += 1;
            }

        }

        System.out.println("There are " + multiples + " non-negative multiples of 3 or 5 below 1000.");
    }
}
