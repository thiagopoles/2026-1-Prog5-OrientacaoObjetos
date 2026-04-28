
public class Animal {
    private String nome;
    private int idade;
    
    public Animal(String nome) {
        this.nome = nome;
        System.out.println("🔹 super Construtor 1");
    }
    
    public Animal(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
        System.out.println("🔹 super Construtor 2");
    }
}