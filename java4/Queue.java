
public class Queue {
    private int head;
    private int tail;
    private int size;
    // java では配列もオブジェクトである
    private int[] lane;

    Queue(int x) {
        head = 0;
        tail = 0;
        size = 0;
        // サイズ x の int型 lane を生成
        lane = new int[x];
    }

    public void push(int x) {
        lane[tail] = x;
        tail++;
        size++;
    }

    public int pop() {
        int x; x = lane[head];
        head++;
        size--;
        return x;
    }

    public int size() {
        return size;
    }
}
