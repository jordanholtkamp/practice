import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LengthOfLongestSubstring {

    private static int lengthOfLongestSubstring(String s) {
        // p w w k e w
        int[] chars = new int[128];
        int left = 0;
        int right = 0;
        int ans = 0;
        while (right < s.length()) {
            char r = s.charAt(right);
            chars[r]++;

            while (chars[r] > 1) {
                char l = s.charAt(left);
                chars[l]--;
                left++;
            }
            ans = Math.max(ans, right - left + 1);
            right++;
        }
        return ans;



        //        if (s.isEmpty()) { return 0;}
        //        if (s.length() == 1) { return 1; }
        //        List<String> sub = new ArrayList<>();
        //        List<Integer> subLengths = new ArrayList<>();
        //        for (int i = 0; i < s.length(); i++) {
        //            String starter = s.substring(i,i+1);
        //            sub.add(starter);
        //            if (i + 1 == s.length()) {return Collections.max(subLengths);}
        //            for (int j = i + 1; j < s.length(); j++) {
        //                String current = s.substring(j, j + 1);
        //                if (sub.contains(current)) {
        //                    subLengths.add(sub.size());
        //                    sub.clear();
        //                    break;
        //                } else {
        //                    sub.add(current);
        //                    if (j + 1 == s.length()) {
        //                        subLengths.add(sub.size());
        //                        return Collections.max(subLengths);
        //                    }
        //                }
        //            }
        //        }
        //        return 0;
    }



    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring("aab"));
        System.out.println(lengthOfLongestSubstring("pwwkew"));
        System.out.println(lengthOfLongestSubstring("dfdw"));
        System.out.println(lengthOfLongestSubstring("abcabcbb"));

    }
}
