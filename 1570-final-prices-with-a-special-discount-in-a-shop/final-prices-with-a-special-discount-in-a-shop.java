class Solution {
    public int[] finalPrices(int[] prices) {
        Stack<Integer> s = new Stack<>();
        
        int n = prices.length;
        int[] ans = new int[n];
        
    
        for(int i=n-1; i>=0; i--){
            
            //1 while
            while(!s.isEmpty() && prices[s.peek()] > prices[i]){
                s.pop();
            }
            
            //2 if-else
            if(s.isEmpty()){
                ans[i] = prices[i];
            }
            else{
                ans[i] = prices[i] - prices[s.peek()];
            }
            
            //3 push in stack
            s.push(i);
        }
        
        return ans;
    }
}