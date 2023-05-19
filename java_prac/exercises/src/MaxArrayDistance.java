import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MaxArrayDistance {

    private static int getMaxDistance(List<List<Integer>> arrays) {

        int res = 0;
        int n = arrays.get(0).size();
        int minVal = arrays.get(0).get(0);
        int maxVal = arrays.get(0).get(n - 1);


        for (int i = 1; i < arrays.size(); i++) {
            n = arrays.get(i).size();
            res = Math.max(res, Math.max(Math.abs(arrays.get(i).get(0) - maxVal),
                    Math.abs(arrays.get(i).get(n - 1) - minVal)));
            minVal = Math.min(minVal, arrays.get(i).get(0));
            maxVal = Math.max(maxVal, arrays.get(i).get(n - 1));
        }

        return res;

        //        for (int i = 0; i < arrays.size() - 1; i++) {
        //            for (int j = i + 1; j < arrays.size(); j++) {
        //                int smallFirst = arrays.get(i).get(0);
        //                int bigFirst = arrays.get(i).get(arrays.get(i).size()-1);
        //                int smallSecond = arrays.get(j).get(0);
        //                int bigSecond = arrays.get(j).get(arrays.get(j).size()-1);
        //
        //                if (Math.abs(smallSecond - bigFirst) > res) {
        //                    res = Math.abs(smallSecond - bigFirst);
        //                }
        //                if (Math.abs(bigSecond - smallFirst) > res) {
        //                    res = Math.abs(bigSecond - smallFirst);
        //                }
        //            }
        //        }
        //        return res
    }

    public static void main(String[] args) {
        List<List<Integer>> arrays = Arrays.asList((Arrays.asList(1,2,3)),
                Arrays.asList(4,5), Arrays.asList(1,2,3));
        System.out.println(getMaxDistance(arrays));
    }
}
