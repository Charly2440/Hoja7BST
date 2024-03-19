package uvg.edu.gt;

import com.sun.tools.jdeprscan.scan.Scan;

import java.util.ArrayList;
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
        int choice;
        do {
            System.out.println("Menu:");
            System.out.println("1. Usar diccionario local");
            System.out.println("2. Usar diccionario con archivo de texto");
            System.out.println("3. Salir");
            System.out.print("Ingrese su elección: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    usarDiccionarioLocal();
                    break;
                case 2:
                    //usarDiccionarioConArchivo();
                    break;
                case 3:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción inválida. Por favor, ingrese una opción válida.");
            }
        } while (choice != 3);

        scanner.close();
    }

    private static String usarDiccionarioLocal(Scanner scanner, BinaryTree<String,String> arbol) {
        System.out.println("Usando diccionario local...");
        System.out.println("Ingrese la oración a traducir: ");
        scanner.nextLine();
        String input = scanner.next();
        scanner.nextLine();
        String[] inputSep = input.split(" ");
        String resultado = "";
        for (int i = 0; i < inputSep.length; i++) {
            if (arbol.get(inputSep[i]) != null) {
                resultado = resultado + " " + arbol.get(inputSep[i]);
            } else {
                resultado = resultado + " " + "\"" + inputSep[i] + "\"";
            }
        }
        return resultado;
    }

    private static void usarDiccionarioConArchivo() {
        // Implementar la lógica para usar el diccionario con archivo de texto
        System.out.println("Usando diccionario con archivo de texto...");
    }

    private static void rellenarDicionario(BinaryTree<String, String> arbol){

    }

}
