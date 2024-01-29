class MyQueue {
    public int[] arr ;
    public int size=10;
    public int front=0;
    public int rear=0;

    public MyQueue() {
        this.arr=new int[size];
    }
    
    public void push(int x) {
        if(isfull()){
            return;}
        arr[rear]=x;
        rear+=1;
        
    }
    
    public int pop() {
        int p=arr[front];
        front+=1;
        return p;
    }
    
    public int peek() {
        return arr[front];
    }
    
    public boolean empty() {
        if(front==rear)
            return true;
        else
            return false;
        
    }
        public boolean isfull() {
        if(rear==size){
            return true;
        }
        else
            return false;
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */