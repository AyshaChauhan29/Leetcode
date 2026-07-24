class Solution {
    public int triangleNumber(int[] nums) {
        int n = nums.length;
        int count = 0;
// O(N3) --> gives TLE(Brute Force)
        // for(int i=0; i<n-2; i++){
        //    for(int j=i+1; j<n-1; j++){
        //     for(int k=j+1; k<n; k++){
        //          int a  = nums[i];
        //          int b = nums[j];
        //          int c = nums[k];

        //        if(a+b>c && b+c>a && a+c>b) count++;
        //     }
        //   }
        // }
        // return count;


        // OPTIMISED TWO POINTERS SOLUTION
        Arrays.sort(nums);
        for(int k=n-1; k>=2; k--){
            int left = 0;
            int right = k-1;

            while(left < right){
                if(nums[left] + nums[right] > nums[k]){
                    count += right - left;

                    right--;
                }
                else{
                    left++;
                }
            }
        }
        return count;
    }
}