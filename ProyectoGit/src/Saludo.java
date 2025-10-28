import java.util.Scanner;

public class Saludo {
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer del teclado
        Scanner teclado = new Scanner(System.in);

        // Pedir el nombre al usuario
        System.out.print("Introduce tu nombre: ");
        String nombre = teclado.nextLine();

        // Mostrar el saludo
        System.out.println("¡Hola, " + nombre + "! Bienvenido al programa.");

        // Cerrar el Scanner
        teclado.close();
    }
}