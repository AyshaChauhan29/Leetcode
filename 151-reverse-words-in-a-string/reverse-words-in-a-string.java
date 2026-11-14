class Solution {
    public String reverseWords(String s) {
        // int n = s.length();
        // String ans = "";

        // String[] arr = s.split(" ");
        
        // for(int i=arr.length-1; i>=0; i--){
        //     // if(i == 0){
        //     //     ans += "";
        //     // }
        //     ans += arr[i] + " ";    
        // }
        // return ans.trim();


        String[] arr = s.trim().split("\\s+");
        StringBuilder ans = new StringBuilder();

        for(int i = arr.length-1; i >= 0; i--) {
            ans.append(arr[i]);

            if(i != 0) {
                ans.append(" ");
            }
        }

        return ans.toString();
    }
}