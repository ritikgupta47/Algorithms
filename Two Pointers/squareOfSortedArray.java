/*                          ***** 977. Square of sorted Array
 * Given an integer array nums sorted in non-decreasing order, return an array of the squares of each number 
 * sorted in non-decreasing order.

Example 1:

Input: nums = [-4,-1,0,3,10]
Output: [0,1,9,16,100]
Explanation: After squaring, the array becomes [16,1,0,9,100].
After sorting, it becomes [0,1,9,16,100].

Example 2:

Input: nums = [-7,-3,2,3,11]
Output: [4,9,9,49,121]
 */

class Solution {
    public int[] sortedSquares(int[] A) {
        int[] res = new int[A.length];
       int start = 0, end = A.length-1;
       int resIndex = A.length-1;
       
       while(start <= end){
           if(A[start]*A[start] > A[end]*A[end]){
               res[resIndex--] = A[start]*A[start];
               start++;
           }else{
               res[resIndex--] = A[end]*A[end];
               end--;
           }
       }
       
       return res;
    }
}