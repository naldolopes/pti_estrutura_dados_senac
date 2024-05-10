public class Node {

    private long id;
    private Node left, right;

    public Node(long id, Node left, Node right) {
        this.id = id;
        this.left = left;
        this.right = right;
    }

    public long getId() {
        return this.id;
    }

    public Node getLeft() {
        return left;
    }

    public Node getRight() {
        return right;
    }
}
