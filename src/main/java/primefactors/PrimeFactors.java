/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package primefactors;
import java.util.*;

public class PrimeFactors {
    public ArrayList<Integer> findPrimeFactors(int input) {
        ArrayList<Integer> arr = new ArrayList<Integer>();
        int it = input;
        if(input == 1)
            return arr;
        while(it % 2 == 0) {
            arr.add(2);
            it /= 2;
        }

        if(it % 2 != 0 && it != 1)
            arr.add(it);
        return arr;
    }
}
