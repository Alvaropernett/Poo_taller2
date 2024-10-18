class Vehiculo {
public void mover() {
System.out.println("El vehículo se está moviendo.");
}
}
// Clase derivada Coche que hereda de Vehiculo
class Coche extends Vehiculo {
public void tocarBocina() {
System.out.println("El coche toca la bocina.");
}
}