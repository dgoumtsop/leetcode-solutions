package arrays;
import java.util.Set;
import java.util.HashSet;

// Problem: Contains Duplicate
// Approach: check if item is in the set, add if not otherwise return false
// Time Complexity: O(n)
// Space Complexity: O(n)

class Solution {
    public boolean containsDuplicate(int[] nums) {
     Set<Integer> set = new HashSet<>();
     for(int num : nums){
        if(set.contains(num)){
            return true;
        }
        set.add(num);
     }
     return false;
    }
}