public class Professor extends Pessoa {
  private String matricula;

  public Professor(String nome, int ano_nascimento, String matricula, String email) {
    super(nome, ano_nascimento, email);
    this.matricula = matricula;
  }

  public String getMatricula() {
    return this.matricula;
  }

  public void setMatricula(String matricula) {
    this.matricula = matricula;
  }

}
