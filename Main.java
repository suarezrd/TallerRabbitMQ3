public class Main {
    public static void main(String[] args) throws Exception {

        // En este caso no es necesario un archivo Main.java separado.
        // Lo anterio debido a que cada clase (OrderProducer y OrderConsumer) tiene su propio método main.
        // Esto permite ejecutar cada método de forma independiente.
        // Sin embargo, podemos tener un archivo Main.java que coordine la ejecución del productor y el consumidor.

        // Ejecutar el productor
        OrderProducer.main(args);

        // Ejecutar el consumidor
        OrderConsumer.main(args);
    }
}