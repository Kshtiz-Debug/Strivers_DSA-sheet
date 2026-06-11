/*


Given a positive integer n. Find and return its square root. If n is not a perfect square, then return the floor value of sqrt(n).


*/


class Solution {
    public int floorSqrt(int n) {
      return (int)Math.sqrt(n);
    }
}


// this is using a math function but wht if we dont wanna use it 
// then 


// We can do this ::


class Solution {
    public int floorSqrt(int n) {
        int ans=1;
      for(int i=1;i<=n/2;i++){
        if(i*i<=n){
            ans=i;
        }
      }
      return ans;
    }
}


// this will go through the numbers n find the square root int value of n


// But this is not as a=effective as the math function


// So to optimize this 
// when asked in interview use binary search 


