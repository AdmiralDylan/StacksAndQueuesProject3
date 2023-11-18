package adts;

import interfaces.ListInterface;


public class ArrayBasedList2<E> implements ListInterface<E> {

	protected E[] list;               // array to hold this list’s elements

	protected int numElements = 0;    // number of elements in this list

	protected final int DEFAULT_CAPACITY = 4; // default capacity

	// set by find method
	protected boolean found;  // true if element found, otherwise false
	protected int location;   // indicates location of element when found is true
	
	public ArrayBasedList2() {
		list = (E[]) new Object[DEFAULT_CAPACITY];
	}

	@Override
	public void add(E element) {
		list[numElements] = element;
		numElements++;
	}
	
	protected void find(E target)
	// helper method
	// look for the first item on the list such that item.equals(target) is true
	// if match found set instance variables as follows:
	//    set found to true
	//    set location to the array index for item
	// if no match, set found to false
	{
	    found = false;
	    location = 0;

	    while (location < numElements) {
	        if (list[location].equals(target)) {
	        	found = true;
	        	return;
	        }
	        else {
	        	location++;
	        }
	    }
	}

    
    /**/
    @Override
	// remove and shift the other elements
	public boolean remove(E element) {
		find(element);
		if (found) {
			for (int i = location; i < numElements - 1; i++) {
				list[i] = list[i+1];
			}
			list[numElements - 1] = null;
			numElements--;
		}
		return found;
	}

	/**/
    
    public void removeFirst() {
    	if (numElements > 0) {
    		for (int i = 0; i < numElements - 1; i++) {
				list[i] = list[i+1];
    		}
			list[numElements - 1] = null;
			numElements--;
    	}
    }
    
    public void removeLast() {
    	if (numElements > 0) {
			list[numElements - 1] = null;
			numElements--;
    	}
    }
 
	@Override
	public int size() { 
	    return numElements;
	}


	@Override
	public boolean isEmpty() { 
		return numElements == 0;
	}

    
    @Override
	public boolean contains (E element) {
	    find(element);
	    return found;
	}
    
    
    @Override
	public E get(E element) {
	    find(element);    
	    if (found) {
	      return list[location];
	    }
	    else {
	      return null;
	    }
	}
	  
    @Override
	public E get(int index) {
    	if (index < 0 || index > numElements - 1) {
    		return null;
    	}
    	else {
    		return list[index];
    	}
	}
    
}
