import java.util.LinkedList;

public class FindDuplicateElements {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(10); list.add(20); list.add(30); list.add(20);
        list.add(40); list.add(10); list.add(50);

        LinkedList<Integer> duplicates = new LinkedList<>();
        for (int i = 0; i < list.size(); i++) {
            for (int j = i + 1; j < list.size(); j++) {
                if (list.get(i).equals(list.get(j)) && !duplicates.contains(list.get(i))) {
                    duplicates.add(list.get(i));
                }
            }
        }

        System.out.println("Duplicate Elements: " + duplicates);
    }
}
