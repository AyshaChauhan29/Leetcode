class Solution {
    public int calPoints(String[] operations) {
        int n = operations.length;

        Stack<Integer> st = new Stack<>();

        for(int i=0; i<n; i++){

            if(operations[i].equals("+")){
                if(st.isEmpty()) return 0;

                int temp = st.pop();
                int prevSum = st.peek() + temp;

                st.push(temp);
                st.push(prevSum);
            }
            else if(operations[i].equals("D")){
                st.push(2*st.peek());
            }
            else if(operations[i].equals("C")){
                st.pop();
            }
            else{
                st.push(Integer.parseInt(operations[i]));
            }
        }

        int sum = 0;
        while(!st.isEmpty()){
            sum += st.pop();
        }
        return sum;
    }
}