import java.util.*;

public class LargestUniqNum {

    private static int largestUniqueNumber(int[] nums) {
        // Let's try a hash
        //        Map<Integer, Boolean> numCount = new HashMap<>();
        //        for (int num : nums) {
        //            if (numCount.get(num) == null) {
        //                numCount.put(num, true);
        //            } else {
        //                numCount.put(num, false);
        //            }
        //        }
        //        for ()
        //    }





        List<Integer> uniq = new ArrayList<>();
        List<Integer> removed = new ArrayList<>();

        for (int num : nums) {
            if (uniq.contains(num)) {
                uniq.remove(Integer.valueOf(num));
                removed.add(num);
            } else if (!uniq.contains(num) && !removed.contains(num)){
                uniq.add(num);
            }
        }
        if (uniq.isEmpty()) { return -1; }
        return Collections.max(uniq);

    }

    public static void main(String[] args) {
        System.out.println(largestUniqueNumber(new int[] {5,7,3,9,4,9,8,3,1}));
        System.out.println(largestUniqueNumber(new int[] {9,9,8,8}));
    }
}
