import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class UniqueOccurances {

    private static boolean uniqueOccurances(int[] arr) {
        Map<Integer, Integer> checkCount = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            if (checkCount.containsKey(arr[i])) {
                checkCount.put(arr[i], checkCount.get(arr[i]) + 1);
            } else {
                checkCount.put(arr[i], 1);
            }
        }

        Set<Integer> s = new HashSet<>(checkCount.values());
        if (s.size() == checkCount.values().size()) {
            return true;
        } else {return false;}

    }

    public static void main(String[] args) {
        int[] arr = new int[] {1,2,2,1,1,3};
        System.out.println(uniqueOccurances(arr));
    }


}
