
class Queue implements OpenList{
    int top, tail;

    public Queue(){
        top=0;
        tail=0;
    }

    public boolean isEmpty(){
        if(top==tail)return true;
        else return false;
    }

    public void push(int u){
        arraylist[top]=u;
        top++;   
    }

    public int pop(){
        tail++;
        return arraylist[tail-1];
    }
}