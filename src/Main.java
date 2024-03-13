import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Kullanıcıdan bir tam sayı ve bir ondalıklı sayı al
        System.out.print("Bir tam sayı girin: ");
        int tamSayi = scanner.nextInt();

        System.out.print("Bir ondalıklı sayı girin: ");
        double ondalikliSayi = scanner.nextDouble();

        // Tam sayıyı ondalıklı sayıya dönüştür ve ekrana yazdır
        double d = (double) tamSayi;
        System.out.println("Tam sayıyı ondalıklı sayıya dönüştürdük: " + d);

        // Ondalıklı sayıyı tam sayıya dönüştür ve ekrana yazdır
        int i = (int) ondalikliSayi;
        System.out.println("Ondalıklı sayıyı tam sayıya dönüştürdük: " + i);
    }
}