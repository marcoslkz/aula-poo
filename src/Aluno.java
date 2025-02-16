public class Aluno extends Pessoa {
    private String curso;
    
    public Aluno(String nome, int idade, String curso) {
        super(nome, idade);
        this.curso = curso;
    }
    
    public String getCurso() { return curso; }
    public void setCurso(String curso) { this.curso = curso; }
    
    @Override
    public void apresentar() {
        System.out.println("Olá, sou aluno do curso de " + curso + ". Meu nome é " + getNome() + ".");
    }
}
