public class App {
    private static final String VERSION = "1.0.0";
    private static final String AUTHOR = "Andres Alfredo Ferreyra Ruiz";
    private static final String DESCRIPTION = "Juego del ahorcado con nombres de países de América Latina.";
    private static final String LICENSE = "MIT License";
    private static final String LICENSE_URL = "https://opensource.org/license/mit/";

    private static Tablero tablero = new Tablero();

    /**
     * Main method to run the application.
     * 
     * @param args Command line arguments
     * @throws Exception If an error occurs during execution
     */




    public static void main(String[] args) throws Exception {
    System.out.println("Bienvenido al juego del ahorcado");
    System.out.println("Versión: " + VERSION);
    System.out.println("Autor: " + AUTHOR);
    System.out.println("Descripción: " + DESCRIPTION);
    System.out.println("Licencia: " + LICENSE);

    tablero.imprimirGuiones();
    while (!tablero.getGuiones().equals(tablero.getPalabra()) && tablero.getVidas() > 0) {
        tablero.entrada();
    }
}
}
