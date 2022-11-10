import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Informe o primeiro número para divisão: ");
        int num1 = teclado.nextInt();

        System.out.println("Informe o segundo número para divisão");
        int num2 = teclado.nextInt();

        teclado.close();

        try {
            System.out.println("A divisão de " + num1 + " por " + num2 + " é " + num1/num2);
        } catch (Exception e) {
            System.out.println("Não é possível dividir num1 por num2: " + e);
        }
    }
}
