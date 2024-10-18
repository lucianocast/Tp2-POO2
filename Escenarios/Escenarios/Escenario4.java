/**
Escenario 4: Método que lanza múltiples excepciones
Descripción: Tienes un método que abre un archivo y lo lee, pero puede lanzar excepciones si el archivo no existe o si hay un error de entrada/salida.
*/

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * Clase principal de la app
 */

public class Escenario4 {
    /**
     * Método principal de la app
     * @param args Argumentos de la línea de comandos
     */
    public static void main(String[] args) {
        try {
            /**
             * Llamada al método leerArchivo con el nombre del archivo
             */
            leerArchivo("archivo.txt");
        } catch (FileNotFoundException e) {
            /**
             * Captura de la excepción FileNotFoundException
             */
            System.out.println("Error: Archivo no encontrado");
        } catch (IOException e) {
            /**
             * Captura de la excepción IOException
             */
            System.out.println("Error: Error de entrada/salida");
        }
    }

    /**
     * Método que lee un archivo
     * @param nombreArchivo Nombre del archivo a leer
     * @throws FileNotFoundException Si el archivo no existe
     * @throws IOException Si hay un error de entrada/salida
     */
    public static void leerArchivo(String nombreArchivo) throws FileNotFoundException, IOException {
        /**
         * Creación de un objeto BufferedReader para leer el archivo
         */
        try (BufferedReader br = new BufferedReader(new FileReader(nombreArchivo))) {
            /**
             * Lectura de la primera línea del archivo
             */
            String linea = br.readLine();
            /**
             * Mientras haya líneas en el archivo, imprime cada línea
             */
            while (linea != null) {
                System.out.println(linea);
                linea = br.readLine();
            }
        }
    }
}