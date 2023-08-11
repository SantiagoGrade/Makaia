public class Carro {
    private Motor motor;
    private Llanta[] llanta;
    private int contadorLlantas = 0;

    public Carro(Motor motor){
        this.motor = motor;
        this.llanta = new Llanta[4];
    }

    public void agregarLlantas(Llanta llanta){
        this.llanta[contadorLlantas]= llanta;
        this.contadorLlantas++;
    }

    public Motor getMotor() {
        return this.motor;
    }

    public Llanta obtenerLlanta(int numeroLlanta){
        return this.llanta[numeroLlanta];
    }
}
