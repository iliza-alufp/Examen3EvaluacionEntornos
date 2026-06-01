/**
 * Clase Jugador: controlado por el usuario mediante GestorEntradas.
 * Puede moverse, recibir daño y sumar puntuación.
 */
public class Jugador extends EntidadVideojuego {

    private int vidas;
    private int puntuacion;
    private GestorEntradas gestor;

    public Jugador(GestorEntradas gestor) {
        this.gestor = gestor;
        this.vidas = 3;
        this.puntuacion = 0;

        this.ancho = 16;
        this.alto = 16;
        this.velocidad = 3;
        this.activo = true;
    }

    /**
     * Actualiza el movimiento del jugador según las teclas pulsadas.
     */
    @Override
    public void actualizar(long delta) {
        gestor.actualizar();

        int dx = 0, dy = 0;

        // Flechas y WASD
        if (gestor.estaTeclaPulsada(37) || gestor.estaTeclaPulsada(65)) dx -= velocidad;
        if (gestor.estaTeclaPulsada(39) || gestor.estaTeclaPulsada(68)) dx += velocidad;
        if (gestor.estaTeclaPulsada(38) || gestor.estaTeclaPulsada(87)) dy -= velocidad;
        if (gestor.estaTeclaPulsada(40) || gestor.estaTeclaPulsada(83)) dy += velocidad;

        mover(dx, dy);
    }

    /**
     * Mueve al jugador y evita que salga del mapa.
     */
    private void mover(int dx, int dy) {
        this.x = Math.max(0, this.x + dx);
        this.y = Math.max(0, this.y + dy);
    }

    /**
     * Resta vidas al jugador.
     */
    public void recibirDaño(int cantidad) {
        vidas -= cantidad;
        if (vidas <= 0) {
            activo = false;
        }
    }

    @Override
    public void dibujar() {
        // No implementado
    }
}
    