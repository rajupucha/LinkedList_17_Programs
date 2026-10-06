import java.util.LinkedList;
import java.util.HashSet;

public class FirstRepeatedElement {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(10); list.add(20); list.add(30); list.add(40); list.add(20); list.add(50);

        HashSet<Integer> seen = new HashSet<>();

        for (int num : list) {
            if (seen.contains(num)) {
                System.out.println("First Repeated Element: " + num);
                break;
            }
            seen.add(num);
        }
    }
}
