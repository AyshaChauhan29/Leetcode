class Solution {
    public String removeDuplicates(String s) {
        int n = s.length();

        Stack<Character> st = new Stack<>();

        for(int i=0; i<n; i++){
            char c = s.charAt(i);

            if(st.isEmpty() || st.peek() != c){
               st.push(c);
            }else if(st.peek() == c){
               st.pop();
            }
            
        }

        // String ans = "";
        
        // while(!st.isEmpty()){
        //     ans += st.pop();
        // }
        
        // String rev = "";
        // for(int i=ans.length()-1; i>=0; i--){
        //    rev += ans.charAt(i);
        // }
      
      //OR

        Stack<Character> st2 = new Stack<>();
        while(!st.isEmpty()){
            st2.push(st.pop());
        }

        String ans = "";
        
        while(!st2.isEmpty()){
            ans += st2.pop();
        }

        // StringBuilder sb = new StringBuilder(ans);
        // sb.append(ans);

        //return new StringBuilder(s).reverse().toString();
        //return rev;

        return ans;
    }
}