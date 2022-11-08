// Interfaces - O que é e quando utilizar

/* 
 * - Interfaces são conhecidas como "contratos"
 * 
 * Uma empresa criou um contrato 'com regras' para definir a criação
 * de um produto/serviço.
 * 
 * Quem implementar este contrato é obrigado a seguir as regras.
 * 
 * O João decidiu criar um produto/serviço baseado neste contrato.
 * A Maria também decidiu criar um produto/serviço baseado no mesmo contrato.
 * 
 * Contrato para a confecção de um bolo.
 *  -O bolo de ser de chocolate;
 *  -O bolo deve ser de cobertura;
 *  -O bolo deve ser recheado;
 */

public class App {
    public static void main(String[] args) throws Exception {
       Ventilador vent = new Ventilador();

       System.out.println("A marca do ventilador é " + IEletronico.MARCA);

       vent.desligar(); // Não deve imprimir a mensagem

       vent.ligar(); // Deve imprimir a mensagem

       vent.desligar(); // Deve imprimir a mensagem
    }
}
