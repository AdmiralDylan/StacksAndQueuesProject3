package adts;

import java.util.ArrayList;

import interfaces.QueueInterface;

public class ALQueue<E> implements QueueInterface<E> {

    ArrayList<E> Reitsma = new ArrayList<>();

    @Override
    public void enqueue(E element) {
        Reitsma.add(element);
    }

    @Override
    public E dequeue() {
        return Reitsma.remove(0);
    }

    @Override
    public boolean isEmpty() {
        return Reitsma.isEmpty();
    }

    @Override
    public boolean isFull() {
        return false;
    }
    
    public String toString(){
        String a = "Front of queue : [";
        for(E b:Reitsma) {
            a = a + b + ",";
        }
        a = a + "]";

        return a;
    }

}
