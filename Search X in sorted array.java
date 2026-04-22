//Given a sorted array of integers nums with 0-based indexing, find the index of a specified target integer. If the target is found in the array, return its index. If the target is not found, return -1.


// so the first basic way is by looping 


class Solution {
    public int search(int[] nums, int target) {
       for(int i=0;i<nums.length;i++){
            if(nums[i]==target){
                return i;
            }
       }
       return -1;
    }
}


// but wht if you dont wanna use loop 
// Then ?

class Solution {
    public int search(int[] nums, int target) {
        int low=0;
        int high=nums.length-1;
        while(high>=low){
            int mid=(high+low)/2;
            if(nums[mid]==target){
                return mid;
            }
            else if(nums[mid]>target){
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return -1;
    }
}




// This is the binary search 

/*

Algorithm:
Now, we will apply the binary search algorithm in the given array:

Divide the search space into 2 halves:
In order to divide the search space, we need to find the middle point of it. So, we will take a ‘mid’ pointer and do the following:
mid = (low+high) // 2 ( ‘//’ refers to integer division)
Compare the middle element with the target:
In this step, we can observe 3 different cases:
If arr[mid] == target: We have found the target. From this step, we can return the index of the target possibly.
If target > arr[mid]: This case signifies our target is located on the right half of the array. So, the next search space will be the right half.
If target < arr[mid]: This case signifies our target is located on the left half of the array. So, the next search space will be the left half.
Trim down the search space:
Based on the probable location of the target we will trim down the search space.
If the target occurs on the left, we should set the high pointer to mid-1. Thus the left half will be the next search space.
Similarly, if the target occurs on the right, we should set the low pointer to mid+1. Thus the right half will be the next search space.
The above steps will continue until either we found the target or the search space becomes invalid i.e. high < low. By definition of search space, it will lose its existence if the high pointer is appearing before the low pointer.



*/



// now we will use recurrsive functions to see the same problem



class Solution {
    public int search(int[] nums, int target) {
        int low = 0;
        int high = nums.length - 1;
        // Match the order: low, then high
        return binarySearch(nums, target, low, high);
    }

    // Standardized order: low first, then high
    private int binarySearch(int[] nums, int target, int low, int high) {
        // Base Case: Range is empty
        if (low > high) {
            return -1;
        }

        int mid = low + (high - low) / 2;

        if (nums[mid] == target) {
            return mid;
        }

        if (nums[mid] > target) {
            // Searching left: low stays same, high becomes mid - 1
            return binarySearch(nums, target, low, mid - 1);
        } else {
            // Searching right: low becomes mid + 1, high stays same
            return binarySearch(nums, target, mid + 1, high);
        }
    }
}



// So we saw the same problem in 3 different ways 






