
package refugio;

public class MainRefugioCanino {

    public static void main(String[] args) {
        System.out.println("Bienvenido al refugio torres");

        
        // Crear una instancia del refugio
        RefugioCanino refugio = new RefugioCanino();

        // Agregar algunos perros al refugio
        refugio.agregarPerro("Max", "Golden Retrieve");
        refugio.agregarPerro("Bella", "Pastor Alemán");
        refugio.agregarPerro("Coco", "Pastor Alemán");

        // Mostrar la lista de perros en el refugio
        System.out.println("\nLista de perros en el refugio:");
        refugio.mostrarPerros();

        // Obtener y mostrar el número de perros en el refugio
        int numeroDePerros = refugio.obtenerNumeroDePerros();
        System.out.println("\nNúmero de perros en el refugio: " + numeroDePerros);

    }
}
