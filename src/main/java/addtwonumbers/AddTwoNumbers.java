package addtwonumbers;

public class AddTwoNumbers {

    public ListNode addTwoNumbers(ListNode number1, ListNode number2) {

        return addTwoNodesWithCarriage(number1, number2, 0);
    }

    private ListNode addTwoNodesWithCarriage(ListNode number1, ListNode number2, int carriageIn){

        if(number1 == null && number2 == null && carriageIn == 0){
            return null;
        }

        ListNode sumOfDigitNode = findSumOfDigitNode(number1, number2, carriageIn);
        int carriageOut = sumOfDigitNode.val/10;
        sumOfDigitNode.next = addTwoNodesWithCarriage(getNextNode(number1), getNextNode(number2), carriageOut);

        return sumOfDigitNode;

    }

    private ListNode findSumOfDigitNode(ListNode number1, ListNode number2, int carriageIn) {
        int digitOfNumber1 = getDigitValue(number1);
        int digitOfNumber2 = getDigitValue(number2);

        return getListNode(digitOfNumber1 + digitOfNumber2 + carriageIn);
    }

    private ListNode getListNode(int digitOfSum) {
        if(digitOfSum >= 10){
            return new ListNode(digitOfSum % 10);
        }else{
            return new ListNode(digitOfSum);
        }
    }

    private int getDigitValue(ListNode number) {
        return number == null ? 0 : number.val;
    }

    private ListNode getNextNode(ListNode number) {

        if(number  == null){
            return null;
        }

        return number.next;
    }

}
