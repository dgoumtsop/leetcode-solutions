// Problem: Valid Palindrome
// Approach: Two Pointers
// move inward from both ends, skipp non-alphanumeric chars, compare lowercase letters
// Time: O(n) | Space: O(1)

class Solution {
    public boolean isPalindrome(String s) {
        int l = 0, r = s.length() - 1;
        while (l < r) {
            while (l < r && !Character.isLetterOrDigit(s.charAt(l))) l++; // skip non-alnum
            while (l < r && !Character.isLetterOrDigit(s.charAt(r))) r--; // skip non-alnum

            if (Character.toLowerCase(s.charAt(l)) != Character.toLowerCase(s.charAt(r))) return false;
            l++;
            r--;
        }
        return true;
    }
}

