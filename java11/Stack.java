
class Stack {
    private int top;
    private int[] arraylist;
    private int maxSize;
    public Stack(int x){
        top = 0;
        maxSize = x;
        arraylist = new int[x];
    }
    
    public boolean isEmpty(){
        if(top==0)return true;
        else return false;
    }

    public void push(int u) throws StackOverflowException {
        if (top == maxSize) throw new StackOverflowException("Overflow. " + u + " cannot be pushed.");
        arraylist[top]=u;
        top++;
        
    }

    public int pop() throws StackUnderflowException {
        if(top==0) throw new StackUnderflowException("Underflow. There is no element in the stack.");
        return arraylist[--top];
    }
}