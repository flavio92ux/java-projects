// Métodos estáticos

/* Um método estático não depende de uma instância da classe para
 * ser utilizado.
 * 
 * Pode der utilizado conforme:
 * 
 * NomeDaClasse.metodo();
 */

public class App {
    public static void main(String[] args) throws Exception {
        Conta c1 = new Conta("Meu cliente");
        System.out.println(c1.getNumero());
        System.out.println(c1.getCliente());

        System.out.println("A próxima conta será: " + Conta.proximaConta());
    }
}
