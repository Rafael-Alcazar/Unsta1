import java.util.Scanner;

public class Persona {


    public static void main(String[] args) {
        String nombre;
        int edad;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese su nombre");
        nombre = scanner.next();

        System.out.println("Ingrese su edad");
        edad = scanner.nextInt();

        System.out.println("El nombre es "+ nombre +" y su edad es "+ edad);

    }
}
