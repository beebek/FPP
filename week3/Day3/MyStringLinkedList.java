package week3.Day3;

public class MyStringLinkedList {
	Node header;

	MyStringLinkedList() {
		header = null;
	}

	public void addFront(String item) {
		if (header == null)
			header = new Node(null, item, null);
		else {
			Node n = new Node(null, item, header);
			header.previous = n;
			header = n;
		}
	}

	public void addLast(String item) {
		Node lastNode;
		if(header==null)
			lastNode = new Node(null, item, null);
		else
			lastNode = findLast();
			Node newNode = new Node(lastNode, item, null);
			lastNode.next = newNode;
	}

	// implement the code
	public void postAddNode(Node n, String value) {
		if(header==null) {
			header = new Node(null, value, null);
		}
		else if(n.next==null)
			addLast(value);
		else {
			Node newNode = new Node(n, value, null);
			newNode.next = n.next;
			n.next = newNode;
		}

	}

	// implement the code

	public int Size() {
		int size = 0;
		Node temp = header;
		while(temp.next!=null) {
			temp = temp.next;
			size++;
		}
		return size+1;
	}

	// implement code
	public boolean isEmpty() {
		if(header.next==null)
			return true;
		return false;
	}
	
	public Object getFirst() {
		return header;
	}
	
	public Object getLast() {
		Node temp=header;
		while(temp.next!=null)
			temp = temp.next;
		return temp;
	}
	
	public void removeFirst(){
		header = header.next;
		header.previous = null;
	}
	
	public void removeLast() {
		Node last = (Node)getLast();
		Node secondLast = last.previous;
		secondLast.next = null;
		
	}

	public void preAddNode(Node n, String value) {
		Node newNode;
		if (n == null) {
			// List is empty
			newNode = new Node(null, value, null);
		} else if (n.previous == null) {
			// n is the first node
			addFront(value);
		} else {
			newNode = new Node(n.previous, value, n);
			n.previous.next = newNode;
			n.previous = newNode;
		}

	}

	public Node findLast() {
		if (header == null)
			return null;
		else {
			Node temp = header;
			while (temp.next != null)
				temp = temp.next;
			return temp;
		}
	}

	public Node findItem(String str) {
		if (header == null)
			return null;
		else {
			Node temp = header;
			while (temp != null)
				if (str.equals(temp.value))
					return temp;
				else
					temp = temp.next;
			return null;
		}
	}

	public void deleteNode(Node n) {
		if (header != null && n != null) {
			if (n.next == null && n.previous == null) {
				// only one node
				header = null;
				n = null;
				System.out.println("I am here 1");

			} else if (n.previous == null) {
				// remove first node
				n.next.previous = null;
				header = n.next;
				n = null;
				System.out.println("I am here 2");
			} else if (n.next == null) {
				// remove last node
				n.previous.next = null;
				n = null;
				System.out.println("I am here 3");
			} else {
				// general case
				n.next.previous = n.previous;
				n.previous.next = n.next;
				n = null;
				System.out.println("I am here 4");
			}
		}
	}

	public void deleteList() {
		Node tempOne = header;
		Node tempTwo = header;
		while (tempOne != null) {
			tempOne = tempOne.next;
			tempTwo = null;
			tempTwo = tempOne;
		}
		header = null;
	}

	public String toString() {
		String str = "";
		Node temp = header;
		while (temp != null) {
			str = str + "-->[" + temp.value.toString() + "]";
			temp = temp.next;
		}
		str = str + "-->[" + "NULL" + "]";
		return str;
	}

	public void printReverse() {
		String str = "";
		Node temp = findLast();
		while (temp != null) {
			str = str + "==>[" + temp.value.toString() + "]";
			temp = temp.previous;
		}
		str = str + "==>[" + "NULL" + "]";
		System.out.println(str);
	}

	
// ****************************
// ********* Class NOde ******* 
// ****************************
	public class Node {
		String value;
		Node next;
		Node previous;

		Node(Node previous, String value, Node next) {
			this.previous = previous;
			this.value = value;
			this.next = next;
		}

		public String toString() {
			return value;
		}
	}
// ****************************

	public static void main(String[] args) {
		MyStringLinkedList mySL = new MyStringLinkedList();
		System.out.println(mySL);
		mySL.addFront("Carrot Cake");
		System.out.println(mySL);
		mySL.addFront("Blueberry Muffin");
		System.out.println(mySL);
		mySL.addFront("Apple Pie");
		System.out.println(mySL);
		mySL.addLast("Macron Cookies");
		System.out.println(mySL);
		
		Node existingNode = mySL.findItem("Apple Pie");
		mySL.postAddNode(existingNode, "Pizza");
		System.out.println(mySL);
		
		System.out.println("Size: " + mySL.Size());
		
		System.out.println("Is empty: " + mySL.isEmpty());
		
		System.out.println("First: " + mySL.getFirst());
		System.out.println("Last: " + mySL.getLast());
		
		System.out.println("Removing first...");
		mySL.removeFirst();
		System.out.println(mySL);
		
		System.out.println("Removing last...");
		mySL.removeLast();
		System.out.println(mySL);
	}
}

// Output

/*
	-->[NULL]
	-->[Carrot Cake]-->[NULL]
	-->[Blueberry Muffin]-->[Carrot Cake]-->[NULL]
	-->[Apple Pie]-->[Blueberry Muffin]-->[Carrot Cake]-->[NULL]
	inside addlast: Carrot Cake
	-->[Apple Pie]-->[Blueberry Muffin]-->[Carrot Cake]-->[Macron Cookies]-->[NULL]
	-->[Apple Pie]-->[Pizza]-->[Blueberry Muffin]-->[Carrot Cake]-->[Macron Cookies]-->[NULL]
	Size: 5
	Is empty: false
	First: Apple Pie
	Last: Macron Cookies
	Removing first...
	-->[Pizza]-->[Blueberry Muffin]-->[Carrot Cake]-->[Macron Cookies]-->[NULL]
	Removing last...
	-->[Pizza]-->[Blueberry Muffin]-->[Carrot Cake]-->[NULL]
*/
