import java.util.LinkedList;

public class FrequencyOfEachElement {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(10); list.add(20); list.add(10); list.add(30); list.add(20); list.add(10);

        LinkedList<Integer> checked = new LinkedList<>();

        for (int num : list) {
            if (!checked.contains(num)) {
                int count = 0;
                for (int value : list) {
                    if (value == num) count++;
                }
                System.out.println(num + " -> " + count);
                checked.add(num);
            }
        }
    }
}
