package Ex;

import java.util.Collection;
import java.util.LinkedList;

public class Stack<E> {
    
    private LinkedList<E> container = new LinkedList<E>();
    
    public void push(E t) {
        container.addFirst(t);
    }
    
    public E pop() {
        return container.removeFirst();
    }
    
    public boolean empty() {
        return container.isEmpty();
    }
    
    public void pushAll(Collection<? extends E> src){
    	for(E e:src){
    		push(e);
    	}
    }
    
    public void popAll(Collection<? super E> des){
    	while(!empty()){
    		des.add(pop());		
    	}
    }
    
  
    
}
