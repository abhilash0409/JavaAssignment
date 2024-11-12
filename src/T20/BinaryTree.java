package T20;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}

public class BinaryTree {
    // Function to perform inorder traversal
    public void inorderTraversal(TreeNode root) {
        if (root != null) {
            inorderTraversal(root.left);  // Traverse left subtree
            System.out.print(root.val + " ");  // Visit node
            inorderTraversal(root.right);  // Traverse right subtree
        }
    }

    public static void main(String[] args) {

        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);

        BinaryTree tree = new BinaryTree();
        System.out.print("Inorder traversal: ");
        tree.inorderTraversal(root);  // Output: 4 2 5 1 3
    }
}
