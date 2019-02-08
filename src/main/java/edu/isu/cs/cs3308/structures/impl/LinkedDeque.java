package edu.isu.cs.cs3308.structures.impl;

import edu.isu.cs.cs3308.structures.Deque;

public class LinkedDeque<E> extends LinkedQueue<E> implements Deque<E> {

	protected DoublyLinkedList<E> dequeList = new DoublyLinkedList<>();

	/**
	 * @return The value of the last element of the deque (without removing it),
	 * or null if the deque is empty.
	 */
	@Override
	public E peekLast() {
		//DEBUG
		System.out.println("last: " + dequeList.last());
		dequeList.printList();

		return (dequeList != null) ? dequeList.last() : null;
	}

	/**
	 * Inserts the given element into the front of the deque, unless the
	 * provided value is null.
	 *
	 * @param element Element to be inserted to the front of the deque, nothing
	 * happens if the value is null.
	 */
	@Override
	public void offerFirst(E element) {
		if (element != null) {
			dequeList.addFirst(element);
		}

		//DEBUG
		System.out.println("first: " + dequeList.first());
		dequeList.printList();
	}

	/**
	 * @return The value of the last item in the Deque and removes that value
	 * from the deque, if the deque was empty null is returned.
	 */
	@Override
	public E pollLast() {
		//DEBUG
		System.out.println("last: " + dequeList.last());
		dequeList.printList();

		return (dequeList.isEmpty()) ? null : dequeList.removeLast();
	}
}
