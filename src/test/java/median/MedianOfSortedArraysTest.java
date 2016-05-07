package median;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.IsEqual.equalTo;

public class MedianOfSortedArraysTest {

    @Test
    public void twoListsWithTotalOfOddNumber(){

        int [] array1  =  {2, 4, 6, 8};
        int [] array2  =  {1, 3, 5, 7, 9};

        MedianOfSortedArrays medianOfSortedArrays = new MedianOfSortedArrays();
        double medianFound = medianOfSortedArrays.medianOfSortedArrays(array1, array2);

        assertThat(medianFound, equalTo(5d));
    }


    @Test
    public void twoListsWithTotalOfEvenNumber(){

        int [] array1  =  {2, 4, 6, 8};
        int [] array2  =  {1, 3, 5, 7};

        MedianOfSortedArrays medianOfSortedArrays = new MedianOfSortedArrays();
        double medianFound = medianOfSortedArrays.medianOfSortedArrays(array1, array2);

        assertThat(medianFound, equalTo(4.5d));
    }

}
