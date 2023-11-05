public class NewList {
    int value;
    NewList tail;
    int size;

    public NewList(){
        size = 0;
        tail = null;
    }

    public void add(int pos, int val){
        if (tail == null && pos == 1){
            NewList newTail = new NewList();
            newTail.value = val;
            newTail.size = 1;

            tail = newTail;
        }
        else if (pos == 0){
            if (size == 0){
                value = val;
            } else {
                NewList cur = new NewList();
                cur.value = value;
                cur.tail = tail;
                cur.size = size;

                value = val;
                tail = cur;
            }
        } else tail.add(pos - 1, val);
        size++;
    }

    public void remove(int pos){
       if (pos == 0){
            if (size > 1){
                value = tail.value;
                tail = tail.tail;
            }
        } else {
            tail.remove(pos - 1);
        }
        size--;
    }

    public int head(){
        return value;
    }

    public int get(int index){
        if (index == 0) return value;
        else return tail.get(index - 1);
    }

    public int length() {
        return size;
    }

    public boolean hasCycle(){
        if (tail == null) return false;
        return tail.hasCycle2(this);
    }

    public boolean hasCycle2(NewList original){
        if (tail == null) return false;
        if (tail == original) return true;
        return tail.hasCycle2(original);
    }
}