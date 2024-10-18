/**
Escenario 2: Método obsoleto con sugerencia de uso alternativo
Descripción: Tienes un método que ha quedado obsoleto, y quieres documentarlo para que no sea utilizado, sugiriendo un nuevo método.
*/

/**
 * Clase principal de la app
 */
public class Escenario2 {
    /**
     * Método principal de la app
     * @param args Argumentos de la línea de comandos
     */
    public static void main(String[] args) {
        /**
         * Llamada al método obsoleto
         */
        System.out.println(obsoleto());
    }

    /**
     * Método obsoleto
     * @return Cadena de texto
     * @deprecated Este método ha quedado obsoleto, utiliza en su lugar el método nuevo()
     */
    @Deprecated
    public static String obsoleto() {
        return "Método obsoleto";
    }

    /**
     * Método nuevo
     * @return Cadena de texto
     */
    public static String nuevo() {
        return "Método nuevo";
    }
}

