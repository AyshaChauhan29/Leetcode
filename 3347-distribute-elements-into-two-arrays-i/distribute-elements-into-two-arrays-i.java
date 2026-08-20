class Solution {
    public int[] resultArray(int[] nums) {
       //make two separate arraylists
       ArrayList<Integer> arr1 = new ArrayList<>();
       ArrayList<Integer> arr2 = new ArrayList<>();

       arr1.add(nums[0]);  //1st ele will always go in first array
       arr2.add(nums[1]);  //next will go in second array

       for(int i=2; i<nums.length; i++){    //start with 2 index
         if(arr1.get(arr1.size()-1) > arr2.get(arr2.size()-1)){
            arr1.add(nums[i]);
         }else{
            arr2.add(nums[i]);
         }
       }

       int[] ans = new int[nums.length];      //make a new arr of size = nums
       int j = 0;

       for(int x : arr1){           //store ele of first arr in ans[]
         ans[j] = x;
         j++;
       }

       for(int x : arr2){           //store ele of second arr in ans[]
         ans[j] = x;
         j++;
       }

       return ans;
    }
}