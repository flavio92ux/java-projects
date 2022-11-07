/* Benefícios da Herança
 * - Evita a repetição de código
 * - Facilita a manutenção do programa
 * - ...
 * 
 * - Classe específica
 * - Sub-Classe
 * - Classe filha
 */

// Aluno é uma Pessoa

/* 
 * - Quando uma classe herda de outra classe, ela ganha:
 *    - TODOS os atrubutos e métodos da classe herdada.
 */
public class Aluno extends Pessoa {
  private String ra;

  public Aluno(String nome, int ano_nascimento, String ra, String email) {
    super(nome, ano_nascimento, email ); // Pessoa(nome, ano_nascimento)
    this.ra = ra;
  }

  public String getRa() {
    return this.ra;
  }

  public void setRa(String ra) {
    this.ra = ra;
  }
}
