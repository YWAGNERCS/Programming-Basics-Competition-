import java.util.*;

public class A16 {
    public static void main(String[] args) {
        System.out.println(findSecondGreater(List.of(4, 6, 1, 8, 10))); // 8
        System.out.println(findSecondGreater(List.of(4, 4, 4, 4, 4))); // null
    }

    public static Integer findSecondGreater(List<Integer> list) {
        Set<Integer> sortedSet = new TreeSet<>(Collections.reverseOrder());
        sortedSet.addAll(list);
        Iterator<Integer> it = sortedSet.iterator();
        it.next();
        return it.hasNext() ? it.next() : null;
    }
}
