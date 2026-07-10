class Solution {
    public int compress(char[] chars) {

        // Time Complexity: O(N) , Space Compl. : O(1)

        int n = chars.length;
        int idx = 0;

       //pick one character
        for(int i=0; i<n; i++){
            //count its frequency
            int count = 1;
            while(i < n-1 && chars[i] == chars[i+1]){
                count++;
                i++;
            }

            chars[idx] = chars[i];   //store the character
            idx++;

            if(count > 1){
                String str = Integer.toString(count);

                for(int j=0; j<str.length(); j++){
                    chars[idx] = str.charAt(j);
                    idx++;
                }          
           }
        }
        return idx;
    }
}