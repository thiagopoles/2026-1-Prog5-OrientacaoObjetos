public class Cachorro extends Animal {
    private String raca;
    
    public Cachorro(String nome) {
        super(nome);
        System.out.println("🔹 Construtor 1");
    }
    
    public Cachorro(String nome, int idade) {
        super(nome, idade);
        System.out.println("🔹 Construtor 2");
    }
    
    public Cachorro(String nome, int idade, String raca) {
        super(nome, idade);
        this.raca = raca;
        System.out.println("🔹 Construtor 3");
    }
    
    public String getRaca() {
        return raca;
    }
    
    public void setRaca(String raca) {
        this.raca = raca;
    }
}