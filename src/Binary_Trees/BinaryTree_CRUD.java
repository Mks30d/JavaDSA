package Binary_Trees;

import java.util.Scanner;

public class BinaryTree_CRUD {
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
        }
    }

    static Scanner sc = new Scanner(System.in);

    // 1. -------- Binary Tree Creation --------
    private static Node createTree() {
        System.out.print("Enter data: ");
        int data = sc.nextInt();
        System.out.println();
        if (data == -1) return null;
        Node root = new Node(data);

        System.out.println("Enter left for: " + data);
        root.left = createTree();

        System.out.println("Enter right for: " + data);
        root.right = createTree();

        return root;
    }

    // 2. -------- Binary Tree Traversals --------
    public static void inOrder(Node root) {
        if (root == null) return;

        inOrder(root.left);
        System.out.print(root.data + ", ");
        inOrder(root.right);
    }

    public static void preOrder(Node root) {
        if (root == null) return;

        System.out.print(root.data + ", ");
        preOrder(root.left);
        preOrder(root.right);
    }

    public static void postOrder(Node root) {
        if (root == null) return;

        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.data + ", ");
    }

    // -------- Binary Tree Height --------
    public static int heightBT(Node root) {
        if (root == null) return 0;

        return Math.max(heightBT(root.left), heightBT(root.right)) + 1;
    }

    // -------- main function --------
    public static void main(String[] args) {

        Node root = createTree();

        System.out.println("Binary Tree height: " + heightBT(root));

        System.out.println("\nInOrder Traversal: ");
        inOrder(root);
        System.out.println("\nPreOrder Traversal: ");
        preOrder(root);
        System.out.println("\nPostOrder Traversal: ");
        postOrder(root);
    }
}


















