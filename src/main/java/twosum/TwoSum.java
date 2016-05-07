package twosum;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class TwoSum {
    public int[] twoSum(int[] numbers, int target) {

        Map<Integer, Integer> processedNumbers = new ConcurrentHashMap<>();

        for(int index = 0 ; index < numbers.length; index++){

            if(processedNumbers.containsKey(target - numbers[index])){

                int [] indexOfNumbersAddUptoSum = new int[2];
                indexOfNumbersAddUptoSum[1] = index + 1;
                indexOfNumbersAddUptoSum[0] = processedNumbers.get(target - numbers[index]);
                return indexOfNumbersAddUptoSum;
            }

            processedNumbers.put(numbers[index], index + 1);
        }

        throw new IllegalArgumentException("No possible solution found");
    }
}
