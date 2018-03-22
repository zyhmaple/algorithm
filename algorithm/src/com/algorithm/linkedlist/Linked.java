package com.algorithm.linkedlist;

public class Linked<E> {
	

	transient Node<E> first;
	
	transient Node<E> last;
	
	transient int size;
	
	private static class Node<E>{
		E item;
		Node<E> next;
	
		Node(E element,Node<E> next){
			this.item = element;
			this.next = next;
		}
	}
	
	public void linkFirst(E e) {
		final Node<E> f = first;
		final Node<E> newNode = new Node<E>(e,f);
		first = newNode;
		if(f == null)
			last = newNode;
		else{
			newNode.next = f;
		}
		size++;
	}
	public void linkLast(E e) {
		final Node<E> l = last;
		final Node<E> newNode = new Node<E>(e,null);
		last = newNode;
		if(l == null){
			first = newNode;		
		}
		else {
			l.next = newNode;
		}
	
		size++;
	}
    
    public E get(int index) {
        checkElementIndex(index);
        return node(index).item;
    }
	
    private void checkElementIndex(int index) {
        if (!isElementIndex(index))
            throw new IndexOutOfBoundsException(outOfBoundsMsg(index));
    }
    private String outOfBoundsMsg(int index) {
        return "Index: "+index+", Size: "+size;
    }
    
    private boolean isElementIndex(int index) {
        return index >= 0 && index < size;
    }
    
    Node<E> node(int index) {
        // assert isElementIndex(index);

            Node<E> x = first;
            for (int i = 0; i < index; i++)
                x = x.next;
            return x;


    }
	public void reverse(){
		Node<E> h = first;
		final Node<E> t = first;
		Node<E> c = null;
		for(int i=0;i<this.size-1;i++)
		{	
			c = t.next;
			t.next = c.next;
			c.next = h;
			h = c;
		}
		first = h;
	}
	
	
	public int size(){
		return this.size;
	}
}
