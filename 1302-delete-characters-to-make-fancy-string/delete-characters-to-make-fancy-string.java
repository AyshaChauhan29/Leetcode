class Solution {
    public String makeFancyString(String s) {
        int n = s.length();
        int ct = 0;
        //String ans = "";
        StringBuilder ans = new StringBuilder();


        for(int i=0; i<n; i++){
          
            if(i > 0 && s.charAt(i) == s.charAt(i-1)) {
                ct++;
            } 
            else {
                ct = 1;
            }

            if(ct < 3) {
                //ans += s.charAt(i);
                ans.append(s.charAt(i));
            }
        }
        //return ans;
        return ans.toString();   
    }
}