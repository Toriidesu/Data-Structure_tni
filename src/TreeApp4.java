

import java.util.Scanner;

public class TreeApp4 {

	public static void main(String[] args) {
		BinaryTree tree = new BinaryTree();
		tree.createTree6();

		System.out.println("Binary Tree from createTree6():");
		tree.printTree(tree.getRoot(), 0);
		System.out.println();

		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter data to search (N): ");
		int n = scanner.nextInt();

		Node target = tree.search(n);

		if (target == null) {
			System.out.println("Cannot found Node(data=[" + n + "])");
		} else {
			if (target.left != null) {
				System.out.println("Left Child = " + target.left.data);
			} else {
				System.out.println("No Left Child");
			}

			if (target.right != null) {
				System.out.println("Right Child = " + target.right.data);
			} else {
				System.out.println("No Right Child");
			}

			if (target.left == null && target.right == null) {
				System.out.println("[" + n + "] is Leaf Node");
			} else {
				System.out.println("[" + n + "] is not Leaf Node");
			}
		}

		scanner.close();
	}
}