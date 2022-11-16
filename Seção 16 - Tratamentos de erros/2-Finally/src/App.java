// Tratando exceções com Try..Catch

/* 
 * Utilizamos o try para tentar realizar algo, geralmente realizar aquilo que pode
 * acarretar em um problema.
 * 
 * Utilizamos o catch para capturar o erro e com isso oferecer ao usuário do sistema
 * uma mensagem adequada sem que o sistema quebre.
 */

public class App {
    public static void main(String[] args) throws Exception {
        int numeros[] = new int[5]; // 0..4 -> 0, 1, 2, 3, 4 -> n - 1

        for(int i = 0; i < numeros.length; i++) {
            numeros[i] = i + 3 * 2;
        }

        for (int i = 0; i <= numeros.length; i++) {
            try { // Tente fazer isso
                System.out.println(numeros[i]);   
            } catch (Exception e) {
                System.out.println("Você está tentando acessar uma posição do array que não existe: " + e);
            } finally {
                System.out.println("Continua o processo...");
            }
        }
    }
}
