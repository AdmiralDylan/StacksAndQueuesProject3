package adts;

import interfaces.QueueInterface;

public class ABL2Queue<E> implements QueueInterface<E> {

    ArrayBasedList2<E> Reitsma = new ArrayBasedList2<>();

    @Override
    public void enqueue(E element) {
        Reitsma.add(element);
    }

    @Override
    public E dequeue() {
        E temp = Reitsma.get(0);
        Reitsma.removeFirst();
        return temp;
    }

    @Override
    public boolean isEmpty() {
        return Reitsma.isEmpty();
    }

    @Override
    public boolean isFull() {
        return Reitsma.size() == 4;
    }
    
    public String toString(){
        String a = "Front of queue : [";
        for(int i = 0;i<=Reitsma.size()-1;i++) {
            a = a + Reitsma.get(i) + ",";
        }
        a = a + "]";

        return a;
    }

}
