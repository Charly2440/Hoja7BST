package uvg.edu.gt;

import java.util.ArrayList;
import java.util.List;

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
            Association<K, V> data = new Association<>(key, value);
            return new TreeNode<>(data);
        }

        K nodeKey = node.getData().getKey(); // Get the key from the node's data
        int cmp = key.compareTo(nodeKey);
        if (cmp < 0) {
            node.setLeft(putRecursive(node.getLeft(), key, value));
        } else if (cmp > 0) {
            node.setRight(putRecursive(node.getRight(), key, value));
        } else {
            // Key already exists, update the value
            node.getData().setValue(value);
        }

        return node;
    }


    public V get(K key) {
        TreeNode<K, V> node = getRecursive(this.root, key);
        return (node != null) ? node.getData().getValue() : null;
    }

    private TreeNode<K, V> getRecursive(TreeNode<K, V> node, K key) {
        if (node == null) {
            return null;
        }

        K nodeKey = node.getData().getKey();
        int cmp = key.compareTo(nodeKey);
        if (cmp < 0) {
            return getRecursive(node.getLeft(), key);
        } else if (cmp > 0) {
            return getRecursive(node.getRight(), key);
        } else {
            return node;
        }
    }

    public String traverseInOrder() {
        List<V> result = new ArrayList<>();
        traverseInOrderRecursive(root, result);
        return result.toString();
    }

    private void traverseInOrderRecursive(TreeNode<K, V> node, List<V> result) {
        if (node == null) {
            return;
        }

        traverseInOrderRecursive(node.getLeft(), result);
        result.add(node.getData().getValue());
        traverseInOrderRecursive(node.getRight(), result);
    }
}
