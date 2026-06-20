/*




Given an array arr of integers. A peak element is defined as an element greater than both of its neighbors.

Formally, if arr[i] is the peak element, arr[i - 1] < arr[i] and arr[i + 1] < arr[i].



Find the index(0-based) of a peak element in the array. If there are multiple peak numbers, return the index of any peak number.



Note:

As there can be many peak values, "true" is given as output if the returned index is a peak number, otherwise the returned value of index.


*/



// the effective way to solve this problem is 


class Solution {
    public int findPeakElement(int[] arr) {
        int low=0;
        int high=arr.length-1;
        while(low<high){
            int mid=low+(high-low)/2;
            if(arr[mid]<arr[mid+1]){
                low=mid+1;
            }
            else{
                high=mid;
            }
            
        }
        return low;
    }
}




// Why ??



// Well as you see this is using the code of binary search as a basic 



