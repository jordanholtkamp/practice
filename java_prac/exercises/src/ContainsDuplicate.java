import java.util.Arrays;

import java.util.Set;
import java.util.stream.Collectors;

public class ContainsDuplicate {

    private static boolean containsDuplicate(int[] nums) {
        Set<Integer> uniqCheck = Arrays.stream(nums).boxed().collect(Collectors.toSet());
        if (uniqCheck.size() == nums.length) {
            return false;
        } else { return true; }
    }

    public static void main(String[] args) {
        int[] arr = new int[] {1,2,2,1,1,3};
        System.out.println(containsDuplicate(arr));
    }


}
