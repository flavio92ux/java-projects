// Template Method

/* 
 * -O padrão Template Method define o esqueleto de um algoritmo dentro de um método,
 * transferindo alguns de seus passos para subclasses. O Template Method permite que
 * as subclasses redefinam certos passos de um algoritmo sem alterar a estrutura do
 * próprio algoritimo
 * 
 * Algoritmos são "receitas" passo a passo para resolver algum problema.
 * 
 * Exemplo:
 * receber numero;
 * retornar numero * numero;
 * 
 * metodo_principal() {
    * passo1();
    * passo2();
    * passo3();
 * }
 */

public class App {
    public static void main(String[] args) throws Exception {
        TreinamentoInicioTemporada tit = new TreinamentoInicioTemporada();

        tit.treinoDiario();

        TreinamentoFimTemporada tft = new TreinamentoFimTemporada();

        tft.treinoDiario();
    }
}
