

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;

public class Traverselnorder2 {

	public static void main(String[] args) {
		BinaryTree tree = new BinaryTree();
		tree.createTree1();    
		tree.printTree(tree.getRoot(), 0);
		System.out.println();
		System.out.println("Postorder = " + traversal(tree.getRoot()));
	}
	
	public static ArrayList<Integer> traversal(Node node) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		if (node == null) {
			return list;
		}

		Deque<Node> stack1 = new ArrayDeque<Node>();
		Deque<Node> stack2 = new ArrayDeque<Node>();

		stack1.push(node);

		while (!stack1.isEmpty()) {
			Node current = stack1.pop();
			stack2.push(current);

			if (current.left != null) {
				stack1.push(current.left);
			}
			if (current.right != null) {
				stack1.push(current.right);
			}
		}

		while (!stack2.isEmpty()) {
			list.add(stack2.pop().data);
		}

		return list;
	}
}