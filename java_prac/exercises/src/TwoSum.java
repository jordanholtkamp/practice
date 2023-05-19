import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class TwoSum {
    private static int[] twoSum(int[] nums, int target) {
        //        int[] x = new int[2];
        //        for (int i = 0; i < nums.length; i++) {
        //            int newTarget = target - nums[i];
        //            for (int j = i+1; j < nums.length; j++) {
        //                if (newTarget == nums[j]) {
        //                    x[0] = i;
        //                    x[1] = j;
        //                }
        //            }
        //        }
        //        return x;


        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();

        // Loop through each element in the array
        for (int i = 0; i < nums.length; i++) {
            // Calculate the complement of the current element
            int complement = target - nums[i];

            // Check if the complement is already in the HashMap
            if (map.containsKey(complement)) {
                // Return the indices of the two elements
                return new int[] {map.get(complement), i};
            }

            // Add the current element and its index to the HashMap
            map.put(nums[i], i);
        }

        // If no solution is found, return an empty array
        return new int[0];

        // Trying to use two pointer
        //        int left = 0;
        //        int right = nums.length - 1;
        //        int[] res = new int[2];
        //        Arrays.sort(nums);
        //        while (left < right) {
        //            if (nums[left] + nums[right] == target) {
        //                break;
        //            }
        //            else if (nums[left] + nums[right] > target) {
        //                right--;
        //            } else {
        //                left--;
        //            }
        //        }
        //        return res;
    }

    public static void main(String[] args) {
        int[] result = twoSum(new int[]{3, 2, 4}, 6);
        System.out.println(result);
        System.out.println(result[1]);
    }
}
