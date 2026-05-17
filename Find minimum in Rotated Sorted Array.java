/*
Given an integer array nums of size N, sorted in ascending order with distinct values, and then rotated an unknown number of times (between 1 and N), find the minimum element in the array.

*/


// The Linear brute force way is :


class Solution {
    public int findMin(ArrayList<Integer> arr) {
        int min=arr.get(0);
      for(int i=0;i<arr.size();i++){
        if(arr.get(i)<min){
            min=arr.get(i);
        }
      }
      return min;
    }
}

// the time complexity of this is O(n) .

// Then the optimal way 

class Solution {
    public int findMin(ArrayList<Integer> arr) {
        int high = arr.size() - 1;
        int low = 0;
        int min = arr.get(low);
        int side;
       
        while (low <= high) {
            int mid = (low + high) / 2;
            
            // Checking if the right side is sorted
            if (arr.get(mid) <= arr.get(high)) {
                side = 1;
            } else {
                side = 0;
            }

            if (side == 1) {
                if (min >= arr.get(mid)) {
                    min = arr.get(mid);
                }
                high = mid - 1;
            } else {
                if (min >= arr.get(mid)) {
                    min = arr.get(mid);
                }
                low = mid + 1;
            }
        }
        return min; 
    }
}



// The time complexity of this comes to O(logn) .
