class MinStack {

    int[] arr;
    int top;
    int size;
    int min;

    public MinStack() {
        size = 30001;
        arr = new int[size];
        top = -1;
        min = Integer.MAX_VALUE;
    }

    private boolean isEmpty() {
        return top == -1;
    }
    
    public void push(int value) {
        top = top + 1;
        arr[top] = value;
    }
    
    public void pop() {
        if(!isEmpty()){
            top--;
        }
    }
    
    public int top() {
        if(isEmpty()){
            return -1;
        }
        return arr[top];
    }
    
    public int getMin() {
        if(isEmpty()){
            return -1;
        }
        
        // return minArr[top];
        int min = arr[0];
        for(int i=1; i<=top; i++){
            if(arr[i] < min){
                min = arr[i];
            }
        }
        return min;
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(value);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */