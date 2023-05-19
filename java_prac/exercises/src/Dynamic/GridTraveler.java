package Dynamic;

import java.util.HashMap;
import java.util.Map;

public class GridTraveler {

    private static int travel(int rows, int columns) {
        return travel(rows - 1, columns, new HashMap<>()) + travel(rows, columns - 1, new HashMap<>());
    }

    private static int travel(int rows, int columns, Map<String, Integer> memo) {
        // are the args in the memo
        String key = (rows) + "," + (columns);
        if (memo.containsKey(key)) {return memo.get(key);}

        if (rows == 0 || columns == 0) {return 0;}
        if (rows == 1 && columns == 1) {return 1;}
        memo.put(key, travel(rows - 1, columns, memo) + travel(rows, columns - 1, memo));
        return memo.get(key);
    }

    public static void main(String[] args) {
        System.out.println(travel(3,3));
        System.out.println(travel(6,6));
        System.out.println(travel(2,3));
        System.out.println(travel(12,18));

    }
}
