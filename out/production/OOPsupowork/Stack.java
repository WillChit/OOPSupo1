public class Stack {
    NewList head;

    public Stack(){
        head = new NewList();
    }

    public void push(int value){
        head.add(0, value);
    }

    public int pop(){
        int res = head.value;
        head.remove(0);
        return res;
    }

    public int top(){
        return head.value;
    }

    public boolean empty(){
        return (head.size == 0);
    }
}
