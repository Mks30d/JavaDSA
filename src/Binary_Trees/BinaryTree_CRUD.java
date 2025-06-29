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

    // -------- Binary Tree Creation --------
    private static Node createTree() {
        Node root = null;
        System.out.print("Enter data or -1 to terminate: ");
        int data = sc.nextInt();
        if (data == -1) return null;
        root = new Node(data);

        System.out.println("Enter left for: " + data);
        root.left = createTree();

        System.out.println("Enter right for: " + data);
        root.right = createTree();

        return root;
    }

    public static void main(String[] args) {

        Node root = createTree();
    }
}
