public class App {
    public static void main(String[] args) throws Exception {
        Pessoa p1 = new Pessoa("Pedro da Silva", 1987);

        System.out.println(p1.getNome());

        Aluno a1 = new Aluno("Vanessa da Silva",1992, "123456");

        System.out.println(a1.getRa());

        Professor pr1 = new Professor("Pedro da Silva", 1983, "1233456");

        System.out.println(pr1.getMatricula());
    }
}
