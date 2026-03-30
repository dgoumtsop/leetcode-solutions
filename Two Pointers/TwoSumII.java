// Two Sum II - find two numbers in a sorted array that add up to a target and return their 1-based indices.
// Approach: two pointers, check if sum == target return indices otherwise move pointers accordingly
// Time complexity : O(n)
// Space complexity : O(1)

class Solution {
    public int[] twoSum(int[] numbers, int target) {
    int n = numbers.length;
    int l = 0;
    int r = n - 1;
    while( l < r){
        int sum = numbers[l] + numbers[r];
        if(sum == target){
            return new int []{ l + 1, r + 1}; // to account for 1-indexing
        } if(sum < target){
            l++;
        } else {
            r--;
        }
    }
    return new int[]{};
    }
}
