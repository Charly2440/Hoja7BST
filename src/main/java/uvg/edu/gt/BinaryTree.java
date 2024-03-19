package uvg.edu.gt;

import java.util.ArrayList;

public class BinaryTree<T extends Comparable<T>> {
    private TreeNode<T> root;

    public BinaryTree() {
        this.root = null;
    }

    public boolean isEmpty() {
        return root == null;
    }

    public void clear() {
        this.root = null;
    }

    public void insert(T val) {
        this.root = insertRecursive(this.root, val);
    }

    private TreeNode<T> insertRecursive(TreeNode<T> node, T val) {
        if (node == null) {
            return new TreeNode<>(val);
        }

        if (val.compareTo(node.getData()) < 0) {
            node.setLeft(insertRecursive(node.getLeft(), val));
        } else if (val.compareTo(node.getData()) > 0) {
            node.setRight(insertRecursive(node.getRight(), val));
        }

        return node;
    }

    public ArrayList<T> inorderTraversal() {
        ArrayList<T> result = new ArrayList<>();
        inorderTraversalRecursive(this.root, result);
        return result;
    }

    private void inorderTraversalRecursive(TreeNode<T> node, ArrayList<T> result) {
        if (node != null) {
            inorderTraversalRecursive(node.getLeft(), result);
            result.add(node.getData());
            inorderTraversalRecursive(node.getRight(), result);
        }
    }
}

