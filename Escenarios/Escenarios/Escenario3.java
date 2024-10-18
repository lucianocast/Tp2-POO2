/**
Escenario 3: Método con varios parámetros y retorno
Descripción: Tienes un método que calcula el índice de masa corporal (IMC) y devuelve un valor basado en el peso y la altura.
*/

/**
 * Clase principal de la app
 */

public class Escenario3 {
    /**
     * Método principal de la app
     * @param args Argumentos de la línea de comandos
     */
    public static void main(String[] args) {
        /**
         * Llamada al método calculaIMC con los valores 70 y 1.75
         */
        System.out.println(calculaIMC(70, 1.75));
    }

    /**
     * Método que calcula el índice de masa corporal (IMC)
     * @param peso Peso en kilogramos
     * @param altura Altura en metros
     * @return Valor del IMC
     */
    public static double calculaIMC(double peso, double altura) {
        /**
         * Cálculo del IMC
         * @return Valor del IMC
         */
        return peso / (altura * altura);
    }
}