package week3.Day4;

public class PriorityQueue {

	Node head;
	int top;
	int a;

	public PriorityQueue() {
		head = null;
		top = -1;
	}

	public void insert(CourseSelection str) {
		if (head == null) {
			Node temp = new Node(str, null);
			head = temp;
			temp.next = null;
			a = str.ID;

		} else {

			if (str.ID < a) {
				preadd(str);
				a = str.ID;
			}

			else if (str.ID > a && str.ID < lastvalue()) {
				Node front = head;
				Node rear;
				rear = front.next;
				Node a = null;
				Node b = null;
				while (front.next != null) {
					if (str.ID > front.data.ID && str.ID < front.next.data.ID
							&& front.next != null) {
						a = front;
						b = front.next;
						break;
					}

					front = front.next;
				}

				Node temp = new Node(str, b);
				a.next = temp;

			} else {
				Node temp = head;
				while (temp.next != null) {
					temp = temp.next;
				}
				Node ab = new Node(str, null);
				temp.next = ab;
			}
		}
		top++;
	}

	int lastvalue() {
		Node temp = head;
		while (temp.next != null) {
			temp = temp.next;
		}
		int ab = temp.data.ID;
		return ab;
	}

	void postadd(CourseSelection str, int id) {

		Node temp = head;
		while (temp.next != null)
			temp = temp.next;
	}

	void preadd(CourseSelection str) {
		Node temp = new Node(str, head);
		head = temp;
	}

	public void remove() {
		head = head.next;
		top--;
	}

	@Override
	public String toString() {
		String str = "";
		Node temp = head;
		while (temp != null) {

			str += temp.data + ", ";
			temp = temp.next;
		}
		return str;
	}

	public boolean isEmpty() {
		if (top < 0)
			return true;
		return false;
	}

	public int size() {
		return top;
	}

	public CourseSelection peek() {
		return head.data;
	}

	public String DisplayAll() {
		String str = "";
		Node temp = head;
		while (temp != null) {
			str += temp.data + ", ";
			temp = temp.next;
		}
		return str;
	}
	
	public static void main(String[] args) {
		PriorityQueue std = new PriorityQueue();
		std.insert(new CourseSelection(13, "Big Data", "Harish"));
		std.insert(new CourseSelection(20, "algorithm", "Rishi"));
		std.insert(new CourseSelection(10, "WAP", "Chin"));
		std.insert(new CourseSelection(18, "Parallel programming", "Bidhan"));
		std.insert(new CourseSelection(12, "Database", "Rohan"));

		System.out.println(std.DisplayAll());
		std.remove();
		System.out.println(std.DisplayAll());
		System.out.println(std.peek());
	}
}

class Node{
	CourseSelection data;
	Node next;
	public Node(CourseSelection c, Node next) {
		this.data = c;
		this.next = next;
	}
}

class CourseSelection {
	int ID;
	String Course;
	String Student_name;
	
	CourseSelection(){
		this.ID=0;
		this.Course="";
		this.Student_name="";
	}
		
	CourseSelection(int id, String Course, String Student_name){
		this.ID=id;
		this.Course=Course;
		this.Student_name=Student_name;
	}

	public String toString(){
		return "[id: " + ID + ", course: " + Course + ", Student: " + Student_name + "]";
	}
}

// Output

/*
	[id: 10, course: WAP, Student: Chin], [id: 12, course: Database, Student: Rohan], [id: 13, course: Big Data, Student: Harish], [id: 18, course: Parallel programming, Student: Bidhan], [id: 20, course: algorithm, Student: Rishi], 
	[id: 12, course: Database, Student: Rohan], [id: 13, course: Big Data, Student: Harish], [id: 18, course: Parallel programming, Student: Bidhan], [id: 20, course: algorithm, Student: Rishi], 
	[id: 12, course: Database, Student: Rohan]
*/
