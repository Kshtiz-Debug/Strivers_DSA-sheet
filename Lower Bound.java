/*



Given a sorted array of nums and an integer x, write a program to find the lower bound of x.



The lower bound algorithm finds the first and smallest index in a sorted array where the value at that index is greater than or equal to a given key i.e. x.



If no such index is found, return the size of the array.



*/


// There r two ways to deal with this problem
// 1. Linear search ....... Its brute force ... will take a lot of time n is not efficient 
// 2. Binary search ...... Its the optimal solution ....


//1st way.

class Solution {
    public int lowerBound(int[] nums, int x) {
       for(int i=0;i<nums.length;i++){
        if(nums[i]>=x)return i;
       }
       return nums.length;
     }
}


// by looping through the whole array
//now comes the 2nd way


//2nd way

class Solution {
    public int lowerBound(int[] nums, int x) {
        int low=0;
        int high=nums.length-1;
       return l(nums,x,low,high,nums.length);
     }
     private int l(int[] nums,int x,int low,int high,int ans){
        if(high<low)return ans;
        int mid=(high+low)/2;
        if(nums[mid]>=x){
            ans=mid;
            return l(nums,x,low,mid-1);
        }
        else{
            return l(nums,x,mid+1,high);
        }
     }
}


// This approach is the recursive approach for binary search .....
