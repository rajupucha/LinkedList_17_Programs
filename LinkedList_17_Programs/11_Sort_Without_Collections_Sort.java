import java.util.LinkedList;

public class SortWithoutCollectionsSort {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(40); list.add(10); list.add(30); list.add(20); list.add(50);

        for (int i = 0; i < list.size() - 1; i++) {
            for (int j = 0; j < list.size() - i - 1; j++) {
                if (list.get(j) > list.get(j + 1)) {
                    int temp = list.get(j);
                    list.set(j, list.get(j + 1));
                    list.set(j + 1, temp);
                }
            }
        }

        System.out.println("Sorted List: " + list);
    }
}
