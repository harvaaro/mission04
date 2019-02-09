package edu.isu.cs.cs3308.structures.impl;

import edu.isu.cs.cs3308.structures.RedBlueDoubleStack;

/**
 * Implements a 2 stacks in one deque, with the Red values on top, and
 * the Blue values on the bottom expanding in either direction.
 *
 * @author Aaron Harvey
 * @param <E> any type of list
 */
public class RedBlueDoubleStackImpl<E> implements RedBlueDoubleStack<E> {
	protected LinkedDeque<E> listRedBlue = new LinkedDeque<>();
	protected int redSize = 0;
	protected boolean redIsEmpty = true;
	protected int blueSize = 0;
	protected boolean blueIsEmpty = true;

	/**
	 * Adds the element to the top of the Red Stack, unless the element is null.
	 * In this case it is adding it to the beginning of the list.
	 * Will increment the size and set the isempty to false.
	 *
	 * @param element Element to add.
	 */
	@Override
	public void pushRed(E element) {
		if (element != null) {
			listRedBlue.offerFirst(element);
			if (redSize == 0) {
				redIsEmpty = false;
			}
			redSize++;
		}
	}

	/**
	 * Adds the element to the top of the Blue Stack, unless the element is null.
	 * In this case it is adding it to the ending of the list.
	 * Will increment the size and set the isempty to false.
	 *
	 * @param element Element to add.
	 */
	@Override
	public void pushBlue(E element) {
		if (element != null) {
			listRedBlue.offer(element);
			if (blueSize == 0) {
				blueIsEmpty = false;
			}
			blueSize++;
		}
	}

	/**
	 * Removes the element at the top of the Red Stack and returns its value,
	 * unless the Red Stack is empty.
	 * In this case it removes the beginning of the list.
	 * Will decrement the size and set the isempty to true.
	 *
	 * @return Element at the top of the Red Stack, or null if the Red Stack is
	 * empty
	 */
	@Override
	public E popRed() {
		if (!isRedEmpty()) {
			redSize--;
			if (redSize == 0) {
				redIsEmpty = true;
			}
			return listRedBlue.poll();
		}
		else {
			return null;
		}
	}

	/**
	 * Removes the element at the top of the Blue Stack and returns its value,
	 * unless the Blue Stack is empty.
	 * In this case it removes the ending of the list.
	 * Will decrement the size and set the isempty to true.
	 *
	 * @return Element at the top of the Red Stack, or null if the Blue Stack is
	 * empty
	 */
	@Override
	public E popBlue() {
		if (!isBlueEmpty()) {
			blueSize--;
			if (blueSize == 0) {
				blueIsEmpty = true;
			}
			return listRedBlue.pollLast();
		}
		else {
			return null;
		}
	}

	/**
	 * Returns the value at the top of the Red Stack.
	 * In this case it is the first value in the list.
	 *
	 * @return The value at the top of the Red Stack, or null if the Red Stack
	 * is emtpy
	 */
	@Override
	public E peekRed() {
		return listRedBlue.peek();
	}

	/**
	 * Returns the value at the top of the Blue Stack.
	 * In this case it is the last value in the list.
	 *
	 * @return The value at the top of the Blue Stack, or null if the Blue Stack
	 * is emtpy
	 */
	@Override
	public E peekBlue() {
		return listRedBlue.peekLast();
	}

	/**
	 * The current size of the Blue stack based on the counter
	 *
	 * @return Current size of the Blue Stack
	 */
	@Override
	public int sizeBlue() {
		return blueSize;
	}

	/**
	 * The current size of the Red stack based on the counter
	 *
	 * @return Current size of the Red Stack
	 */
	@Override
	public int sizeRed() {
		return redSize;
	}

	/**
	 * Whether the Blue stack has values based on the counter size
	 *
	 * @return True if the Blue Stack is empty, false otherwise
	 */
	@Override
	public boolean isBlueEmpty() {
		return blueIsEmpty;
	}

	/**
	 * Whether the Red stack has values based on the counter size
	 *
	 * @return True if the Red Stack is empty, false otherwise
	 */
	@Override
	public boolean isRedEmpty() {
		return redIsEmpty;
	}
}
