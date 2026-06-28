import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class ToggleLightBulbs {

    public static List<Integer> toggleLightBulbsHashSet(List<Integer> bulbs) {

        Set<Integer> set = new HashSet<>();

        for (int num : bulbs) {
            if (set.contains(num))
                set.remove(num);
            else
                set.add(num);
        }
        return new ArrayList<>(set);
    }

    public static List<Integer> toggleLightBulbsHashmap(int[] arr) {

        List<Integer> list = new ArrayList<>();
        Map<Integer, Integer> map = new HashMap<>();

        for (int num : arr)
            map.put(num, map.getOrDefault(num, 0) + 1);
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() % 2 == 1)
                list.add(entry.getKey());
        }

        Collections.sort(list);
        return list;
    }

    public static void main(String[] args) {

        int[] bulbs = { 10, 20, 30, 10, 10 };

        System.out.println(toggleLightBulbsHashSet(Arrays.stream(bulbs).boxed().toList()));
        System.out.println(toggleLightBulbsHashmap(bulbs));
    }

}
