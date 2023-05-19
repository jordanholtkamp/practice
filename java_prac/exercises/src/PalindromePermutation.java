import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PalindromePermutation {
    private static boolean canPermutatePalindrome(String s) {

        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            String sub = s.substring(i, i + 1);
            int count = map.getOrDefault(sub, 0);
            map.put(sub, count + 1);
        }

        if (map.values().size() % 2 == 0) { // this needs fixed - we need the whole sum of the values
            boolean evenOccurance = map.values().stream().allMatch((i -> i % 2 == 0));
            return evenOccurance;
        } else {
            long numOfOdds = map.values().stream().filter(i -> i % 2 != 0).count();
            return numOfOdds == 1 ? true : false;
        }
    }

    public static void main(String[] args) {
        System.out.println(canPermutatePalindrome("code"));
        System.out.println(canPermutatePalindrome("aab"));
        System.out.println(canPermutatePalindrome("carerac"));
        System.out.println(canPermutatePalindrome("cccddccc"));
    }
}
