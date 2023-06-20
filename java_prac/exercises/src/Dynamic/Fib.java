package Dynamic;

import java.util.HashMap;
import java.util.Map;

public class Fib {

    private static int fib(int n) {
        // This recursive function is 2^n time complexity - we can optimize with MEMOIZATION
        //         if (n <= 2) return 1;
        //         return fib(n - 1) + fib(n - 2);
        // Here is some memoization:
        // keys will be arg to function, value will be the return value
        return fib(n, new HashMap<>());
    }

    /**
     *
     * @param n
     * @param memo
     * @return fib output.
      * We use overloading to have the optional memo parameter that we are calling when we call inside the method, but
     * not in the actual method invocation. We could consider just invoking with an empty hash since there are no real
     * optional params in Java
     */
    private static int fib(int n, Map<Integer, Integer> memo) {
        if (memo.containsKey(n)) { return memo.get(n); }
        if (n <= 2) return 1;
        memo.put(n, fib(n - 1, memo) + fib(n - 2, memo));
        return memo.get(n);
    }


    public static void main(String[] args) {
    System.out.println(fib(6));
    System.out.println(fib(7));
    System.out.println(fib(8));
    System.out.println(fib(40)); // once we get to 50 i think we get above what an int is allowed to be so it shows a neg
    }
}
