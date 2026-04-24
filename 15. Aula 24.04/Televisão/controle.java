public class Controle {
    private Tevelisao tv;

    public Controle(Tevelisao tv) {
        this.tv = tv;
    }
    public void ligarDesligar() {
        tv.ligadoDesligado();
    }
    public void aumentarVolume() {
        tv.maisVolume();
    }
    public void diminuirVolume() {
        tv.menosVolume();
    }
    public void proximoCanal() {
        tv.passarCanel();
    }
    public void canalAnterior() {
        tv.voltarCanal();
    }
    public void escolherCanal(int canal) {
        tv.trocarCanal(canal);
    }
    public void mostrarStatus() {
        tv.estadoAtual();
    }
}