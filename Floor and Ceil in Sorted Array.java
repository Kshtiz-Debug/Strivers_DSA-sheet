/*



Given a sorted array nums and an integer x. Find the floor and ceil of x in nums. The floor of x is the largest element in the array which is smaller than or equal to x. The ceiling of x is the smallest element in the array greater than or equal to x. If no floor or ceil exists, output -1.



*/


// Now again for this we have two approaches ----> 1. Brute force ( Looping )                              2. Optimal Soln (Binary Search)


// 1st

class Solution {
    public int[] getFloorAndCeil(int[] nums, int x) {
        int floor=-1;
        int ceil=-1;
        int count=0;
       for(int i=0;i<nums.length;i++){
            if(nums[i]>=x && count==0){
                ceil=nums[i];
                count=1;
            }
            if(nums[i]<=x){
                floor=nums[i];
            }
       }
        return new int[]{floor,ceil};
    }
}



// 2nd


// This approach is left to done for this problem 
