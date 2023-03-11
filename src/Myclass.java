import  java.util.Scanner;
public class Myclass {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Ingresa un número: ");
        int numero = input.nextInt();
        if (numero < 50) {
            System.out.println("El resultado es: Cara");
        } else {
            System.out.println("El resultado es: Sello");
        }
    }
}