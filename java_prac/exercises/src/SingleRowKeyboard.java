public class SingleRowKeyboard {

    private static int calcTypeTime(String keyboard, String word) {
        /**
         * traverse our word, find the index in keyboard of the first letter...
         * starting index (call it current) is 0
         * subtract next index from current
        */
        return 5;
    }

    public static void main(String[] args) {
        String keyboard = "abcdefghijklmnopqrstuvwxyz";
        String word = "cba";
        System.out.println(calcTypeTime(keyboard, word));

        String keyboard2 = "pqrstuvwxyzabcdefghijklmno";
        String word2 = "leetcode";
        System.out.println(calcTypeTime(keyboard2, word2));
    }
}
