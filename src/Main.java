

public class Main {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        System.out.println("Suma: " + calc.sumar(5, 10));
        System.out.println("División: " + calc.dividir(10, 0)); // Error de división por 0
    }
}
