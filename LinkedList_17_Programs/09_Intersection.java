import java.util.LinkedList;

public class Intersection {
    public static void main(String[] args) {
        LinkedList<Integer> list1 = new LinkedList<>();
        LinkedList<Integer> list2 = new LinkedList<>();

        list1.add(10); list1.add(20); list1.add(30); list1.add(40);
        list2.add(30); list2.add(40); list2.add(50); list2.add(60);

        LinkedList<Integer> intersection = new LinkedList<>();
        for (int num : list1) {
            if (list2.contains(num)) intersection.add(num);
        }

        System.out.println("Intersection: " + intersection);
    }
}
