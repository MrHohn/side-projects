// Two Sum II - Input array is sorted My Submissions Question Solution 
// Total Accepted: 3534 Total Submissions: 8141 Difficulty: Medium
// Given an array of integers that is already sorted in ascending order, find two numbers such that they add up to a specific target number.

// The function twoSum should return indices of the two numbers such that they add up to the target, where index1 must be less than index2. Please note that your returned answers (both index1 and index2) are not zero-based.

// You may assume that each input would have exactly one solution.

// Input: numbers={2, 7, 11, 15}, target=9
// Output: index1=1, index2=2

// Hide Tags Array Two Pointers Binary Search
// Hide Similar Problems (M) Two Sum

public class Solution {
    public int[] twoSum(int[] numbers, int target) {
        if (numbers == null || numbers.length == 0) {
            return new int[0];
        }
        
        int[] result = new int[2];
        
        int left = 0, right = numbers.length - 1;
        
        while (left < right) {
            int sum = numbers[left] + numbers[right];
            if ( sum == target) {
                result[0] = left + 1;
                result[1] = right + 1;
                return result;
            }
            else if (sum > target) {
                --right;
            }
            else {
                ++left;
            }
        }
        
        return new int[0];
    }
}
