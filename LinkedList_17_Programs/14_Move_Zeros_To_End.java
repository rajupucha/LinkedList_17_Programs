import java.util.LinkedList;

public class MoveZerosToEnd {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(10); list.add(0); list.add(20); list.add(0);
        list.add(30); list.add(40); list.add(0);

        LinkedList<Integer> result = new LinkedList<>();
        int zeroCount = 0;

        for (int num : list) {
            if (num == 0) zeroCount++;
            else result.add(num);
        }

        for (int i = 0; i < zeroCount; i++) result.add(0);

        System.out.println("Result: " + result);
    }
}
