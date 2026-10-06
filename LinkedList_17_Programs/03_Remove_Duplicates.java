import java.util.LinkedList;

public class RemoveDuplicates {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(10); list.add(20); list.add(10); list.add(30); list.add(20); list.add(40);

        LinkedList<Integer> result = new LinkedList<>();
        for (int num : list) {
            if (!result.contains(num)) result.add(num);
        }

        System.out.println("Original: " + list);
        System.out.println("Without Duplicates: " + result);
    }
}
