// Clase Rueda
class Rueda {
    public void girar() {
    System.out.println("La rueda gira.");
    }
    }
    // Clase Bicicleta que tiene una o más Ruedas
    class Bicicleta {
    private Rueda ruedaDelantera;
    private Rueda ruedaTrasera;
    public Bicicleta(Rueda ruedaDelantera, Rueda ruedaTrasera) {
    this.ruedaDelantera = ruedaDelantera;
    this.ruedaTrasera = ruedaTrasera;
    }
    public void mover() {
    ruedaDelantera.girar();
    ruedaTrasera.girar();
    System.out.println("La bicicleta se mueve.");
    }
}