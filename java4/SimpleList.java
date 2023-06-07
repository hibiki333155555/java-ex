package java4;
class SimpleList {
    private SimpleNode head;

    SimpleList() {
        init();
    }

    void init() {
        head = null;
    }

    SimpleNode listSearch(int key) {
        SimpleNode current = head;
        // 線形探索 o(n) 
        while (current.getKey() != key) {
            current = current.getNext();
        }
        return current;
    }

    void printList() {
        SimpleNode current = head;
        while (current != null) {
            System.out.print(current.getKey() + " ");
            current = current.getNext();
        }
        System.out.println();
    }

    void delete(int key) {
        SimpleNode del = listSearch(key);

        // del が head のとき
        if(del == head) head = del.getNext();

        // del の next が null の場合も下の操作でうまくいく
        // del の next の prev を del の prev に
        if(del.getNext() != null) del.getNext().setPrev(del.getPrev());
        // del の prev の next を del の next に
        if(del.getPrev() != null) del.getPrev().setNext(del.getNext());
    }

    void insert(int key) {
        SimpleNode new_node = new SimpleNode(key);

        // head に新しい node を挿入する
        new_node.setNext(head);
        new_node.setPrev(null);
        
        // 最初の insert なら head は null なのでこの操作はいらない
        if(head != null) head.setPrev(new_node);

        head = new_node;
    }
}
