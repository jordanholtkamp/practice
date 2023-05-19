import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PascalsTriangle {
    private static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>(numRows);
        for (int i = 0; i < numRows; i++) {
            if (i == 0) {
                result.add(0, Arrays.asList(1));
            } else {
                List<Integer> prevRow = result.get(i - 1);
                List<Integer> nextRow = new ArrayList<>(i+1);
                int j = 0;
                while (j < i+1) {
                    int newNum;
                    if (j == 0) {
                        newNum = prevRow.get(j);
                    } else if (j == i) {
                        newNum = prevRow.get(j - 1);
                    } else {
                        newNum = prevRow.get(j) + prevRow.get(j - 1);
                    }
                    nextRow.add(j, newNum);
                    j++;
                }
                result.add(nextRow);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(generate(5));
        System.out.println(generate(1));
    }
}
