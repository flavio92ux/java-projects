// Sobrecarga de método

/* 
 * - Overloading
 * 
 * Ocorre quando sobrescrevemos um método na mesma classe de declaração
 */

public class App {
    public static void main(String[] args) throws Exception {
        Pessoa p1 = new Pessoa("Flavio", 1992, "flavio.win@gmail.com");

        p1.mensagem();
        p1.mensagem("Minha mensagem é diferente!");
    }
}
