public class Calculator {
    // Malas prácticas: variable no descriptiva, método innecesario
    private int x;

    public int sumar(int a, int b) {
        return a + b;
    }

    public int dividir(int a, int b) {
        // Error: no maneja división por 0 correctamente
        //prueba de comentario
        return a / b;
    }

    // Código redundante e innecesario
    public void imprimirMensaje() {
        System.out.println("Hola, soy un método inútil");
    }
}
