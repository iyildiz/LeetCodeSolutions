package median;

public class MedianOfSortedArrays {
  public double medianOfSortedArrays(int[] array1, int[] array2) {

    int[] mergedArray = mergeTwoArrays(array1, array2);
    return findMedianOfSingleList(mergedArray);
  }

  private double findMedianOfSingleList(int[] list) {

    if (list.length % 2 == 0) {
      return findAverageOfMiddleTwoElements(list);
    } else {
      return findMiddleElement(list);
    }
  }

  private double findAverageOfMiddleTwoElements(int[] list) {
    return (list[list.length / 2 - 1] + list[list.length / 2]) / 2d;
  }

  private int findMiddleElement(int[] list) {
    return list[list.length / 2];
  }

  private int[] mergeTwoArrays(int[] array1, int[] array2) {
    int[] mergedArray = new int[array1.length + array2.length];

    int array1Index = 0, array2Index = 0;
    for (int i = 0; i < mergedArray.length; i++) {

      if (array1Index == array1.length) {
        mergedArray[i] = array2[array2Index++];
      } else if (array2Index == array2.length) {
        mergedArray[i] = array1[array1Index++];
      } else {
        mergedArray[i] =
            array1[array1Index] < array2[array2Index]
                ? array1[array1Index++]
                : array2[array2Index++];
      }
    }
    return mergedArray;
  }
}
