import java.util.LinkedList;

public class SearchMaxMinSum {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(10); list.add(20); list.add(30); list.add(40);

        int search = 30;
        System.out.println("Search " + search + ": " +
                (list.contains(search) ? "Found" : "Not Found"));

        int max = list.get(0), min = list.get(0), sum = 0;
        for (int num : list) {
            if (num > max) max = num;
            if (num < min) min = num;
            sum += num;
        }

        System.out.println("Maximum: " + max);
        System.out.println("Minimum: " + min);
        System.out.println("Sum: " + sum);
    }
}
