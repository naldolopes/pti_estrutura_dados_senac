
public class Main {
    public static void main(String[] args) {

        // Creating nodes
        Node node1 = new Node(111, null, null);
        Node node2 = new Node(222, null, null);
        Node node3 = new Node(333, node1, node2);
        Node node4 = new Node(444, null, null);
        Node node5 = new Node(555, node3, node4);
        Node node6 = new Node(666, null, null);
        Node node7 = new Node(777, null, node6);
        Node node8 = new Node(888, null, node7);
        Node node9 = new Node(999, null, null);
        Node node10 = new Node(1010, node8, node9);

        BinaryTree binaryTree = new BinaryTree();
        binaryTree.setRoot(node5);

        // Counting left nodes
        int celebratoryLeftNodes = binaryTree.countLeftChildNodes();
        System.out.println("Number of celebratory left nodes: " + celebratoryLeftNodes);

        // Printing with indentation
        System.out.println("Tree with indentation:");
        binaryTree.printWithIndentation();
    }
}
