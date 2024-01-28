package trees;

public class SigmentTree {
    public static void main(String[] args) {
        int[] arr = { 3, 8, 6, 7, -2, -8, 4, 9 };
        SigmentTree tree = new SigmentTree(arr);

    }

    class Node {
        int data;
        int startInterval;
        int endInterval;
        Node left;
        Node right;

        Node(int startInterval, int endInterval) {
            this.endInterval = endInterval;
            this.startInterval = startInterval;
        }
    }

    Node root;

    SigmentTree(int[] arr) {
        // create using this array
        this.root = constractTree(arr, 0, arr.length - 1);
    }

    private Node constractTree(int[] arr, int start, int end) {
        if (start == end) {
            // leaf node
            Node leaf = new Node(start, end);
            leaf.data = arr[start];
            return leaf;

        }
        Node node = new Node(start, end);
        int mid = end - start / 2;
        node.left = constractTree(arr, start, mid);
        node.right = constractTree(arr, mid + 1, end);
        node.data = node.left.data + node.right.data;

        return node;

    }

}
