
package boletin12;

public class Garaje {
    private int numCoches;
    private final int capacidad = 5;
    private Coches coche = new Coches();

    public void validar() {
        numCoches = 0;
        do {
            numCoches++;
            System.out.println("Plaza Disponible!");
            coche.pedirDatos();
            coche.amosar();
        } while (numCoches < 5);
        System.out.println("COMPLETO");
    }
}

