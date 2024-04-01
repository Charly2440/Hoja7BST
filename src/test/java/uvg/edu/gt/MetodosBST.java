package uvg.edu.gt;

import junit.framework.Assert;
import org.junit.jupiter.api.Test;

public class MetodosBST {
    @Test
    public void testImplementacionBST(){
        BinaryTree<String, String> dictionary = new BinaryTree<>();
        dictionary.put("house", "casa");
        dictionary.put("dog", "perro");
        dictionary.put("homework", "tarea");
        dictionary.put("woman", "mujer");
        dictionary.put("town", "pueblo");
        dictionary.put("yes", "sí");

        System.out.println("Traducción de 'house': " + dictionary.get("house"));
        System.out.println("Traducción de 'town': " + dictionary.get("town"));
        System.out.println("Traducción de 'yes': " + dictionary.get("yes"));
        System.out.println();
        System.out.println(dictionary.traverseInOrder());
    }
    @Test
    public void testImplementacionAssociation(){
        Association<String, String> asso1 = new Association<>("Hola", "hello");
        System.out.println(asso1.getKey()+" "+asso1.getValue());

    }
    @Test
    public void testTrad(){
        BinaryTree<String, String> dictionary = new BinaryTree<>();
        dictionary.put("house", "casa");
        dictionary.put("dog", "perro");
        dictionary.put("homework", "tarea");
        dictionary.put("woman", "mujer");
        dictionary.put("town", "pueblo");
        dictionary.put("yes", "sí");
        Assert.assertEquals("casa", dictionary.get("house"));
    }

    @Test
    public void testTraverse(){
        BinaryTree<String, String> dictionary = new BinaryTree<>();
        dictionary.put("house", "casa");
        dictionary.put("dog", "perro");
        dictionary.put("homework", "tarea");
        dictionary.put("woman", "mujer");
        dictionary.put("town", "pueblo");
        dictionary.put("yes", "sí");
        Assert.assertEquals("[perro, tarea, casa, pueblo, mujer, sí]", dictionary.traverseInOrder());
    }
}

