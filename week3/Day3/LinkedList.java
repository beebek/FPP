package week3.Day3;

import week3.Day3.MyStringLinkedList.Node;

public class LinkedList {
	
	// refenrence to the head node
	private Node head;
	private int listCount;
	
	// LinkedList constructor
	public LinkedList() {
		// this is an empty list, so the reference to the head node
		// is set to a new node with no data
		head = null;
	}
	
	public void add(Object data) {
		// appends the specified element to the end of this list
		if(head==null){
			head = new Node(data, null);
			head.next = null;
		}
		else {
			Node temp = new Node(data, null);
			Node lastNode = findLast();
			lastNode.next = temp;
		}
	}
	
	public void add(Object data, int index) { // replace
		// insert the specified element at the specified position in this list
		Node temp = head;
		if(head==null) {
			head = new Node(data, null);
		}
	}

	public Node findLast() {
		if (head == null)
			return null;
		else {
			Node temp = head;
			while (temp.next != null)
				temp = temp.next;
			return temp;
		}
	}

	public int findIndex(String str) {
		if (head == null)
			return 0;
		else {
			Node temp = head;
			int index = 0;
			while (temp != null)
				System.out.println(temp);
				if (str.equals(temp.data))
					return index;
				else
					temp = temp.next;
				index++;
			return -1;
		}
	}
	
	public Object get(int index) {
		// returns the element at the specified position in this list
	}
	
	public boolean remove(int index) {
		// removes the element at the specified position in this list
	}
	
	public int size() {
		// returns the number of elements in this list
	}
	
	public String toString() {
		// to display the list with all elements
		String str = "";
		Node temp = head;
		while (temp != null) {
			str = str + "-->[" + temp.data.toString() + "]";
			temp = temp.next;
		}
		str = str + "-->[" + "NULL" + "]";
		return str;
	}
	
	private class Node {
		// reference to the next node in the chain,
		// or null if there isn't one.
		Node next;
		//data carried by this node.
		//could be of any type you need.
		Object data;
		
		//Node constructor
		public Node(Object _data) {
			next = null;
			data = _data;
		}
		
		// another Node constructor if we want to 
		// specify the node to point to.
		
		public Node(Object _data, Node _next) {
			next = _next;
			data = _data;
		}
		
		// these methods should be self-explanatory
		public Object getData() {
			return data;
		}
		
		public void setData(Object _data) {
			data = _data;
		}
		
		public Node getNext() {
			return next;
		}
		
		public void setNext(Node _next) {
			next = _next;
		}
		
	}
	
	public static void main(String[] args) {
		LinkedList singleLinkList = new LinkedList();
		singleLinkList.add("Jan");
		System.out.println(singleLinkList);
		singleLinkList.add("Feb");
		System.out.println(singleLinkList);
		singleLinkList.add("March");		
		System.out.println(singleLinkList);
		
//		singleLinkList.add("add", 1);
//		System.out.println(singleLinkList.findIndex("Feb"));
	}

}
