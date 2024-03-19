package uvg.edu.gt;

import java.util.HashMap;

public class TreeNode<K, V> {
    private Association<K, V> data;
    private TreeNode<K, V> right;
    private TreeNode<K, V> left;

    public TreeNode(Association<K, V> data){
        this.data = data;
        this.right = null;
        this.left = null;
    }

    public Association<K, V> getData() {
        return data;
    }

    public void setData(Association<K, V> data) {
        this.data = data;
    }

    public TreeNode<K, V> getLeft() {
        return left;
    }

    public void setLeft(TreeNode<K, V> left) {
        this.left = left;
    }

    public TreeNode<K, V> getRight() {
        return right;
    }

    public void setRight(TreeNode<K, V> right) {
        this.right = right;
    }
}
