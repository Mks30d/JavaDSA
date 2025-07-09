package Binary_Trees;

public class traversal {

    public static void printCurrentLevel(BinaryTree_CRUD.Node root, int level) {
        if (root == null)
            return;
        if (level == 1)
            System.out.print(root.data + " ");

        if (level > 1) {
            printCurrentLevel(root.left, level - 1);
            printCurrentLevel(root.right, level - 1);
        }
    }

//    public static void main(String[] args) {
//        System.out.println("\nLevelOrder Traversal: ");
//        for (int i = 0; i < heightBT(root); i++) {
//            printCurrentLevel(root, i);
//            System.out.println();
//        }
//    }

}
