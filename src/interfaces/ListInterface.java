package interfaces;

public interface ListInterface<E> {

	  void add(E element);
	  
	  boolean remove (E element);
	  // remove the first item on the list such that item.equals(element) is true
	  // if no such item exists, return false
	  // note: if there are more than one, just remove the first one that is found
	  
	  int size();   // return the number of items on this list

	  boolean isEmpty();

	  boolean contains (E element);
	  // return true if there is an item on the list such that item.equals(element) is true
	  // otherwise return false
	    
	  E get(E element);
	  // return the first item on the list such that item.equals(element) is true
	  // if no such item exists, return null
	  
	  E get(int index);
	  // return the item at the specified position on the list
	  // the first item is at index equal to zero
	  // return null if index value is out of bounds
	  

}
