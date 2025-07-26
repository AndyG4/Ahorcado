
import java.io.BufferedReader;
import java.nio.Buffer;



public class Tablero {
    private Paises paises;
    private String palabra = "";
    private String guiones = "";
    private static int vidas = 6; // Número de intentos permitidos

    public Tablero() {
        this.paises = new Paises();
    }
    public void guiones(){
        this.palabra = paises.ranPais();
    }
    public String getPalabra() {
        if(this.palabra.isEmpty()) {
            guiones();
        }
        return this.palabra;
    }
    public void setPalabra(String palabra) {
        this.palabra = palabra;
    }
    public String getGuiones() {
        if(this.palabra.isEmpty()) {
            guiones();
        }
        if(this.guiones.isEmpty()) {
            this.guiones = "_".repeat(this.palabra.length());
        }
        return this.guiones;
    }
    public void imprimirGuiones() {
        if(this.guiones.isEmpty()) {
            getGuiones();
        }
        System.out.print(this.getGuiones());
        System.out.flush();
    }

    public void entrada(){
        BufferedReader reader = new BufferedReader(new java.io.InputStreamReader(System.in));
        System.out.print("\nIngrese una letra: ");
        try {
            String input = reader.readLine();
            if (input != null && !input.isEmpty()) {
                char letra = input.charAt(0);
                verificarLetra(letra);
            } else {
                System.out.println("Entrada inválida. Por favor, ingrese una letra.");
            }
        } catch (Exception e) {
            System.out.println("Error al leer la entrada: " + e.getMessage());
        }
    }
    public void verificarLetra(char letra) {
        StringBuilder nuevoGuion = new StringBuilder(this.guiones);
        boolean encontrado = false;

        for (int i = 0; i < this.palabra.length(); i++) {
            if (this.palabra.charAt(i) == letra) {
                nuevoGuion.setCharAt(i, letra);
                encontrado = true;
            }
        }

        if (encontrado) {
            this.guiones = nuevoGuion.toString();
            System.out.println("¡Correcto! La letra '" + letra + "' está en la palabra.");
        } else {
            System.out.println("Incorrecto. La letra '" + letra + "' no está en la palabra.");
            vidas--;
            System.out.println("Te quedan " + vidas + " vidas.");
        }

        imprimirGuiones();
        
    }
    public static int getVidas() {
        return vidas;
    }
    

    
}
