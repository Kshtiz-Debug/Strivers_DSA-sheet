/*

Given an integer array nums, sorted in ascending order (may contain duplicate values) and a target value k. Now the array is rotated at some pivot point unknown to you. Return True if k is present and otherwise, return False.


*/


// There is one way where we linearly traverse through the array to find the element 
// ie the brute force

class Solution {
    public boolean searchInARotatedSortedArrayII(int[] nums, int k) {
      for(int i=0;i<nums.length;i++){
        if(nums[i]==k){
            return true;
        }
      }
      return false;
    }
}


// which is obv not a good idea 
// So lets see the easy idea 

class Solution {
    public boolean searchInARotatedSortedArrayII(int[] nums, int k) {
      int low=0;
      int high=nums.length-1;
      int side;
      while(low<=high){
        int mid=(low+high)/2;
        if(nums[mid]==k){
            return true;
        }

        if (nums[low]==nums[mid] && nums[mid]==nums[high]) {
            low++;
            high--;
            continue;
        }
        if(nums[mid]>=nums[low]){
            side=0;
        }
        else{
            side=1;
        }

        if(side==1){
            if(nums[mid]<k && nums[high]>=k){
                low=mid+1;
            }
            else if(nums[mid]<k && nums[high]<k){
                high=mid-1;
            }
            else if(nums[mid]>k){
                high=mid-1;
            }
        }
        else{
            if(nums[mid]>k && nums[low]<=k){
                high=mid-1;
            }
            else if(nums[mid]>k && nums[low]>k){
                low=mid+1;
            }
            else if(nums[mid]<k){
                low=mid+1;
            }
        }

      }
      return false;
    }
}
