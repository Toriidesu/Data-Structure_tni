

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Queue;

public class TraverseBFS {

	public static void main(String[] args) {
		BinaryTree tree = new BinaryTree();
		tree.createTree1();    
		tree.printTree(tree.getRoot(), 0);
		System.out.println();
		System.out.println("BFS = " + traversal(tree.getRoot()));
	}
	
	public static ArrayList<Integer> traversal(Node node) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		if (node == null) {
			return list;
		}

		Queue<Node> queue = new ArrayDeque<Node>();
		queue.add(node);

		while (!queue.isEmpty()) {
			Node current = queue.poll();
			list.add(current.data);

			if (current.left != null) {
				queue.add(current.left);
			}
			if (current.right != null) {
				queue.add(current.right);
			}
		}

		return list;
	}
}