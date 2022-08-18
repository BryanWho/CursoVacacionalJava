public class ProyectoCalculadora {
    public static void main(String[] args) throws Exception {
        Calculadora  miCalculadora = new Calculadora(10,2);

        int suma = miCalculadora.sumar();
        System.out.println(suma);
    }
}
