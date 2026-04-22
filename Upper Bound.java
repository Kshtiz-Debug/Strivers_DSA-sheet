/*



Given a sorted array of nums and an integer x, write a program to find the upper bound of x.



The upper bound of x is defined as the smallest index i such that nums[i] > x.



If no such index is found, return the size of the array.


*/


// again it can be solved using two diff approaches 
// 1. Brute force 
// 2. Binary Search 


// So first let's see the 1st approach

class Solution {
    public int upperBound(int[] nums, int x) {
        for(int i=0;i<nums.length;i++){
            if(nums[i]>x)return i;
        }
        return nums.length;
    }
}


// this is the brute force


// 2nd ...


class Solution {
    public int upperBound(int[] nums, int x) {
        int low=0;
        int high=nums.length-1;
        return u(nums,x,low,high,nums.length)
    }
    private int u(int[] nums,int x,int low,int high,int ans){
        if(high<low)return ans;
        int mid=(high+low)/2;
        if(nums[mid]>x){
            ans=mid;
            return u(nums,x,low,mid-1,ans);
        }
        else{
            return u(nums,x,mid+1,high,ans);
        }
    }
}


// this is the solution based on binary search .......
