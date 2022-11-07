// Classes abstratas

/* 
 * - É um recurso que proporciona um bloqueio na criação de objetos
 * - Não conseguimos instanciar objetos de uma classe abstrata.
 */

public class App {
    public static void main(String[] args) throws Exception {
        Aluno maria = new Aluno("Maria da silva", 1999, "123", "roxdownload.uol.vilabol.com.br");

        System.out.println(maria);

        maria.outraMensagem("Meu nome é Maria");
    }
}
