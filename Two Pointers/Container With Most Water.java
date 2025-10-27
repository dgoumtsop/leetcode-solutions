package arrays;

// Problem: Container With Most Water
// Approach: Two Pointer / Greedy
// Start with two ends of the array, calculate area using width and min height.
// Move the pointer pointing to the shorter line inward to maximize area.
// Time Complexity: O(n)
// Space Complexity: O(1)

class Solution {
    public int maxArea(int[] height) {
        int n = height.length;
        int maxWater = 0;
        int left = 0;
        int right = n - 1;
        while (left < right) {
            int width = right - left;
            int minHeight = Math.min(height[left], height[right]);
            int area = width * minHeight;
            maxWater = Math.max(area, maxWater);
            if (height[left] < height[right]) {  // Move pointer pointing to the smaller height
                left++;
            } else {
                right--;
            }
        }
        return maxWater;
    }
}

