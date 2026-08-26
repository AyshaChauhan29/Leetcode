class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int n = numbers.length;
        int[] res = new int[2];
        
        int low = 0;
        int high = n-1;

        while(low < high){
            int sum = numbers[low] + numbers[high];

            if(sum == target){
                res[0] = low + 1;
                res[1] = high + 1;

                low++;
                high--;
            }
            else if(sum < target){
                low++;
            }
            else{
                high--;
            }
        }
        return res;
    }
}