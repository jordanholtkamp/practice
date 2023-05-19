import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CountKDifference {

    private static int countKDifference(int[] nums, int k) {
        int count = 0;
        List<Integer> numsList = Arrays.stream(nums).boxed().collect(Collectors.toList());

        int i = 0;

        while (i < numsList.size()) {
            int current = numsList.remove(i);
            for (Integer number : numsList) {
                if (Math.abs(current - number) == k) {
                    count++;
                }
            }
        }

        return count;
    }


    public static void main(String[] args) {
        System.out.println(countKDifference(new int[]{1, 2 ,2, 1}, 1));
    }
}
