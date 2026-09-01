import java.util.Scanner;

public class HolaMundo {
    public static void main(String[] args) {
        System.out.println("Hola mundo");

        System.out.print("Cual es tu nombre: ");

        Scanner scanner = new Scanner(System.in);

        String nombre = scanner.nextLine();

        System.out.println("Hola " + nombre + "!");

    }
}
