public class ArCondicionadoReceiver {
    
    private int temperatura;

    public ArCondicionadoReceiver(int temperatura) {
        this.temperatura = temperatura;
    }

    public int getTemperatura() {
        return this.temperatura;
    }

    public void ligar() {
        System.out.println(String.format("Ligando o ar condicionado na temperatura %d *C...", this.temperatura));
    }

    public void desligar() {
        System.out.println("Desligando o ar condicionado...");
    }

    public void ajustarTemperatura(int novaTemperatura) {
        System.out.println(String.format("Ajustando a temperatura do ar condicionado de %d *C para %d *C...", this.temperatura, novaTemperatura));
        this.temperatura = novaTemperatura;
    }
}
