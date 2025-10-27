package session6.D_List;

import java.util.Comparator;

public class StringAlphabeticalOrder implements Comparator<String> {

    /**
     * Compares its two arguments for order.
     * Returns a negative integer, zero, or a positive integer
     * as the first argument is less than, equal to, or greater * than the second.
     */
    @Override
    public int compare(String o1, String o2) {
        if (o1.length()<o2.length())
            return -1;
        if (o1.length()==o2.length())
            return 0;
        if (o1.length()>=o2.length())
            return 1;

        return 0;


        //Alphabetical Order
        //return o1.compareTo(o2);
    }
}
