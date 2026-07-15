/*


Given two sorted arrays arr1 and arr2 of size m and n respectively, return the median of the two sorted arrays.



The median is defined as the middle value of a sorted list of numbers. In case the length of the list is even, the median is the average of the two middle elements.


Example 1

Input: arr1 = [2, 4, 6], arr2 = [1, 3, 5]

Output: 3.5

Explanation: The array after merging arr1 and arr2 will be [ 1, 2, 3, 4, 5, 6 ]. As the length of the merged list is even, the median is the average of the two middle elements. Here two medians are 3 and 4. So the median will be the average of 3 and 4, which is 3.5.


*/



//  The optimized way to solve this problem is using binary search 

class Solution {
    public double median(int[] arr1, int[] arr2) {
        // Always ensure arr1 is the smaller array to optimize binary search space
        if (arr1.length > arr2.length) {
            return median(arr2, arr1);
        }

        int m = arr1.length;
        int n = arr2.length;
        int low = 0;
        int high = m;
        int totalLength = m + n;

        while (low <= high) {
            // Partition both arrays
            int cut1 = low + (high - low) / 2;
            int cut2 = (totalLength + 1) / 2 - cut1;

            // Get elements around the cut (using MIN/MAX values for out-of-bound edge cases)
            int a = (cut1 == 0) ? Integer.MIN_VALUE : arr1[cut1 - 1]; // Left side of arr1
            int b = (cut2 == 0) ? Integer.MIN_VALUE : arr2[cut2 - 1]; // Left side of arr2
            
            int c = (cut1 == m) ? Integer.MAX_VALUE : arr1[cut1];     // Right side of arr1
            int d = (cut2 == n) ? Integer.MAX_VALUE : arr2[cut2];     // Right side of arr2

            // Check if we have partitioned the arrays correctly
            if (a <= d && b <= c) {
                // If total number of elements is even
                if (totalLength % 2 == 0) {
                    return (Math.max(a, b) + Math.min(c, d)) / 2.0;
                } 
                // If total number of elements is odd
                else {
                    return Math.max(a, b);
                }
            } 
            // We took too many elements from arr1, move left
            else if (a > d) {
                high = cut1 - 1;
            } 
            // We took too few elements from arr1, move right
            else {
                low = cut1 + 1;
            }
        }
        return 0.0;
    }
}




// the other way to solve it is using brute force 

class Solution {
    public double median(int[] arr1, int[] arr2) {
        int i=0;
        int j=0;
        int[] arr3=new int[arr1.length + arr2.length];
        int k=0;
        while(i<arr1.length && j<arr2.length){
            if(arr1[i]<arr2[j]){
                arr3[k++]=arr1[i++];
            }
            else{
                arr3[k++]=arr2[j++];
            }
        }
        while(i<arr1.length){
            arr3[k++]=arr1[i++];
        }
        while(j<arr2.length){
            arr3[k++]=arr2[j++];
        }

        if(arr3.length%2!=0){
            return arr3[arr3.length/2];
        }
        else{
            return (arr3[(arr3.length/2)-1]+arr3[(arr3.length/2)])/2.0 ;
        }
    }
}


// In this im going through every element and adding them to one array which is sorted n then calculating the median .
