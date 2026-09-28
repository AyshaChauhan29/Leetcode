class Solution {
    public String removeDuplicates(String s, int k) {
        Stack<Character> st = new Stack<>();
        Stack<Integer> count = new Stack<>();

        String ans = "";

        for (int i = 0; i < s.length(); i++) {

            char c = s.charAt(i);

            if (!st.isEmpty() && st.peek() == c) {

                st.push(c);

                int x = count.peek() + 1;
                count.push(x);

                if (x == k) {

                    for (int j = 0; j < k; j++) {
                        st.pop();
                        count.pop();
                    }
                }

            } else {

                st.push(c);
                count.push(1);
            }
        }

        while (!st.isEmpty()) {
            ans = st.pop() + ans;
            count.pop();
        }

        return ans;



        // String ans = "";
        // HashMap<Character, Integer> map = new HashMap<>();

        // for(int i = 0; i < s.length(); i++) {

        //     char c = s.charAt(i);

        //     ans += c;

        //     int count = map.getOrDefault(c, 0) + 1;
        //     map.put(c, count);

        //     if(count == k) {

        //         ans = ans.substring(0, ans.length() - k);

        //         map.put(c, 0);
        //     }
        // }

        // return ans;
    }
}