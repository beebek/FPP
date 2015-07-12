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
		if(head==null) {
			head = new Node(data, null);
		}
		else {
			Node workingNode = findNodeByIndex(index);
			workingNode.data = (String)data;
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
			while (temp != null) {
				if (str.equals(temp.data))
					return index;
				temp = temp.next;
				index++;
			}
			return -1;
		}
	}
	
	public Node findNodeByIndex(int index) {
		if (head == null)
			return head;
		else {
			Node temp = head;
			int indexOfList = 0;
			while (temp != null) {
				indexOfList++;
				if(index==indexOfList) {
					return temp;
				}
				temp = temp.next;
			}
			return null;
		}
	}
	
	public Object get(int index) {
		// returns the element at the specified position in this list
		return findNodeByIndex(index);
	}
	
	public boolean remove(int index) {
		// removes the element at the specified position in this list
		if(head==null)
			return false;
		
		Node prevNodeObj;
		if(index==0){
			Node temp = findNodeByIndex(1);
			System.out.println("********");
			System.out.println(temp.data);
			System.out.println("********");
			
			head = temp;
			head.next = temp;
		}
		else {
			prevNodeObj = findNodeByIndex(index);
			prevNodeObj.next = prevNodeObj.next.next;
		}
		
		System.out.println("Node [" + findNodeByIndex(index).data + "] removed...");
		return true;
	}
	
	public int size() {
		// returns the number of elements in this list
		Node temp = head;
		int counter = 0;
		while(temp!=null) {
			temp = temp.next;
			counter++;
		}
		return counter;
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
		singleLinkList.add("April");		
		System.out.println(singleLinkList);
		
		singleLinkList.add("Feb_renamed", 1);
		System.out.println(singleLinkList);
		
		System.out.println("Object at position 2: " + singleLinkList.get(2));
		
		System.out.println("Removing 3rd index element...");
		System.out.println(singleLinkList.remove(3));
		System.out.println(singleLinkList);
//		System.out.println("Removing 0the index element...");
//		System.out.println(singleLinkList.remove(0));
//		System.out.println(singleLinkList);
		
		System.out.println("Size of list: " + singleLinkList.size());
		System.out.println("Bye !!!");
	}
}

// Output

/*
	-->[Jan]-->[NULL]
	-->[Jan]-->[Feb]-->[NULL]
	-->[Jan]-->[Feb]-->[March]-->[NULL]
	-->[Jan]-->[Feb]-->[March]-->[April]-->[NULL]
	-->[Feb_renamed]-->[Feb]-->[March]-->[April]-->[NULL]
	Object at position 2: week3.Day3.LinkedList$Node@15db9742
	Removing 3rd index element...
	Node [March] removed...
	true
	-->[Feb_renamed]-->[Feb]-->[March]-->[NULL]
	Size of list: 3
	Bye !!!
*/
