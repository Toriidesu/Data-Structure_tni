

public class BinaryTree {

	private Node root;
	public Node deleteNode;
	public Node parent;
	
	public BinaryTree() {
		root = null;
		deleteNode = null;
		parent = null;
	}
	
	public Node getRoot() {
		return root;
	}

	public void printTree(Node node, int depth) {
		if (node != null) {
			printTree(node.right, depth + 1);
			System.out.println("    ".repeat(depth) + node.data);
			printTree(node.left, depth + 1);
		}
	}
	
	public void createTree1() {
		root = new Node(1);
		root.left = new Node(2);
		root.right = new Node(3);
		root.left.left = new Node(4);
		root.left.right = new Node(5);
		root.right.left = new Node(6);
		root.right.right = new Node(7);
	}
	
	public void createTree2() {
		root = new Node(15);
		root.left = new Node(8);
		root.left.left = new Node(4);
		root.left.left.left = new Node(2);
		root.left.right = new Node(11);
		root.right = new Node(23);
		root.right.left = new Node(19);
		root.right.left.right = new Node(20);
	}
	
	public void createTree3() {
		root = new Node(50);
		root.left = new Node(10);
		root.left.left = new Node(11);
		root.left.right = new Node(12);
		root.right = new Node(22);
		root.right.right = new Node(24);
		root.right.right.left = new Node(23);
	}
	
	public void createTree4() {
		root = null;
		int[] nums = {10, 8, 15, 2, 9, 18, 14, 20, 11, 17};
		for (int i = 0; i < nums.length; i++) {
			insert(nums[i]);
		}
	}

	public void createTree5() {
		root = null;
		int[] nums = {50, 30, 70, 10, 40, 60, 20, 45, 55, 65, 25};
		for (int i = 0; i < nums.length; i++) {
			insert(nums[i]);
		}
	}

	public void createTree6() {
		root = null;
		int[] nums = {40, 20, 70, 30, 55, 85, 25, 35, 80, 32};
		for (int i = 0; i < nums.length; i++) {
			insert(nums[i]);
		}
	}

	public void insert(int new_data) {
		if (root == null) {
			root = new Node(new_data);
		} else {
			Node current_node = root;
			while (true) {
				if (new_data < current_node.data) {
					if (current_node.left == null) {
						current_node.left = new Node(new_data);
						break;
					}
					current_node = current_node.left;
				} else if (new_data > current_node.data) {
					if (current_node.right == null) {
						current_node.right = new Node(new_data);
						break;
					}
					current_node = current_node.right;
				} else {
					break;
				}
			}
		}
	}

	public void searchDeleteNode(int data) {
		deleteNode = null;
		parent = null;

		Node current = root;
		while (current != null && current.data != data) {
			parent = current;
			if (data < current.data) {
				current = current.left;
			} else {
				current = current.right;
			}
		}
		deleteNode = current;

		if (deleteNode == null) {
			System.out.println("Cannot found Node(data=[" + data + "])");
		}
	}

	public void delete(int target) {
		searchDeleteNode(target);

		if (root == null) {
			System.out.println("Empty Tree");
			return;
		}
		if (deleteNode == null) {
			return;
		}

		if (deleteNode.left == null && deleteNode.right == null) {
			if (deleteNode == root) {
				root = null;
			} else if (parent.left == deleteNode) {
				parent.left = null;
			} else {
				parent.right = null;
			}
		}
		else if (deleteNode.left != null && deleteNode.right != null) {
			Node successorParent = deleteNode;
			Node successor = deleteNode.right;

			while (successor.left != null) {
				successorParent = successor;
				successor = successor.left;
			}

			deleteNode.data = successor.data;

			if (successorParent != deleteNode) {
				successorParent.left = successor.right;
			} else {
				successorParent.right = successor.right;
			}
		}
		else {
			Node child = (deleteNode.left != null) ? deleteNode.left : deleteNode.right;

			if (deleteNode == root) {
				root = child;
			} else if (parent.left == deleteNode) {
				parent.left = child;
			} else {
				parent.right = child;
			}
		}
	}

	public Node search(int key) {
		Node current = root;
		while (current != null) {
			if (key == current.data) {
				return current;
			} else if (key < current.data) {
				current = current.left;
			} else {
				current = current.right;
			}
		}
		return null;
	}
}