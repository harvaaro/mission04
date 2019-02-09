package edu.isu.cs.cs3308.structures.impl;

import edu.isu.cs.cs3308.structures.Deque;

/**
 * A class to implement a Linked Deque which is an extended Linked Queue
 *
 * @author Aaron Harvey
 * @param <E> any type of list
 */
public class LinkedDeque<E> extends LinkedQueue<E> implements Deque<E> {

	/**
	 * Will return the value of the last value in the list, without removing it
	 *
	 * @return The value of the last element of the deque (without removing it),
	 * or null if the deque is empty.
	 */
	@Override
	public E peekLast() {
		return (theList != null) ? theList.last() : null;
	}

	/**
	 * Adds the provided non null value to the end of the list
	 *
	 * @param element Element to be inserted to the front of the deque, nothing
	 * happens if the value is null.
	 */
	@Override
	public void offerFirst(E element) {
		if (element != null) {
			theList.addFirst(element);
		}
	}

	/**
	 * Will remove the value at the end of the list
	 *
	 * @return The value of the last item in the Deque and removes that value
	 * from the deque, if the deque was empty null is returned.
	 */
	@Override
	public E pollLast() {
		return (theList.isEmpty()) ? null : theList.removeLast();
	}
}
