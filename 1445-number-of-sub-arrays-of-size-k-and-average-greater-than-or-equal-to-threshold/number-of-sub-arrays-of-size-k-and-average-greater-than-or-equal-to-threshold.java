class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
    // Time Comp. : O(k) + O(n - k) = O(n)
    // Space Comp. : O(1)
      int n = arr.length;
      int sum = 0;
      
      //first k element s ka sum
      for(int i=0; i<k; i++){
        sum += arr[i];
      }
    
      int count = 0;
      // check the very first window
      if(sum/k >= threshold){
            count++;
      }
        
      //Slide Window
      for(int i=1; i<=n-k; i++){
        sum -= arr[i-1];           //shrink
        sum += arr[i+k-1];         //expand

        int avg = sum/k;
         if(avg >= threshold){
            count++;
         }
      }
      return count;
    }
}