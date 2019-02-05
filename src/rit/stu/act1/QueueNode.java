package rit.stu.act1;

import rit.cs.Queue;
import rit.cs.Node;

/**
 * A queue implementation that uses a Node to represent the structure.
 * @param <T> The type of data the queue will hold
 * @author Sean Strout @ RIT CS
 * @author Kyle McCoy   krm7269@rit.edu
 */
public class QueueNode<T> implements Queue<T> {
    private int size ;
    private Node<T> front ;
    private Node<T> back ;
    /**
     * Create an empty queue.
     */
    public QueueNode() {
        this.size = 0 ;
        this.front = null ;
        this.back = null ;
    }
    /**
    * Get the last element in the queue
     * Returns: the back element
     */
    @Override
    public T back() {
        return this.back.getData() ;
    }

    /**
     * remove and return the front element in the queue
     * @return the front element
     */
    @Override
    public T dequeue() {
        assert !empty() ;
        T removed = this.front.getData() ;
        this.front = this.front.getNext() ;
        if (this.empty()) {
            this.back = null ;
        }
        this.size-- ;
        return removed ;
    }

    /**
     * check if the queue is currently empty or not
     * @return true if empty, false otherwise
     */
    @Override
    public boolean empty() {
        return (this.size == 0) ;
    }

    /**
     * add a new element to the back of the queue
     * @param element The new data element
     */
    @Override
    public void enqueue(T element) {
        Node<T> newnode = new Node<T>(element, null) ;
        if (this.empty()) {
            this.front = newnode ;
        }else{
            this.back.setNext(newnode) ;
        }
        this.back = newnode ;
        this.size++ ;
    }

    /**
     * get the front element in the queue
     * @return the front element
     */
    @Override
    public T front() {
        assert !this.empty() ;
        return this.front.getData() ;
    }
}
