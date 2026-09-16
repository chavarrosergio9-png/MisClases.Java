public class AppLibro {
    public static void main(String[] args) throws Exception {
        Libro libroVacio = new Libro();
        Libro libroBasico = new Libro("Cien anos de soledad", "Gabriel Garcia Marquez");
        Libro libroCompleto = new Libro("El principito", "Antoine de Saint-Exupery", false);

        libroVacio.mostrarInfo();
        libroBasico.mostrarInfo();
        libroCompleto.mostrarInfo();
    }
}
*/

