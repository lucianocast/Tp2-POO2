/**
* Escenario 1: Método que lanza una excepción
* Descripción: Tienes un método que divide dos números, pero puede lanzar una excepción si el divisor es cero.
*/

/**
 * Clase principal de la app
 */
public class Escenario1 {
    /**
     * Método principal de la app
     * @param args Argumentos de la línea de comandos
     */
    public static void main(String[] args) {
        try {
            /**
             * Llamada al método divide con los valores 10 y 0
             */
            System.out.println(divide(10, 0));
        } catch (Exception e) {
            /**
             * Captura de la excepción lanzada por el método divide
             */
            System.out.println("Error: " + e.getMessage());
        }
    }

    /**
     * Método que divide dos números
     * @param a Número a dividir
     * @param b Número divisor
     * @return Resultado de la división
     */
    public static int divide(int a, int b) {
        /**
         * Lanzamiento de una excepción si el divisor es cero
         * @throws ArithmeticException Si el divisor es cero
         * @return Resultado de la división
         */
        if (b == 0) {
            throw new ArithmeticException("No se puede dividir por cero");
        }
        return a / b;
    }
}