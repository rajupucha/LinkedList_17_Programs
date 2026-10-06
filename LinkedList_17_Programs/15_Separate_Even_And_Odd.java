import java.util.LinkedList;

public class SeparateEvenAndOdd {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(10); list.add(15); list.add(20); list.add(25); list.add(30); list.add(35);

        LinkedList<Integer> result = new LinkedList<>();

        for (int num : list) {
            if (num % 2 == 0) result.add(num);
        }

        for (int num : list) {
            if (num % 2 != 0) result.add(num);
        }

        System.out.println("Result: " + result);
    }
}
