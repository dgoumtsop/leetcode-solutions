class Solution {
// Problem: Valid Anagram
// Approach: Use a HashMap to count character frequencies in s (increment),
// then decrement for each character in t. If any count goes negative, not an anagram.
// Time Complexity: O(n)
// Space Complexity: O(1) - at most 26 lowercase letters in the map

   public boolean isAnagram(String s, String t) {
    if (s.length() != t.length()) return false;

    HashMap<Character, Integer> count = new HashMap<>();

    for (char c : s.toCharArray()) {
        count.put(c, count.getOrDefault(c, 0) + 1);
    }

    for (char c : t.toCharArray()) {
        count.put(c, count.getOrDefault(c, 0) - 1);
        if (count.get(c) < 0) return false;
    }

    return true;
}
    
}
