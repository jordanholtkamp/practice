import java.util.ArrayList;
import java.util.List;

public class MedianOfTwoSortedArrays {
    private static double findMedianSortedArrays(int[] nums1, int[] nums2) {

        int n = nums1.length;
        int m = nums2.length;

        double median;
        List<Integer> mergedList = new ArrayList<>();

        int nums1pointer = 0;
        int nums2pointer = 0;
        while (nums1pointer < n && nums2pointer < m) {
            int currelement1 = nums1[nums1pointer];
            int currelement2 = nums2[nums2pointer];

            if (currelement1 > currelement2) {
                mergedList.add(currelement2);
                nums2pointer ++;
            } else {
                mergedList.add(currelement1);
                nums1pointer ++;
            }
        }
        while (nums1pointer < n) {
            mergedList.add(nums1[nums1pointer]);
            nums1pointer++;
        }
        while (nums2pointer < m) {
            mergedList.add(nums2[nums2pointer]);
            nums2pointer++;
        }
        if (mergedList.size() % 2 == 0){
            int leftMiddle = mergedList.get((mergedList.size() / 2) - 1);
            int rightMiddle = mergedList.get(mergedList.size() / 2);
            median = (double) (leftMiddle + rightMiddle) / 2;
        } else {
            median = mergedList.get((mergedList.size()-1)/2);
        }
        return median;
    }

    public static void main(String[] args) {
        int[] nums1 = new int[]{1, 3};
        int[] nums2 = new int[] {2};
        System.out.println(findMedianSortedArrays(nums1,nums2));
        int[] nums3 = new int[] {1, 2};
        int[] nums4 = new int[] {3, 4};
        System.out.println(findMedianSortedArrays(nums3,nums4));

    }

}
