public class BinaryTree {
    private Node root;

    public BinaryTree() {
        this.root = null;
    }

    // Method to set the root node
    public void setRoot(Node root) {
        this.root = root;
    }

    // Method to count and return the number of left child nodes
    public int countLeftChildNodes() {
        return countLeftChildNodesRecursive(root);
    }

    // Recursive auxiliary method to count left child nodes
    private int countLeftChildNodesRecursive(Node node) {
        if (node == null) {
            return 0;
        }

        int leftChildNodes = countLeftChildNodesRecursive(node.getLeft());

        if (node.getLeft() != null) {
            leftChildNodes++;
        }

        return leftChildNodes + countLeftChildNodesRecursive(node.getRight());
    }

    // Method to print the IDs of the binary tree with proportional indentation
    public void printWithIndentation() {
        printWithIndentationRecursive(root, 0);
    }

    // Recursive auxiliary method for printing with indentation
    private void printWithIndentationRecursive(Node node, int level) {
        if (node == null) {
            return;
        }

        // Prints the indentation according to the level
        for (int i = 0; i < level; i++) {
            System.out.print("    ");
        }

        // Prints the ID of the node
        System.out.println(node.getId());

        // Recursive calls for the children
        printWithIndentationRecursive(node.getLeft(), level + 1);
        printWithIndentationRecursive(node.getRight(), level + 1);
    }
}
