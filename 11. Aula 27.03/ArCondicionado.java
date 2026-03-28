public class ArCondicionado {
    // Questão 1: Atributos
    private double temperatura;
    private boolean oscilacao;
    private int velocidadeAr;
    private boolean ligado;

    // Questão 2: Construtor que inicializa os atributos
    public ArCondicionado(double temperatura, boolean oscilacao, int velocidadeAr) {
        this.temperatura = temperatura;
        this.oscilacao = oscilacao;
        this.velocidadeAr = velocidadeAr;
        this.ligado = false; // Geralmente inicia desligado
        limitarTemp(); // Garante que a temperatura inicial seja válida
    }

    // Questão 7: Sobrecarga do construtor com valores padrão
    public ArCondicionado() {
        this.temperatura = 22.0;
        this.oscilacao = false;
        this.velocidadeAr = 1;
        this.ligado = false;
    }

    // Questão 3: Método ligaDesliga
    public void ligaDesliga() {
        this.ligado = !this.ligado;
        System.out.println(this.ligado ? "Ar condicionado ligado." : "Ar condicionado desligado.");
    }

    // Questão 4: Método limitarTemp
    private void limitarTemp() {
        if (this.temperatura < 17) {
            this.temperatura = 17;
        } else if (this.temperatura > 30) {
            this.temperatura = 30;
        }
    }

    // Questão 5: Método setTemperatura
    public void setTemperatura(double temperatura) {
        this.temperatura = temperatura;
        limitarTemp(); // Aplica a regra da Questão 4
    }

    // Questão 6: Método getTemperatura
    public double getTemperatura() {
        return this.temperatura;
    }

    // Questão 9: Método aumentarTemp
    public void aumentarTemp() {
        if (this.ligado) {
            this.temperatura += 1;
            limitarTemp();
            System.out.println("Temperatura aumentada para: " + this.temperatura + "°C");
        } else {
            System.out.println("O aparelho está desligado.");
        }
    }

    // Questão 8: Método estadoAtual
    public void estadoAtual() {
        System.out.println("--- Status do Ar ---");
        System.out.println("Ligado: " + (ligado ? "Sim" : "Não"));
        System.out.println("Temperatura: " + temperatura + "°C");
        System.out.println("Oscilação: " + (oscilacao ? "Ativa" : "Inativa"));
        System.out.println("Velocidade do Ar: " + velocidadeAr);
        System.out.println("--------------------");
    }
}