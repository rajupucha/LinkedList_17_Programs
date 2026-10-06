import java.util.LinkedList;

public class RemoveAllOccurrences {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(10); list.add(20); list.add(10); list.add(30); list.add(10); list.add(40);

        int remove = 10;
        for (int i = list.size() - 1; i >= 0; i--) {
            if (list.get(i) == remove) list.remove(i);
        }

        System.out.println("Result: " + list);
    }
}
