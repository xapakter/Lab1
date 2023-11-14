import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        int count = 100000;
        int insert = 1000;

        List<Integer> arrayList = new ArrayList<>();
        List<Integer> linkedList = new LinkedList<>();

        System.out.println("Кількість елементів у списку: " + count);
        System.out.println("Число введених елементів: " + insert);

        fill(arrayList, count, "ArrayList");
        fill(linkedList, count, "LinkedList");

        Randomaccess(arrayList, "ArrayList");
        Randomaccess(linkedList, "LinkedList");

        Sequentalaccessin(arrayList, "ArrayList");
        Sequentalaccessin(linkedList, "LinkedList");

        insertAtthebeginning(arrayList, insert, "ArrayList");
        insertAtthebeginning(linkedList, insert, "LinkedList");

        insertAttheend(arrayList, insert, "ArrayList");
        insertAttheend(linkedList, insert, "LinkedList");

        Insertinthemiddleof(arrayList, insert, "ArrayList");
        Insertinthemiddleof(linkedList, insert, "LinkedList");
    }

    private static void fill(List<Integer> list, int count, String listType) {
        long time = System.currentTimeMillis();
        for (int i = 0; i < count; i++) {
            list.add((int) (Math.random() * count));
        }
        System.out.printf("Fill %s: %d ms%n", listType, System.currentTimeMillis() - time);
    }

    private static void Randomaccess(List<Integer> list, String listType) {
        long time = System.currentTimeMillis();
        for (int i = 0; i < list.size(); i++) {
            int value = list.get(i);
        }
        System.out.printf("Random access1 in %s: %d ms%n", listType, System.currentTimeMillis() - time);
    }

    private static void Sequentalaccessin(List<Integer> list, String listType) {
        long time = System.currentTimeMillis();
        for (Integer k : list) {
            int p = k;
        }
        System.out.printf("Sequential access in %s: %d ms%n", listType, System.currentTimeMillis() - time);
    }

    private static void insertAtthebeginning(List<Integer> list, int insert, String listType) {
        long time = System.currentTimeMillis();
        for (int i = 0; i < insert; i++) {
            list.add(0, i);
        }
        System.out.printf("Insert at the beginning of %s: %d ms%n", listType, System.currentTimeMillis() - time);
    }

    private static void insertAttheend(List<Integer> list, int insert, String listType) {
        long time = System.currentTimeMillis();
        for (int i = 0; i < insert; i++) {
            list.add(i);
        }
        System.out.printf("Insert at the end of %s: %d ms%n", listType, System.currentTimeMillis() - time);
    }

    private static void Insertinthemiddleof(List<Integer> list, int insert, String listType) {
        int mid = list.size() / 2;
        long time = System.currentTimeMillis();
        for (int i = 0; i < insert; i++) {
            list.add(mid, i);
        }
        System.out.printf("Insert1 in the middle of %s: %d ms%n", listType, System.currentTimeMillis() - time);
    }
}