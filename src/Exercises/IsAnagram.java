package Exercises;

public class IsAnagram {

    public static boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;
        int[] letters = new int[26];

        for (char c : s.toCharArray()) {
            letters[c - 'a']++;
        }

        for (char c : t.toCharArray()) {
            if (letters[c - 'a'] == 0) return false;
            letters[c - 'a']--;
        }

        return true;
    }
}
