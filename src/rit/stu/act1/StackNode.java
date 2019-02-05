package rit.stu.act1;

import rit.cs.Stack;
import rit.cs.Node;

/**
 * A stack implementation that uses a Node to represent the structure.
 * @param <T> The type of data the stack will hold
 * @author Sean Strout @ RIT CS
 * @author Kyle McCoy   krm7269@rit.edu
 */
public class StackNode<T> implements Stack<T> {
    private int size ;
    private Node<T> top ;
    /**
     * Create an empty stack.
     */
    public StackNode() {
        this.size = 0 ;
        this.top = null ;
    }

    /**
     * check if the stack is currently empty or not
     * @return true if empty, false otherwise
     */
    @Override
    public boolean empty() {
        return size == 0 ;
    }

    /**
     * remove and return the top element in the stack
     * @return the front element
     */
    @Override
    public T pop() {
        assert !this.empty() ;
        T popped = this.top.getData() ;
        this.top = this.top.getNext() ;
        this.size-- ;
        return popped ;
    }

    /**
     * add a new element to the top of the stack
     * @param element The new data element
     */
    @Override
    public void push(T element) {
        this.top = new Node<T>(element, this.top) ;
        this.size++ ;
    }

    /**
     * get the top element of the stack
     * @return the top element
     */
    @Override
    public T top() {
        assert !this.empty() ;
        return this.top.getData() ;
    }
}
