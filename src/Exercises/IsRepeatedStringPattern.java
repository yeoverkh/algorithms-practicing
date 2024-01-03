package Exercises;

public class IsRepeatedStringPattern {

    public static void main(String[] args) {
        boolean abab = repeatedSubstringPattern("abcabcabcabc");
        System.out.println(abab);
    }

    public static boolean repeatedSubstringPattern(String s) {
        String doubled = s + s;
        String sub = doubled.substring(1, doubled.length() - 1);
        return sub.contains(s);
    }
}
