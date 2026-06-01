public class main {
private static MotorJuego motor;

    public static void main(String[] args) {

        iniciar();

        long ultimo = System.currentTimeMillis();

        // Bucle principal
        while (motor.isEjecutando()) {

            long ahora = System.currentTimeMillis();
            long delta = ahora - ultimo;
            ultimo = ahora;

            motor.actualizar(delta);
            motor.dibujar();

            try { Thread.sleep(16); } 
            catch (InterruptedException e) { break; }
        }
    }

    /**
     * Inicializa el motor, jugador, entradas y enemigos.
     */
    public static void iniciar() {
        motor = new MotorJuego();

        GestorEntradas gestor = new GestorEntradas();
        motor.setGestorEntradas(gestor);

        Jugador jugador = new Jugador(gestor);
        jugador.setPosicion(100, 100);
        motor.setJugador(jugador);

        motor.agregarEnemigo(new Enemigo("rojo", jugador));
        motor.agregarEnemigo(new Enemigo("azul", jugador));

        motor.iniciar();
    }
}
       