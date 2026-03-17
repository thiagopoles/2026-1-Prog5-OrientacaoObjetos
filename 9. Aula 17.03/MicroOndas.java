public class MicroOndas {
    private String marca;
    private int tempo;
    private String tipoAlimento;
    private boolean ligado;

    public MicroOndas(String marca, int tempo, String tipoAlimento, boolean ligado) {
        this.marca = marca;
        this.tempo = tempo;
        this.tipoAlimento = tipoAlimento;
        this.ligado = ligado;
    }

    public MicroOndas() {
        this.ligado = false;
        this.tempo = 0;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getTempo() {
        return tempo;
    }

    public void setTempo(int tempo) {
        if (tempo >= 0 && tempo <= 120) {
            this.tempo = tempo;
        } else {
            System.out.println("Erro: Tempo inválido!");
        }
    }

    public String getTipoAlimento() {
        return tipoAlimento;
    }

    public void setTipoAlimento(String tipoAlimento) {
        this.tipoAlimento = tipoAlimento;
    }

    public boolean isLigado() {
        return ligado;
    }

    public void maisTempo30() {
        if (this.tempo + 30 <= 120) {
            this.tempo += 30;
        } else {
            this.tempo = 120;
        }
        System.out.println("Tempo atual: " + this.tempo);
    }

    public void ligaDesliga() {
        if (this.ligado == false) {
            this.ligado = true;
        } else {
            this.ligado = false;
        }
        System.out.println("Micro-Ondas ligado: " + this.ligado);
    }

    public void status() {
        System.out.println("--------------------------");
        System.out.println("Marca: " + this.marca);
        System.out.println("Tempo: " + this.tempo + "s");
        System.out.println("Alimento: " + this.tipoAlimento);
        System.out.println("Ligado: " + (this.ligado ? "Sim" : "Não"));
        System.out.println("--------------------------");
    }
}