package adts;
import interfaces.StackInterface;

public class ABL2Stack<E> implements StackInterface<E> {

    ArrayBasedList2<E> Reitsma = new ArrayBasedList2<>();

    @Override
    public void push(E element) {
        Reitsma.add(element);
    }

    @Override
    public E pop() {
        E temp = Reitsma.get(Reitsma.size()-1);
        Reitsma.removeLast();
        return temp;
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
        return Reitsma.size() == 4;
    }

    @Override
    public String toString(){
        
        String stackString = "--------\n From the Top \n ----------";

        for(int i = Reitsma.size()-1; i >= 0; i--){
            stackString = stackString + "\n" + Reitsma.get(i);
        }

        return stackString + "\n------------";
    }
    
}
