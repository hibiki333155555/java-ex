class SimpleList implements Aggregate{
    private SimpleNode nil;

    public SimpleList(){
        this.nil = new SimpleNode(0);
        this.nil.setPrev(nil);
        this.nil.setNext(nil);
    }

    public void insert(int key){
        SimpleNode newNode = new SimpleNode(key);
        nil.getNext().setPrev(newNode);
        newNode.setNext(nil.getNext());
        nil.setNext(newNode);
        newNode.setPrev(nil);
    }
    
    public void delete(int key){
        SimpleNode node = nil.getNext();
        while(node!=nil){
            if(node.getKey()==key){
                node.getPrev().setNext(node.getNext());
                node.getNext().setPrev(node.getPrev());

            }
            node=node.getNext();
        }
    }
    
    public SimpleNode getNil(){
        return nil;
    }

    public Iterator forwardIterator(){
    return new SimpleListForwardIterator(this);
    }

    public Iterator backwardIterator(){
    return new SimpleListBackwardIterator(this);
    }

}