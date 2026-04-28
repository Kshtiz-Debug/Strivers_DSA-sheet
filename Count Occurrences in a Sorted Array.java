/*

You are given a sorted array of integers arr and an integer target. Your task is to determine how many times target appears in arr.



Return the count of occurrences of target in the array.


*/



// now again to solve this we have 2 ways 
// 1. The brute Force             2. Optimal Force 



// 1st --->

class Solution {
    public int countOccurrences(int[] arr, int target) {
        int count=0;
        // Your code goes here
        for(int i=0;i<arr.length;i++){
            if(arr[i]==target){
                count++;
            }
        }
        return count;
    }
}





// 2nd way is ------->


