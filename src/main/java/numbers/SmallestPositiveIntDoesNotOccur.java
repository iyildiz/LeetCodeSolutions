package numbers;

import java.util.HashSet;

public class SmallestPositiveIntDoesNotOccur {

    public int smallestPositiveIntDoesNotOccur(int[] list) {

        var existingNumbers = new HashSet<Integer>();

        for (int j : list) {
            if (j > 0) {
                existingNumbers.add(j);
            }
        }

        for(int i = 1; i <= 100000; i++) {
            if (!existingNumbers.contains(i)) {
                return i;
            }
        }

        return 1;
    }
}
