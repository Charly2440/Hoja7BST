package uvg.edu.gt;

import java.util.HashMap;

public class BinaryTree<K extends Comparable<K>, V> {
    private TreeNode<K, V> root;

    public BinaryTree() {
        this.root = null;
    }

    public void put(K key, V value) {
        this.root = putRecursive(this.root, key, value);
    }

    private TreeNode<K, V> putRecursive(TreeNode<K, V> node, K key, V value) {
        if (node == null) {
            HashMap<K, V> data = new HashMap<>();
            data.put(key, value);
            return new TreeNode<>(data);
        }

        K nodeKey = node.getData().keySet().iterator().next(); // Get the key from the node's data
        int cmp = key.compareTo(nodeKey);
        if (cmp < 0) {
            node.setLeft(putRecursive(node.getLeft(), key, value));
        } else if (cmp > 0) {
            node.setRight(putRecursive(node.getRight(), key, value));
        } else {
            // Key already exists, update the value
            node.getData().put(key, value);
        }

        return node;
    }


    public V get(K key) {
        TreeNode<K, V> node = getRecursive(this.root, key);
        return (node != null && node.getData().containsKey(key)) ? node.getData().get(key) : null;
    }

    private TreeNode<K, V> getRecursive(TreeNode<K, V> node, K key) {
        if (node == null || !node.getData().containsKey(key)) {
            return null;
        }

        int cmp = key.compareTo(node.getData().keySet().iterator().next());
        if (cmp < 0) {
            return getRecursive(node.getLeft(), key);
        } else if (cmp > 0) {
            return getRecursive(node.getRight(), key);
        } else {
            return node;
        }
    }

}
