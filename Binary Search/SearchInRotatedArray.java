// problem : Search In Rotated Array
// Approach : Modified Binary Search 
// use a binary search variant to determine which half of the current subarray is sorted 
// and then decide whether to search in that half or the other
// Time complexity : O(log(n))
// Space Complexity : O(1)

class Solution {
    public int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (nums[mid] == target) {
                return mid;
            }
            // Check if left half is sorted
            if (nums[left] <= nums[mid]) {
                if (target >= nums[left] && target < nums[mid]) {
                    right = mid - 1;  // Move to left half
                } else {
                    left = mid + 1;  
                }
            }
            else {
                if (target > nums[mid] && target <= nums[right]) {
                    left = mid + 1;   // Move to right half
                } else {
                    right = mid - 1;  
                }
            }
        }
        return -1;
    }
}
