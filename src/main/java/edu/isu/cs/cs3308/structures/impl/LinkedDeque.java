package edu.isu.cs.cs3308.structures.impl;

import edu.isu.cs.cs3308.structures.Deque;

public class LinkedDeque<E> extends LinkedQueue<E> implements Deque<E> {

	/**
	 * @return The value of the last element of the deque (without removing it),
	 * or null if the deque is empty.
	 */
	public E peekLast() {
		return null;
	}

	/**
	 * Inserts the given element into the front of the deque, unless the
	 * provided value is null.
	 *
	 * @param element Element to be inserted to the front of the deque, nothing
	 * happens if the value is null.
	 */
	public void offerFirst(E element){

	}

	/**
	 * @return The value of the last item in the Deque and removes that value
	 * from the deque, if the deque was empty null is returned.
	 */
	public E pollLast(){
		return null;
	}
}
