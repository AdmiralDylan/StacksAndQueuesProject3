package adts;

import java.util.ArrayList;
import interfaces.StackInterface;

public class ALStack<E> implements StackInterface<E> {

    ArrayList<E> Reitsma = new ArrayList<>();
    
    @Override
    public void push(E element) {
        Reitsma.add(element);
    }

    @Override
    public E pop() {
        return Reitsma.remove(Reitsma.size()-1);
    }

    @Override
    public E peek() {
        return Reitsma.get(Reitsma.size()-1);
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
        
        String stackString = "---------\n From the Top \n ----------";

        for(int i = Reitsma.size()-1; i >= 0; i--){
            stackString = stackString + "\n" + Reitsma.get(i);
        }

        return stackString + "\n----------";
    }

}
