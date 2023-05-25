class StackImplByDeque implements Stack {
    private Deque deque;
    StackImplByDeque(){
        this.deque = new DequeImplByDLL();
    }
    /* your codes */

    public void push(int x) {
        deque.insertFront(x);
    }

    public int pop(){
        if(empty()) return -1;
        int top = top();
        deque.removeFront();
        return top;
    } 

    public int top(){
        return deque.front();
    }

    public int size() { 
        return deque.size();
    }

    public boolean empty(){
        return deque.empty();
    }
}