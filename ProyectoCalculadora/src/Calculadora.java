public class Calculadora {
    private int numero1;
    private int numero2;

    public Calculadora(){

    }

    public Calculadora(int numero1, int numero2){
        this.numero1 = numero1;
        this.numero2 = numero2;
    }

    public int sumar(){
        int suma = this.numero1 + this.numero2;
        return suma;
    }

    public int restar(){
        int resta = this.numero1 - this.numero2;
        return resta;
    }

    public int multiplicar(){
        int multiplicacion = this.numero1 * this.numero2;
        return multiplicacion;
    }

    public double dividir(){
        double division = (double)this.numero1 / (double)this.numero2;
        return division;
    }

    public int getNumero1() {
        return numero1;
    }

    public void setNumero1(int numero1) {
        this.numero1 = numero1;
    }

    public int getNumero2() {
        return numero2;
    }

    public void setNumero2(int numero2) {
        this.numero2 = numero2;
    }

}
