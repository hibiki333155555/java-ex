
class SimpleNode {
    private int key;
    private SimpleNode prev;
    private SimpleNode next;

    SimpleNode(int key) {
        this.key = key;
    }

    int getKey() {
        return this.key;
    }

    SimpleNode getNext() {
        return this.next;
    }

    SimpleNode getPrev() {
        return this.prev;
    }

    void setNext(SimpleNode node) {
        this.next = node;
    }

    void setPrev(SimpleNode node) {
        this.prev = node;
    }
    
}

