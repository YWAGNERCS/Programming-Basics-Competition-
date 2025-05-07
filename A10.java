import java.util.ArrayList;
import java.util.List;

public class A10 {
    public static void main(String[] args) {
        int[] a1 = {1, 2, 3, 3, 4};
        int[] a2 = {2, 2, 3, 3, 3, 4, 6};

        System.out.println(calculateSet(a1, a2, true));  // [2, 3, 4]
        System.out.println(calculateSet(a1, a2, false)); // [1, 6]
    }

    public static List<Integer> calculateSet(int[] a1, int[] a2, boolean comunes) {
        List<Integer> r = new ArrayList<>();
        for (int x : a1)
            if (comunes ? en(a2, x) : !en(a2, x))
                if (!en(r, x)) r.add(x);
        if (!comunes)
            for (int x : a2)
                if (!en(a1, x) && !en(r, x)) r.add(x);
        return r;
    }

    static boolean en(int[] arr, int v) {
        for (int x : arr) if (x == v) return true;
        return false;
    }

    static boolean en(List<Integer> list, int v) {
        for (int x : list) if (x == v) return true;
        return false;
    }
}
