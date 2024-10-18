class Motor {
    public void encender() {
    System.out.println("El motor se enciende.");
    }
    }
    // Clase Auto que depende de Motor
    class Auto {
    public void arrancar() {
    Motor motor = new Motor(); // Dependencia
    motor.encender();
    System.out.println("El auto está en marcha.");
    }
    }
    