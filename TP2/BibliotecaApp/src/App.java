import modelo.*;
/**
 * Clase principal de la aplicación.
 */
public class App {
    /**
     * Método principal de la aplicación.
     * @param args argumentos de la línea de comandos
     * @throws Exception excepción lanzada en caso de error
     */
    public static void main(String[] args) throws Exception {
        /**
         * Creación de la bibliotecA
         */
        Biblioteca biblioteca  = new Biblioteca();
        /**
         * Creación de los libros
         */
        Libro libro1 = new Libro("El principito", "Antoine de Saint-Exupéry", 100);
        Libro libro2 = new Libro("El alquimista", "Paulo Coelho", 200);
        Libro libro3 = new Libro("Cien años de soledad", "Gabriel García Márquez", 300);
        /**
         * Registro de los libros en la biblioteca
         */
        biblioteca.registrarLibro(libro1);
        biblioteca.registrarLibro(libro2);
        biblioteca.registrarLibro(libro3);
        /**
         * Creación de los usuarios
         */
        Usuario usuario1 = new Usuario("1", "Juan");
        Usuario usuario2 = new Usuario("2", "Pedro");
        /**
         * Registro de los usuarios en la biblioteca
         */
        biblioteca.registrarUsuario(usuario1);
        biblioteca.registrarUsuario(usuario2);
        /**
         * Mostrar el estado inicial de la biblioteca
         */
        System.out.println("----------------------------------------");
        System.out.println("Estado inicial: \n" + biblioteca.toString());
        System.out.println("----------------------------------------");
        /**
         * Prestamo del libro1 al usuario1
         */
        System.out.println("Prestamo del libro1 al usuario2.");
        biblioteca.prestarLibro(libro2, usuario2);
        /**
         * Prestamo del libro2 al usuario2
         */
        System.out.println("Prestamo del libro1 al usuario2.");
        biblioteca.prestarLibro(libro1, usuario2);
        
        //  <-- Aca se compueba la excepcion -->
        /**
         * Intento de préstamo del libro1 al usuario2
        
        System.out.println("\nUsuario 2 intenta prestar el libro1.");
        biblioteca.prestarLibro(libro1, usuario2);
        */

        /**
         * Mostrar el estado de los libros después del préstamo
         */
        System.out.println("----------------------------------------");
        System.out.println("Estado después de los préstamos: \n" + biblioteca.toString());
        System.out.println("----------------------------------------");
        /**
         * Devolución del libro1 por el usuario1
         */
        System.out.println("\nUsuario1 devuelve el libro1.");
        biblioteca.devolverLibro(libro1, usuario1);
        /**
         * Mostrar el estado de la biblioteca después de la devolución
         */
        System.out.println("----------------------------------------");
        System.out.println("Estado después de la devolución: \n" + biblioteca.toString());
        System.out.println("----------------------------------------");
    }
}
