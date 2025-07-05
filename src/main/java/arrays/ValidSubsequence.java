package arrays;

import java.util.List;
import java.util.Stack;

public class ValidSubsequence {
  public boolean isValidSubsequence(List<Integer> array, List<Integer> sequence) {

    int sequenceIndex = 0;
    for (Integer integer : array) {
      if (sequence.get(sequenceIndex).equals(integer)) {
        sequenceIndex++;
        if (sequenceIndex == sequence.size()) {
          break;
        }
      }
    }

    return sequence.size() == sequenceIndex;
  }

  public boolean isValidSubsequenceRecursive(List<Integer> array, List<Integer> sequence) {

    if (sequence.isEmpty()) return true;
    if (array.isEmpty()) return false;

    if (array.getFirst().equals(sequence.getFirst())) {
      return isValidSubsequenceRecursive(
          array.subList(1, array.size()), sequence.subList(1, sequence.size()));
    } else {
      return isValidSubsequenceRecursive(array.subList(1, array.size()), sequence);
    }
  }

  public boolean isValidSubsequenceStack(List<Integer> array, List<Integer> sequence) {

    var validSubsequenceStack = new Stack<Integer>();
    for (int i = sequence.size() - 1; i >= 0; i--) {
      validSubsequenceStack.push(sequence.get(i));
    }

    for (Integer integer : array) {
      if (validSubsequenceStack.peek().equals(integer)) {
        validSubsequenceStack.pop();
        if (validSubsequenceStack.isEmpty()) return true;
      }
    }

    return validSubsequenceStack.isEmpty();
  }
}
