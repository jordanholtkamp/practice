package Dynamic;

import java.util.ArrayList;
import java.util.List;

public class CanSum {
    private static boolean canSum(int targetSum, List<Integer> numbers) {

        // base cases
        if (targetSum == 0) {
            return true;
        }
        if (targetSum < 0) return false;

        for (int num : numbers) {
            int remainder = targetSum - num;
            if (canSum(remainder, numbers)) {
                return true;
            }
        }
        return false;

    }

    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>();
        nums.add(5);
        nums.add(3);
        nums.add(4);
        nums.add(7);
        System.out.println(canSum(7, nums));

        List<Integer> nums2 = new ArrayList<>();
        nums2.add(7);
        nums2.add(14);
        System.out.println(canSum(300, nums2));
    }
}
