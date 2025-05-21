package search;


import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class BinarySearchTest {

    @Test
    void binarySearchNumberInTheFirstHalf() {

        var arrayOfIntegers = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9};
        assertThat(binarySearchLoop(arrayOfIntegers, 4)).isEqualTo(3);
    }

    @Test
    void binarySearchNumberInTheSecondHalf() {

        var arrayOfIntegers = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9};
        assertThat(binarySearchLoop(arrayOfIntegers, 8)).isEqualTo(7);
    }

    @Test
    void binarySearchNumberDoesntExist() {

        var arrayOfIntegers = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9};
        assertThat(binarySearch(arrayOfIntegers, 10)).isEqualTo(-1);
        assertThat(binarySearchLoop(arrayOfIntegers, 10)).isEqualTo(-1);
    }

    public static int binarySearch(int[] array, int target) {
        return binarySearch(array, target, 0, array.length - 1);
    }

    private static int binarySearch(int[] array, int target, int startIndex, int endIndex) {

        if (startIndex > endIndex)
            return -1;

        var middleIndex = (endIndex + startIndex) / 2;
        if (array[middleIndex] == target) {
            return middleIndex;
        } else if (array[middleIndex] < target) {
            return binarySearch(array, target, middleIndex + 1, endIndex);
        } else if (array[middleIndex] > target) {
            return binarySearch(array, target, startIndex, middleIndex - 1);
        }

        return -1;
    }


    private static int binarySearchLoop(int[] array, int target) {


        var middleIndex = (array.length - 1) / 2;
        var startIndex = 0;
        var endIndex = array.length - 1;

        while (startIndex <= endIndex) {
            if (array[middleIndex] == target) {
                return middleIndex;
            } else if (array[middleIndex] < target) {
                startIndex = middleIndex + 1;
            } else if (array[middleIndex] > target) {
                endIndex = middleIndex - 1;
            }

            middleIndex = (endIndex + startIndex) / 2;
        }

        return -1;
    }
}
