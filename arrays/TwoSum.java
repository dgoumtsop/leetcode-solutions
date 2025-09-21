package arrays;
import java.util.HashMap;
import java.util.Map;

// Problem: Two Sum
// Approach: HashMap to find complement
// Time Complexity: O(n)
// Space Complexity: O(n)

class Solution {
    public int[] twoSum(int[] nums, int target) {
      Map<Integer, Integer> map = new HashMap<>();
      for(int i = 0; i < nums.length; i++){
        int comp = target - nums[i];
        if(map.containsKey(comp)){
            return new int[]{map.get(comp), i}; 
        }
        map.put(nums[i], i); // store the current num with its index if not in map
      }
      return new int[]{};
    } 
}
