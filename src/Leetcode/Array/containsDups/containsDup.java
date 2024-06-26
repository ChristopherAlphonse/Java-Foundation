/*
 * 217. Contains Duplicate Solved Easy Topics Companies Given an integer array nums, return true if
 * any value appears at least twice in the array, and return false if every element is distinct.
 * 
 * Example 1:
 * 
 * Input: nums = [1,2,3,1] Output: true Example 2:
 * 
 * Input: nums = [1,2,3,4] Output: false Example 3:
 * 
 * Input: nums = [1,1,1,3,3,4,3,2,4,2] Output: true
 * 
 * Constraints:
 * 
 * 1 <= nums.length <= 105 -
 */

package Leetcode.Array.containsDups;

import java.util.HashSet;
import java.util.Set;

public class containsDup {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> store = new HashSet<>();

        for (int n : nums) {
            if (store.contains(n)) {
                return true;
            }
            store.add(n);
        }
        return false;
    }
}
