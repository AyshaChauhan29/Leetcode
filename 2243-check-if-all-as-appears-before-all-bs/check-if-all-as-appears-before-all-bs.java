class Solution {
    public boolean checkString(String s) {
        int n = s.length();

        // for(int i=0; i<n; i++){
        //     if(s.charAt(i) == 'b'){
        //        for(int j=i; j<n; j++){
        //          if(s.charAt(j) == 'a') return false;
        //        }
        //     }
        // }
        // return true;

        boolean check  = false;
        for(int i=0; i<n; i++){
            if(s.charAt(i) == 'b'){
               check = true;
            }

            if(s.charAt(i) == 'a' && check == true){
               return false;
            }
        }
        return true;
    }
}