class Solution {

    static String pref(String x, String y) {
        int i = 0;

        while(i < x.length() && i < y.length() && x.charAt(i) == y.charAt(i)){
            i++;
        }
        return x.substring(0, i);
    }


    public String longestCommonPrefix(String[] strs) {
        int n = strs.length;
        String res = strs[0];

        for(int i=1; i<n; i++){
            res = pref(res, strs[i]);
            if(res.equals("")){
                return "";
            }
        }
        return res;
    }
}