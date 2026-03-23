// Problem : Given an unsorted array of integers, return the length of the longest consecutive sequence
// Approach: Use a HashSet for O(1) lookups. Only start building a sequence from numbers
// count the sequence length. Track the maximum length found
// time complexity : O(n)
// space complexity : O(n)

public int longestConsecutive(int[] nums) {
       HashSet<Integer> set = new HashSet<>();
       for(int num : nums){
        set.add(num);
       }
       int longest = 0;
       for(int num : set){
        if(!set.contains(num - 1)){  // check the beginning of the sequence
            int curr = num;
            int length = 1; 

            // otherwise grow the sequence
            while(set.contains(curr + 1)){
                curr++;
                length++;
            }
            longest = Math.max(longest, length);
        }
       }
       return longest;
    }
}
