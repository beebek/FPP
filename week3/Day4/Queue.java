package week3.Day4;

import java.util.ArrayList;

public class Queue {
	ArrayList<Integer> list = new ArrayList<Integer>();
	int index;
	
	private Object[] a;
	int top;
	
	Queue(int n){
		a=new Object[n];
		top=-1;
	}
		
	public void insert(Object item) {
		if(top==a.length-1)
			System.out.println("stack is full");
		top++;
		a[top]=item;
	}

	public void remove() {
		if(top==-1)
			System.out.println("Stack is Empty");
		else {
			for(int i=0;i<top;i++)
				a[i]=a[i+1];
			top--;
		}
	}

	public boolean isEmpty() {
		if(top==-1)
			return true; // empty
		else
			return false; // not empty
	}
	
	public int size() {
		if(top==-1)
			return 0; // Stack is empty
		else
			return top+1;
	}

	public void peek() {
		if(top==-1)
			System.out.println("Stack is Empty");
		else
			System.out.println(a[top]);
	}

	public void DisplayAll() {
		for(int i=0;i<=top;i++){
			if(i<top)
				System.out.print(a[i]+ ", ");
			else 
				System.out.println(a[i]);
		}
	}

	public static void main(String[] args) {
		Queue queue=new Queue(5);
		queue.insert("Dew");
		queue.insert("Pepsi");
		queue.insert("Coke");

		System.out.println("Displaying elements...");
		queue.DisplayAll();
		
		System.out.println("\nRemoving element...");
		queue.remove();
		
		System.out.println("\nDisplaying elements...");
		queue.DisplayAll();
		
		
		System.out.println("Bool Stack Empty: " + queue.isEmpty());
		System.out.println("Size: " + queue.size());
		
		System.out.println("Peeking element...");
		queue.peek();
	}
}

// Output

/*
	Displaying elements...
	Dew, Pepsi, Coke
	
	Removing element...
	
	Displaying elements...
	Pepsi, Coke
	Bool Stack Empty: false
	Size: 2
	Peeking element...
	Coke
*/
