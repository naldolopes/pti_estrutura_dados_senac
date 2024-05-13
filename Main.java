// Main class
public class Main {
    public static void main(String[] args) {

        // Create the nodes
        Node node1 = new Node(111, null, null);
        Node node2 = new Node(444, null, null);
        Node node3 = new Node(999, null, null);

        // Create left and right children of the root
        Node leftChildRoot = new Node(333, node1, node2);
        Node rightChildRoot = new Node(888, null, node3);
        Node root = new Node(555, leftChildRoot, rightChildRoot);

        // Create the tree and set the root
        BinaryTree tree = new BinaryTree(root);

        // Print the tree with indentation and the nodes
        System.out.println("\nBinary Tree Output:\n");
        tree.printWithIndentation();
    }
}
