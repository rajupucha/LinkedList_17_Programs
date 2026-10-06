import java.util.LinkedList;

public class AddTwoNumbersLinkedLists {
    public static void main(String[] args) {
        LinkedList<Integer> list1 = new LinkedList<>();
        LinkedList<Integer> list2 = new LinkedList<>();

        list1.add(2); list1.add(4); list1.add(3);
        list2.add(5); list2.add(6); list2.add(4);

        LinkedList<Integer> result = new LinkedList<>();
        int i = 0, j = 0, carry = 0;

        while (i < list1.size() || j < list2.size() || carry != 0) {
            int sum = carry;

            if (i < list1.size()) sum += list1.get(i++);
            if (j < list2.size()) sum += list2.get(j++);

            result.add(sum % 10);
            carry = sum / 10;
        }

        System.out.println("Result: " + result);
        System.out.println("Represents: 807");
    }
}
