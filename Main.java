import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        System.out.print("\nEscreva um n° inteiro de 4 dígitos para ser criptografado: ");
        int cripto = scanner.nextInt();

        Criptografia criptografia = new Criptografia(cripto);
        System.out.println(criptografia.showApresenta());

    }
}
