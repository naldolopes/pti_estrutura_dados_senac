// Node class
public class Node {

    // Private Fields
    private int id;
    private Node left, right;

    // Constructor
    public Node(int id, Node left, Node right) {
        this.id = id;
        this.left = left;
        this.right = right;
    }

    // Getters
    public int getId() {
        return this.id;
    }

    public Node getLeft() {
        return left;
    }

    public Node getRight() {
        return right;
    }
}