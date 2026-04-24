/*


Given an array of integers nums sorted in non-decreasing order, find the starting and ending position of a given target value. If the target is not found in the array, return [-1, -1].



*/


// There r two approaches for this 
// 1. Brute force

class Solution {
    public int[] searchRange(int[] nums, int target) {
        int first=-1;
        int last=-1;
    for(int i=0;i<nums.length;i++){
        if(nums[i]==target){
            if(first==-1)first=i;
            last=i;
        }
    }
    return new int[]{first,last};
    }
}



// 2. Optimal


