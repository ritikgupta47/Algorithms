/*                           189. Rotate Array

 * Given an array, rotate the array to the right by k steps, where k is non-negative.
 * 
Example 1:

Input: nums = [1,2,3,4,5,6,7], k = 3
Output: [5,6,7,1,2,3,4]
Explanation:
rotate 1 steps to the right: [7,1,2,3,4,5,6]
rotate 2 steps to the right: [6,7,1,2,3,4,5]
rotate 3 steps to the right: [5,6,7,1,2,3,4]

Example 2:

Input: nums = [-1,-100,3,99], k = 2
Output: [3,99,-1,-100]
Explanation: 
rotate 1 steps to the right: [99,-1,-100,3]
rotate 2 steps to the right: [3,99,-1,-100]
 */

class Solution {
    public void rotate(int[] nums, int k) {
        k = k%nums.length;
        // reverse whole array
        reverse(0 , nums.length-1 , nums);
        reverse(0 , k-1 , nums);
        reverse(k , nums.length-1 , nums); 

    }
    public static void reverse(int start , int end , int[] nums){
        while(start < end){
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }
}