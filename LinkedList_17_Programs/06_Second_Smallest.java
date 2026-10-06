import java.util.LinkedList;

public class SecondSmallest {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(50); list.add(10); list.add(30); list.add(20); list.add(40);

        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;

        for (int num : list) {
            if (num < smallest) {
                secondSmallest = smallest;
                smallest = num;
            } else if (num < secondSmallest && num != smallest) {
                secondSmallest = num;
            }
        }

        System.out.println("Second Smallest: " + secondSmallest);
    }
}
