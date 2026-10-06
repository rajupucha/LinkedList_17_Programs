import java.util.LinkedList;

public class RemoveConsecutiveDuplicates {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(10); list.add(10); list.add(20); list.add(20);
        list.add(20); list.add(30); list.add(30); list.add(40);

        LinkedList<Integer> result = new LinkedList<>();
        for (int num : list) {
            if (result.isEmpty() || !result.getLast().equals(num)) {
                result.add(num);
            }
        }

        System.out.println("Result: " + result);
    }
}
