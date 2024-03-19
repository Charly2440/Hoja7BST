package uvg.edu.gt;

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

        System.out.println("Translation of 'house': " + dictionary.get("house"));
        System.out.println("Translation of 'town': " + dictionary.get("town"));
        System.out.println("Translation of 'yes': " + dictionary.get("yes"));
        System.out.println();
        System.out.println(dictionary.traverseInOrder());
    }
    @Test
    public void testImplementacionAssociation(){
        Association<String, String> asso1 = new Association<>("Hola", "hello");
        System.out.println(asso1.getKey()+" "+asso1.getValue());

    }
}
