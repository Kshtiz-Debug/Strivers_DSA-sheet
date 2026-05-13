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

         // so a rotated array has a speciality --> when viewed from a element either of its side is always gonna be sorted 
         // we will use it to find the solution

        if(nums[mid]>=nums[low]){
            side=0;   // if side is 0 tht means the left side is sorted 
        }
        else{
            side=1;     // if side is 1 tht means the right side is sorted
        }



         // now once we know which side is sorted then we will go to next step which is to see if the element k is thr in sorted side or not
         // if it is thr we will discard the other side otherwise discard the sorted side 
         
        if(side==0){
            if(nums[mid]>k && nums[low]<=k){
                high=mid-1;      // So the element k is in the sorted array
            }
            else if(nums[mid]>k && nums[low]>=k){
                low=mid+1;    //  So the element k is not in the sorted array
            }
            else if(nums[mid]<k){
                low=mid+1;    
            }
        }

          // same for this 
          
        else{
            if(nums[mid]>k){
                high=mid-1;
            }
            else if(nums[mid]<k && nums[high]<=k){
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
