class Solution {
    public boolean checkIfExist(int[] arr) {
        // solviing through sets(find in array)
        int n = arr.length;
        HashSet<Integer> set = new HashSet<>();
        for(int ele : arr){
            if(set.contains(2*ele)){
                return true;
            }
            if(ele%2 == 0 && set.contains(ele/2)){
                return true;
            }
            set.add(ele);
        }
      return false;
    }
}