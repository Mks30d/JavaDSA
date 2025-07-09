package Binary_Trees;

import java.util.LinkedList;
import java.util.Queue;
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
        if (data == -1)
            return null;
        Node root = new Node(data);

        System.out.println("Enter left for: " + data);
        root.left = createTree();

        System.out.println("Enter right for: " + data);
        root.right = createTree();

        return root;
    }

    // 2. -------- Binary Tree Traversals (DFS) --------
    public static void inOrder(Node root) {
        if (root == null)
            return;

        inOrder(root.left);
        System.out.print(root.data + ", ");
        inOrder(root.right);
    }

    public static void preOrder(Node root) {
        if (root == null)
            return;

        System.out.print(root.data + ", ");
        preOrder(root.left);
        preOrder(root.right);
    }

    public static void postOrder(Node root) {
        if (root == null)
            return;

        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.data + ", ");
    }


    // -------- Binary Tree Level Order Traversal (BFS) --------
    // -------- method-1 (Using loop and recursion), TC-O(n*n) --------
    public static void printCurrentLevel(Node root, int level) {
        if (root == null)
            return;
        if (level == 1)
            System.out.print(root.data + " ");

        if (level > 1) {
            printCurrentLevel(root.left, level - 1);
            printCurrentLevel(root.right, level - 1);
        }
    }

    // -------- method-2 (using queue), TC-O(n), SC-O(n) --------
    static Queue<Node> queue = new LinkedList<>();

    public static void BFS_Queue(Node root) {
        queue.add(root);
//        queue.add(null);  // to print every level in new line
        while (!queue.isEmpty()) {
            Node curr = queue.poll();
//            if (curr==null) {
//                if (queue.isEmpty())
//                    return;
//                queue.add(null);
//                System.out.println();
//                continue;
//            }
            System.out.print(curr.data + ", ");
            if (curr.left != null) {
                queue.add(curr.left);
            }
            if (curr.right != null) {
                queue.add(curr.right);
            }
        }
    }


    // -------- Binary Tree Height --------
    public static int heightBT(Node root) {
        if (root == null)
            return 0;

        return Math.max(heightBT(root.left), heightBT(root.right)) + 1;
    }

    // -------- Binary Tree Size (no. of nodes) --------
    public static int sizeBT(Node root) {
        if (root == null)
            return 0;

        return (sizeBT(root.left) + sizeBT(root.right) + 1);
    }

    // -------- Binary Tree Maximum Node.data --------
    public static int maxNodeData(Node root) {
        if (root == null)
            return Integer.MIN_VALUE;

        return Math.max(root.data, Math.max(maxNodeData(root.left), maxNodeData(root.right)));
    }

    // -------- main function --------
    public static void main(String[] args) {

        Node root = createTree();

        System.out.println("------------------------");
        System.out.println("Binary Tree height: " + heightBT(root));
        System.out.println("Binary Tree size: " + sizeBT(root));
        System.out.println("Binary Tree maxNodeData: " + maxNodeData(root));

        System.out.println("\nInOrder Traversal: ");
        inOrder(root);
        System.out.println("\nPreOrder Traversal: ");
        preOrder(root);
        System.out.println("\nPostOrder Traversal: ");
        postOrder(root);

        // calling printCurrentLevel() for every level to print nodes
        System.out.println("\nLevelOrder Traversal: ");
        for (int i = 1; i <= heightBT(root); i++) {
            printCurrentLevel(root, i);
            System.out.println();
        }

        System.out.println("BFS Queue: ");
        BFS_Queue(root);
    }
}


















