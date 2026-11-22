class Solution {
    public boolean backspaceCompare(String s, String t) {
        Stack<Character> st = new Stack<>();
        Stack<Character> st2 = new Stack<>();

        for(int i=0; i<s.length(); i++){
            char c = s.charAt(i);

            if(c != '#'){
                st.push(c);
            }else if(!st.isEmpty()){           // pop only if stack is not empty
                st.pop();
            }
        }

        String a = "";
        while(!st.isEmpty()){
            a += st.pop();
        }

        for(int i=0; i<t.length(); i++){
            char c = t.charAt(i);

            if(c != '#'){
                st2.push(c);
            }else if(!st2.isEmpty()){           //pop only if stack is not empty
                st2.pop();
            }
        }

        String b = "";
        while(!st2.isEmpty()){
            b += st2.pop();
        }

        // while(!st.isEmpty() && !st2.isEmpty()){
        //     if(st.pop() != st2.pop()) return false;
        // }
        // return true;

        return a.equals(b);
    }
}