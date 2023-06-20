public class SmallestCommonElement {

    private static int smallestElement(int[][] matrix) {
        int smallest = Integer.MAX_VALUE;

        for (int i = 0; i < matrix[0].length; i++) {
            int firstArrPointer = matrix[0][i];

            for (int j = 1; j < matrix.length; j++) {
                int movingArrPointer = 0;
                while (movingArrPointer < matrix[j].length) {
                    int current = matrix[j][movingArrPointer];
                    if (firstArrPointer == current) {
                        smallest = current;
                    }
                    movingArrPointer++;
                }


            }
        }
        return smallest;
    }

    public static void main(String[] args) {
        int[][] mat = new int[][]{{1,2,3,4,5},{2,4,5,8,10},{3,5,7,9,11},{1,3,5,7,9}};
        System.out.println(smallestElement(mat));
    }
}
