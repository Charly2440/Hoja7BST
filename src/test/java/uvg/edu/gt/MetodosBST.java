package uvg.edu.gt;

import org.junit.jupiter.api.Test;

public class MetodosBST {
    @Test
    public void testImplementacionBST(){
        BinaryTree<Integer> arbol = new BinaryTree<>();
        arbol.insert(56);
        arbol.insert(12);
        arbol.insert(78);
        arbol.insert(67);
        System.out.println(arbol.inorderTraversal());
    }
}
