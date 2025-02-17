public class Professor  extends Pessoa {
    private String escola;
    
    public Professor(String nome, int idade, String escola) {
        super(nome, idade);
        this.escola = escola;
    }
    
    public String getEscola() { return escola; }
    public void setEscola(String escola) { this.escola = escola; }
    
    @Override
    public void apresentar() {
        System.out.println("Olá, sou professor no " + escola + ". Meu nome é " + getNome() + ".");
    }
}
