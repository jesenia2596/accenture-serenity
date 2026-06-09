package util;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Utils {

    public static <T extends Comparable<? super T>> boolean isAscending(List<T> list) {
        return isOrdered(list, Comparator.naturalOrder());
    }

    public static <T extends Comparable<? super T>> boolean isDescending(List<T> list) {
        return isOrdered(list, Comparator.reverseOrder());
    }

    private static <T> boolean isOrdered(List<T> list, Comparator<T> comparator) {
        List<T> sorted = new ArrayList<>(list);
        sorted.sort(comparator);
        return list.equals(sorted);
    }
}