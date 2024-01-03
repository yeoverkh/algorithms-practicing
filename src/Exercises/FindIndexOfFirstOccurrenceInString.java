package Exercises;

public class FindIndexOfFirstOccurrenceInString {

    public static void main(String[] args) {
        System.out.println(strStr("hello", "ll"));
    }

    public static int strStr(String haystack, String needle) {
        if (!haystack.contains(needle)) {
            return -1;
        }
        char[] haystackChars = haystack.toCharArray();
        char firstNeedleChar = needle.charAt(0);
        for (int i = 0; i < haystackChars.length; i++) {
            if (haystackChars[i] == firstNeedleChar && haystack.startsWith(needle, i)) {
                return i;
            }
        }
        return -1;
    }
}
