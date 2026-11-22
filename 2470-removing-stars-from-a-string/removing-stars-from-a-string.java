class Solution {
    public String removeStars(String s) {
     /*   int n = s.length();

        Stack<Character> st = new Stack<>();

        for(int i=0; i<n; i++){
            char c = s.charAt(i);

            if(st.isEmpty() || c != '*'){
                st.push(c);
            }
            else if(c == '*'){
                st.pop();
            }
        }

        Stack<Character> st2 = new Stack<>();
        while(!st.isEmpty()){
            st2.push(st.pop());
        }

        String ans = "";
        while(!st2.isEmpty()){
            ans += st2.pop();
        }

        return ans;           */   //--------------> O(n2) 


        StringBuilder sb = new StringBuilder(); // acts as our stack

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (c == '*') {
                sb.deleteCharAt(sb.length() - 1); // pop: remove the last char
            } else {
                sb.append(c);                     // push
            }
        }

        return sb.toString();
    }
}