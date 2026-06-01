import java.util.List;
import java.util.ArrayList;

/**
 * MotorJuego: controla el bucle principal, actualiza entidades,
 * procesa entradas y gestiona colisiones.
 */
public class MotorJuego {

    private boolean ejecutando;
    private Jugador jugador;
    private List<Enemigo> enemigos;
    private GestorEntradas gestor;

    public MotorJuego() {
        enemigos = new ArrayList<>();
        ejecutando = false;
    }

    /**
     * Inicia el motor y resetea entradas.
     */
    public void iniciar() {
        ejecutando = true;
        if (gestor != null) gestor.reset();
    }

    /**
     * Detiene el bucle principal.
     */
    public void detener() {
        ejecutando = false;
    }

    /**
     * Actualiza jugador, enemigos y colisiones.
     */
    public void actualizar(long delta) {
        if (!ejecutando) return;

        gestor.actualizar();

        jugador.actualizar(delta);

        for (Enemigo e : enemigos) {
            e.actualizar(delta);

            // Colisión global jugador-enemigo
            if (e.colisionaCon(jugador)) {
                jugador.recibirDaño(1);
            }
        }
    }

    /**
     * Llama a los métodos de dibujo de las entidades.
     */
    public void dibujar() {
        jugador.dibujar();
        enemigos.forEach(Enemigo::dibujar);
    }

    public void agregarEnemigo(Enemigo e) { enemigos.add(e); }
    public void setJugador(Jugador j) { this.jugador = j; }
    public void setGestorEntradas(GestorEntradas g) { this.gestor = g; }
    public boolean isEjecutando() { return ejecutando; }
}
    