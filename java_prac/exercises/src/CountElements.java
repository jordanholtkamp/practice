import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class CountElements {


    /*
    Given an integer array arr, count how many elements x there are, such that x + 1 is also in arr.
    If there are duplicates in arr, count them separately.
    */

    private static int count(int[] nums) {
        int count = 0;
        Arrays.sort(nums);
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length - 1; i++) {
            int curr = nums[i];
            for (int j = i+1; j < nums.length; j++) {
                if (nums[i] + 1 == nums[j]) {
                    count++;
                    break;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(count(new int[] {1,2,3}));
        System.out.println(count(new int[] {1,1,3,3,5,5,7,7}));

    }
}
