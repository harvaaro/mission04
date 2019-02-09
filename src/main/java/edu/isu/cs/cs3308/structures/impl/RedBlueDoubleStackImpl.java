package edu.isu.cs.cs3308.structures.impl;

import edu.isu.cs.cs3308.structures.RedBlueDoubleStack;

public class RedBlueDoubleStackImpl<E> implements RedBlueDoubleStack<E> {

	// Red is top and Blue is bottom
	protected LinkedDeque<E> listRedBlue = new LinkedDeque<>();
	protected int redSize = 0;
	protected boolean redIsEmpty = true;
	protected int blueSize = 0;
	protected boolean blueIsEmpty = true;

	/**
	 * Adds the element to the top of the Red Stack, unless the element is null.
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
	 * Adds the element to the top of the Blue Stack, unless the element is
	 * null.
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
	 *
	 * @return The value at the top of the Blue Stack, or null if the Blue Stack
	 * is emtpy
	 */
	@Override
	public E peekBlue() {
		return listRedBlue.peekLast();
	}

	/**
	 * @return Current size of the Blue Stack
	 */
	@Override
	public int sizeBlue() {
		return blueSize;
	}

	/**
	 * @return Current size of the Red Stack
	 */
	@Override
	public int sizeRed() {
		return redSize;
	}

	/**
	 * @return True if the Blue Stack is empty, false otherwise
	 */
	@Override
	public boolean isBlueEmpty() {
		return blueIsEmpty;
	}

	/**
	 * @return True if the Red Stack is empty, false otherwise
	 */
	@Override
	public boolean isRedEmpty() {
		return redIsEmpty;
	}
}
