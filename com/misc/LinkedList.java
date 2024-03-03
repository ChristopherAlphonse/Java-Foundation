package com.misc;

import java.util.logging.Level;
import java.util.logging.Logger;

public class LinkedList {
	private static final Logger LOGGER =
			Logger.getLogger(LinkedList.class.getName());

	private Node head;
	private Node tail;
	private int length;

	static class Node {
		int data;
		Node next;

		Node(int data) {
			this.data = data;
			this.next = null;
		}
	}

	public LinkedList(int d) {
		Node newNodeObject = new Node(d);
		head = newNodeObject;
		tail = newNodeObject;
		length = 1;
	}

	public void printList() {
		Node temp = head;
		while (temp != null) {
			LOGGER.log(Level.FINE, String.valueOf(temp.data));
			temp = temp.next;
		}
	}

<<<<<<< HEAD
	public void getHeadNode() {
		LOGGER.log(Level.FINE, String.valueOf(head.data));
	}

	public void getTailNode() {
		LOGGER.log(Level.FINE, String.valueOf(tail.data));
	}

	public void getLengthOfNode() {
		LOGGER.log(Level.FINE, String.valueOf(length));
=======
	public void peekHead() {
		System.out.println(head.data);
	}

	public void peekTail() {
		System.out.println(tail.data);
	}

	public void getLength() {
		System.out.println(length);
>>>>>>> 961a7b1d875127f58b05c4da75ce8462c718b092
	}

	public void append(int data) {
		Node newNodeData = new Node(data);

		if (length == 0) {
			head = newNodeData;
			tail = newNodeData;
		} else {
			tail.next = newNodeData;
			tail = newNodeData;
		}
		length++;
	}

	public void prepend(int data) {
		Node newNode = new Node(data);
		if (length == 0) {
			head = newNode;
			tail = newNode;
		} else {
			newNode.next = head;
			head = newNode;
		}
		length++;
	}

	public Node removeFirst() {
<<<<<<< HEAD
		if (length == 0)
			return null;
=======


		if (length == 0)
			return null;

>>>>>>> 961a7b1d875127f58b05c4da75ce8462c718b092
		Node temp = head;
		head = head.next;
		temp.next = null;
		length--;
		if (length == 0) {
			tail = null;
		}
<<<<<<< HEAD
		return temp;
=======

		return temp;


>>>>>>> 961a7b1d875127f58b05c4da75ce8462c718b092
	}

	public Node removeLast() {
		if (length == 0)
			return null;
		Node temp = head;
		Node placeHolder = head;

		while (temp.next != null) {
			placeHolder = temp;
			temp = temp.next;
		}
		tail = placeHolder;
		tail.next = null;
		length--;

		if (length == 0) {
			tail = null;
			head = null;
		}

		return temp;
	}

<<<<<<< HEAD
	public Node find(int data) {
		Node current = head;
		while (current != null) {
			if (current.data == data) {
				return current;
			}
			current = current.next;
		}
		return null;
	}

	public Node remove(int data) {
		if (head == null) {
			return null;
		}
		if (head.data == data) {
			head = head.next;
			return head;
		}
		Node current = head;
		while (current.next != null) {
			if (current.next.data == data) {
				current.next = current.next.next;
				return head;
			}
			current = current.next;
		}
		return head;
=======

	public Node fecthIndex(int index) {
		if (index < 0 || index >= length) {
			return null;

			
		}
>>>>>>> 961a7b1d875127f58b05c4da75ce8462c718b092
	}

	public static void main(String[] args) {
		LinkedList myLinkedList = new LinkedList(1);
		myLinkedList.peekTail();
		myLinkedList.append(12);
		myLinkedList.append(13);
		myLinkedList.prepend(1);
<<<<<<< HEAD
=======


		System.out.println("The length : ");
		myLinkedList.getLength();

>>>>>>> 961a7b1d875127f58b05c4da75ce8462c718b092
	}
}
