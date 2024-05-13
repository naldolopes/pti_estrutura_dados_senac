// BinaryTree class
public class BinaryTree {

    // Private Fields
    private Node root;

    // Constructor
    public BinaryTree(Node root) {

        // Set the root of the tree to the given root
        this.root = root;
    }

    // Print the tree with indentation
    public void printWithIndentation() {
        printWithIndentationRecursive(root, 0);
    }

    // Print the tree with indentation recursively starting from the root
    private void printWithIndentationRecursive(Node node, int level) {

        // if the node is not null
        if (node != null) {

            // Print the indentation
            printIndentation(level);

            // Print the node id
            System.out.println(node.getId());

            // Print the left and right children
            printWithIndentationRecursive(node.getLeft(), level + 1);
            printWithIndentationRecursive(node.getRight(), level + 1);
        } else {

            // Print the indentation
            printIndentation(level);

            // Print a dash indicating a null node
            System.out.println("-");
        }
    }

    // Print the indentation based on the level
    private void printIndentation(int level) {
        for (int i = 0; i < level; i++) {
            System.out.print("   "); // Three spaces per level
        }
    }
}
