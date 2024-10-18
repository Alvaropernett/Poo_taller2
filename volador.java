// Interfaz Volador
interface Volador {
    void volar();
    }
    // Clase Avion que implementa Volador
    class Avion implements Volador {
    @Override
    public void volar() {
    System.out.println("El avión está volando.");
    }
    }
