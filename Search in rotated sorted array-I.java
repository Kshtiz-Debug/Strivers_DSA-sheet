/*


Given an integer array nums, sorted in ascending order (with distinct values) and a target value k. The array is rotated at some pivot point that is unknown. Find the index at which k is present and if k is not present return -1.


*/

// So the optimized code for this type of problem is 
// Using Binary Search 


class Solution {
    public int search(int[] nums, int k) {
       int low,mid,high;
       low=0;
       high=nums.length-1;
       int side;
       while(low<=high){
        mid=(low+high)/2;
        if(nums[mid]==k){
            return mid;
        }




        if(nums[mid]>=nums[low]){
            side=0;
        }
        else{
            side=1;
        }

        if(side==0){
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
        else{
            if(nums[mid]>k){
                high=mid-1;
            }
            else if(nums[mid]<k && nums[high]<k){
                high=mid-1;
            }
            else if(nums[mid]<k && nums[high]>=k){
                low=mid+1;
            }
        }
        }
        return -1;
       
    }
}
