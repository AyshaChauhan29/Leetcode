class Solution {
    public int majorityElement(int[] nums) {
        //BOYER-MOORE ALGORITHM
        int n = nums.length;

        int cand = 0;
        int count = 0;

        for(int i=0; i<n; i++){
           if(count == 0){
             cand = nums[i];
           }

           if(nums[i] == cand) count++;
           else count--;
        }
        return cand;
    }
}


// standard Boyer-Moore algorithm assumes a majority element is guaranteed to exist. If it isn't guaranteed, you must do a second pass to verify that the candidate occurs more than n/2 times.