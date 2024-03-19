package uvg.edu.gt;

import java.util.List;
import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Scanner scanner = new Scanner(System.in);
        BinaryTree<String, String> arbol = new BinaryTree<>();
        //Direccion del archivo de texto con la oracion a traducir
        String direccion = "C:\\Users\\cjvil\\Downloads\\textoPruebaDiccionario.txt";
        int choice;
        do {
            System.out.println("\nMenu:");
            System.out.println("1. Usar diccionario local");
            System.out.println("2. Usar diccionario con archivo de texto");
            System.out.println("3. Mostrar los elementos del arbol binario \"in-order\" ");
            System.out.println("4. Salir");
            System.out.print("Ingrese su elección: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println(usarDiccionarioLocal(scanner,arbol));
                    break;
                case 2:
                    System.out.println(usarDiccionarioConArchivo(scanner, arbol, direccion));
                    break;
                case 3:
                    rellenarDicionario(arbol);
                    System.out.println("Elementos en in-order:");
                    System.out.println(arbol.traverseInOrder());
                    break;
                case 4:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción inválida. Por favor, ingrese una opción válida.");
            }
        } while (choice != 4);

        scanner.close();
    }

    private static String usarDiccionarioLocal(Scanner scanner, BinaryTree<String,String> arbol) {
        rellenarDicionario(arbol);
        System.out.println("Usando diccionario local...");
        System.out.println("Ingrese la oración a traducir: ");
        scanner.nextLine();
        String input = scanner.nextLine();
        String[] inputSep = input.split(" ");
        String resultado = "";
        for (int i = 0; i < inputSep.length; i++) {
            if (arbol.get(inputSep[i].toLowerCase()) != null) {
                resultado = resultado + " " + arbol.get(inputSep[i]);
            } else {
                resultado = resultado + " " + "\"" + inputSep[i] + "\"";
            }
        }
        return resultado;
    }

    private static String usarDiccionarioConArchivo(Scanner scanner, BinaryTree<String, String> arbol, String direccion) {
        System.out.println("Usando diccionario con archivo de texto...");

        rellenarDicionario(arbol);
        LeerArchivo lector = new LeerArchivo();

        List<String> input = lector.leerArchivo(direccion);
        String[] inputSep = input.get(0).split(" ");
        String resultado = "";
        for (int i = 0; i < inputSep.length; i++) {
            if (arbol.get(inputSep[i].toLowerCase()) != null) {
                resultado = resultado + " " + arbol.get(inputSep[i]);
            } else {
                resultado = resultado + " " + "\"" + inputSep[i] + "\"";
            }
        }
        return resultado;
    }

    private static void rellenarDicionario(BinaryTree<String, String> arbol){
        arbol.put("house", "casa");
        arbol.put("dog", "perro");
        arbol.put("homework", "tarea");
        arbol.put("woman", "mujer");
        arbol.put("town", "pueblo");
        arbol.put("yes", "sí");
        arbol.put("cat", "gato");
        arbol.put("car", "coche");
        arbol.put("apple", "manzana");
        arbol.put("tree", "árbol");
        arbol.put("book", "libro");
    }

}
