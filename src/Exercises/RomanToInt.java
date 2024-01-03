package Exercises;

import java.util.HashMap;
import java.util.Map;

public class RomanToInt {
    public static void main(String[] args) {
        System.out.println(romanToInt("CCXLVII"));
    }

    public static int romanToInt(String s) {
        Map<Character, Integer> romansIntegers = new HashMap<>();

        romansIntegers.put('I', 1);
        romansIntegers.put('V', 5);
        romansIntegers.put('X', 10);
        romansIntegers.put('L', 50);
        romansIntegers.put('C', 100);
        romansIntegers.put('D', 500);
        romansIntegers.put('M', 1000);

        int romanInteger = 0;
        int length = s.length();
        for (int i = 0; i < length; i++) {
            int curCharRepr = romansIntegers.get(s.charAt(i));
            if (i < length - 1 && curCharRepr < romansIntegers.get(s.charAt(i + 1))) {
                romanInteger -= curCharRepr;
            } else {
                romanInteger += curCharRepr;
            }
        }

        return romanInteger;
    }
}
