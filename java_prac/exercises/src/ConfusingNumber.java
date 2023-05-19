import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class ConfusingNumber {

    private static boolean confusingNumber(int n) {
        int start = n;
        int tmp = 0;
        int[] invalids = new int[]{2,3,4,5,7};
        int[] newNum = new int[String.valueOf(n).length()];

        Map<Integer, Integer> rotate = new HashMap<>();
        rotate.put(0,0);
        rotate.put(1,1);
        rotate.put(6,9);
        rotate.put(8,8);
        rotate.put(9,6);

        int ind = 0;

        // 69
        while (n > 0) {
            tmp = n % 10; // tmp = 9
            int finalTmp = tmp;
            n /= 10;
            if (Arrays.stream(invalids).anyMatch(i -> i == finalTmp)) {
                return false;
            }
            if (rotate.containsKey(tmp)) {
                newNum[ind] = rotate.get(tmp);
            }
            ind++;
        }

        int res=0;
        for(int i=0;i<newNum.length;i++) {
            res=res*10+newNum[i];
        }

        return res == start ? false : true;
    }

    public static void main(String[] args) {
        int n = 6;
        System.out.println(confusingNumber(n));
        int x = 89;
        System.out.println(confusingNumber(x));
        int elev = 11;
        System.out.println(confusingNumber(elev));
    }
}
