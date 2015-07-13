package week3.Day5;

// Demo code for the user implemenation of Binary search tree
public class MyBST {
	/** The tree root. */
	private BinaryNode root;
	private int count;

	public MyBST() {
		root = null;
	}

	/**
	 * Prints the values in the nodes of the tree in sorted order. Inorder
	 * Traversal
	 */
	public void printTree() {
		if (root == null)
			System.out.println("Empty tree");
		else
			printTree(root);
	}

	// Inorder Traversal to print the nodes in Ascending order
	private void printTree(BinaryNode t) {
		if (t != null) {
			printTree(t.left);
			System.out.print(t.element + ",");
			printTree(t.right);
		}
	}

	// Assume the data in the Node is an Integer.
	public void insert(Integer x) {
		if (root == null) {
			root = new BinaryNode(x);
			// count++;
			return;
		} else {
			BinaryNode n = root;
			boolean inserted = false;

			while (!inserted)// true
			{
				if (x.compareTo(n.element) < 0) {
					// space found on the left
					if (n.left == null) {
						n.left = new BinaryNode(x, null, null);
						count++;
						inserted = true;
					}
					// keep looking for a place to insert (a null)
					else
						n = n.left;
				} 
				else if (x.compareTo(n.element) > 0) {
					// space found on the right
					if (n.right == null) {
						n.right = new BinaryNode(x, null, null);
						count++;
						inserted = true;
					}
					// keep looking for a place to insert (a null)
					else 
						n = n.right;
				}
				// if a node already exists
				else {
					count++;
					inserted = true;
				}
			}
		}
	}

	private void preOrder(BinaryNode t) {
		if (t != null) {
			System.out.print(t.element + ",");
			preOrder(t.left);
			preOrder(t.right);
		}
	}

	private void postOrder(BinaryNode t) {
		if (t != null) {
			postOrder(t.left);
			postOrder(t.right);
			System.out.print(t.element + ",");
		}
	}

	public boolean contains(int key) {
		boolean found = false;
		while ((root != null) && !found) {
			int rval = root.element;
			if (key < rval)
				root = root.left;
			else if (key > rval)
				root = root.right;
			else {
				found = true;
				break;
			}
			found = contains(key);
		}
		return found;
	}

	public BinaryNode getRoot() {
		return root;
	}

	public void leafNodes(BinaryNode t) {
		if (root != null) {
			leafNodes(root.left);
			leafNodes(root.right);
		}
		if (root.left == null && root.right == null) {
			System.out.println(root.element);
		}
	}

	public int Maximum(BinaryNode t) {
		if (t.right == null) {
			return t.element;
		} else {
			return Maximum(t.right);
		}
	}

	public int Minimum(BinaryNode t) {
		if (t.left == null) {
			return t.element;
		} else {
			return Minimum(t.left);
		}
	}

	public int size() {
		return count;
	}

	private class BinaryNode {

		private Integer element;// The data in the node
		private BinaryNode left; // Left child
		private BinaryNode right; // Right child

		// Constructors
		BinaryNode(Integer theElement) {
			this(theElement, null, null);
		}

		BinaryNode(Integer element, BinaryNode left, BinaryNode right) {
			this.element = element;
			this.left = left;
			this.right = right;
		}
	}

	public static void main(String[] args) {
		MyBST mybst = new MyBST();
		int[] a = { 15, 12, 9, 56, 1, 16, 19, 22, 3, 100, 2, 25, 77 };
		for (int j = 0; j < a.length; j++) {
			mybst.insert(a[j]);
		}
		mybst.insert(12);

		System.out.println("Inorder travesal: ");
		mybst.printTree();

		System.out.println();
		System.out.println("Postorder: ");
		mybst.postOrder(mybst.root);

		System.out.println();
		System.out.println("PreOrder: ");
		mybst.preOrder(mybst.root);

		System.out.println();
		System.out.println("Maximum value: " + mybst.Maximum(mybst.root));
		System.out.println("Minimum value: " + mybst.Minimum(mybst.root));
		System.out.println("Size of array: " + mybst.size());
	}
}

// Output

/*
	Inorder travesal: 
	1,2,3,9,12,15,16,19,22,25,56,77,100,
	Postorder: 
	2,3,1,9,12,25,22,19,16,77,100,56,15,
	PreOrder: 
	15,12,9,1,3,2,56,16,19,22,25,100,77,
	Maximum value: 100
	Minimum value: 1
	Size of array: 13
*/

