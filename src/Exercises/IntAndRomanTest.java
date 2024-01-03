package Exercises;

public class IntAndRomanTest {
    public static void main(String[] args) {
        for (int i = 1; i < 4000; i++) {
            String currentRoman = IntToRoman.intToRoman(i);
            int currentInteger = RomanToInt.romanToInt(currentRoman);
            System.out.printf("%-15s=%d%n", currentRoman, currentInteger);
            if (currentInteger != i) {
                throw new RuntimeException();
            }
        }
    }
}
