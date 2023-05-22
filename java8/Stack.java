
class Stack implements OpenList{
    int top;
    public Stack(){
        top=0;
    }
    
    public boolean isEmpty(){
        if(top==0)return true;
        else return false;
    }

    public void push(int u){
        arraylist[top]=u;
        top++;
    }

    public int pop(){
        return arraylist[--top];
    }
}