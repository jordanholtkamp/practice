import java.util.HashMap;
import java.util.Map;

public class WordPattern {
    private static boolean wordPattern(String pattern, String s) {
        String[] split = s.split(" ");

        if (pattern.length() != split.length) return false;

        Map<String, String> match = new HashMap<>();

        for (int i = 0; i < split.length; i++) {
            String sub = pattern.substring(i, i+1);
            if (match.get(sub) == null && !match.values().contains(split[i])) {
                match.put(sub, split[i]);
            } else if (match.values().contains(split[i]) && match.get(sub) == null) {
                return false;
            } else if (!match.get(sub).equals(split[i])) {
                return false;
            }
        }
        return true;
    }


    public static void main(String[] args) {
        String pattern = "abba", s = "dog cat cat dog";
        System.out.println(wordPattern(pattern, s));
        System.out.println(wordPattern(pattern, "dog dog dog dog"));

    }
}
