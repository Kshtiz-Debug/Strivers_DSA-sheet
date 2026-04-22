/*


Given a sorted array of nums consisting of distinct integers and a target value, return the index if the target is found. If not, return the index where it would be if it were inserted in order.


*/


// Now to solve this type of problem 
// We have typically 2 ways 
// 1. Brute Foce
// 2. Optimized 


// Brute is again not efficient and uses for loop to traverse through the loop
// While the Optimized solution takes two pointers to traverse n find the solution


// 1st way

class Solution {
    public int searchInsert(int[] nums, int target) {
      for(int i=0;i<nums.length;i++){
        if(nums[i]==target)return i;
        else if(nums[i]>target)return i;
      }
      return nums.length;
    }
}



// This is the brute force method ----> using Linear Search
// 2nd

class Solution {
    public int searchInsert(int[] nums, int target) {
      int low=0;
      int high=nums.length-1;
      return s(nums,target,low,high,high+1);
    }
    private int s(int[] nums,int target,int low,int high,int ans){
        if(high<low)return ans;
        int mid=(high+low)/2;
        if(nums[mid]==target)return mid;
        else if(nums[mid]>target){
            ans=mid;
            return s(nums,target,low,mid-1,ans);
        }
        else{
            return s(nums,target,mid+1,high,ans);
        }
    }
}



// This is the optimized approach using Binary Search

