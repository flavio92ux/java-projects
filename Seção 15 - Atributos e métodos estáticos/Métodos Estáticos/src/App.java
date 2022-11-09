// Atributos estáticos

/* 
 * Atributos estáticos são atributos em que os valores são compartilhados
 * entre as instâncias da classe.
 * 
 * Para utilizar um atributo estático colocamos o nome da classe junto
 * ao atributo.
 * 
 * Exemplo:
 * NomeDaClasse.atributo
 */

public class App {
    public static void main(String[] args) throws Exception {
        Conta c1 = new Conta("Angelina Jolie");
        System.out.println(c1.getNumero());
        System.out.println(c1.getCliente());

        Conta c2 = new Conta("Felicity Jones");
        System.out.println(c2.getNumero());
        System.out.println(c2.getCliente());

        Conta c3 = new Conta("Maria da Graça Xuxa Meneguel");
        System.out.println(c3.getNumero());
        System.out.println(c3.getCliente());        
    }
}
