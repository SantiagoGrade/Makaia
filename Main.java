
public class Main {
    public static void main(String[] args) {
        //cree motor
        Motor motorCarro = new Motor("china","china23");
        //Cree las llantas
        Llanta llanta1 = new Llanta("marcaRin", "1");
        Llanta llanta2 = new Llanta("marcaRin", "1");
        Llanta llanta3 = new Llanta("marcaRin", "1");
        Llanta llanta4 = new Llanta("marcaRin", "1");
        //Cree el carro
        Carro carroMazda = new Carro(motorCarro);
        //Le asigno las llantas
        carroMazda.agregarLlantas(llanta1);
        carroMazda.agregarLlantas(llanta2);
        carroMazda.agregarLlantas(llanta3);
        carroMazda.agregarLlantas(llanta4);
        //Obtener las relaciones de la clase principal que es carro
        Motor motos = carroMazda.getMotor();
        Llanta llanta = carroMazda.obtenerLlanta(2);
    }
}