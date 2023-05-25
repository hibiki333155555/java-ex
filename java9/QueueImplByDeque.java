
public class QueueImplByDeque implements Queue{
    private Deque deque;
    QueueImplByDeque(){
        this.deque = new DequeImplByDLL();
    }
    /* your codes */

    public void enqueue(int key){
        deque.insertBack(key);
    }

    public int dequeue() {
        if(empty()) return -1;
        int front = front();
        deque.removeFront();
        return front;
    }

    public int front() {
        return deque.front();
    }

    public int size() {
        return deque.size();
    }

    public boolean empty() {
        return deque.empty();
    }
}
