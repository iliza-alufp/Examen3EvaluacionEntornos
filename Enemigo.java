/**
 * Clase Enemigo: representa un NPC hostil con IA básica.
 * Estados: Patrullar, Perseguir, Atacar.
 * Cambia de estado según la distancia al jugador.
 */
public class Enemigo extends EntidadVideojuego {

    // Estados posibles de la IA
    public enum EstadoIA { PATRULLAR, PERSEGUIR, ATACAR }

    private EstadoIA estado;
    private Jugador objetivo;

    /**
     * Constructor del enemigo.
     * @param nombre nombre o tipo del enemigo.
     * @param objetivo referencia al jugador para la IA.
     */
    public Enemigo(String nombre, Jugador objetivo) {
        this.nombre = nombre;
        this.objetivo = objetivo;

        this.ancho = 16;
        this.alto = 16;
        this.velocidad = 2;
        this.activo = true;

        this.estado = EstadoIA.PATRULLAR;
    }

    /**
     * Actualiza la IA del enemigo según su estado.
     */
    @Override
    public void actualizar(long delta) {
        if (!activo) return;

        // Cambiar estado según distancia al jugador
        cambiarEstadoSegunDistancia();

        // Ejecutar comportamiento según estado
        switch (estado) {
            case PATRULLAR -> patrullar();
            case PERSEGUIR -> perseguir();
            case ATACAR -> atacar();
        }
    }

    /**
     * Determina el estado de IA según la distancia al jugador.
     */
    private void cambiarEstadoSegunDistancia() {
        int dx = Math.abs(objetivo.getX() - this.x);
        int dy = Math.abs(objetivo.getY() - this.y);
        int dist = dx + dy;

        if (dist > 200) estado = EstadoIA.PATRULLAR;
        else if (dist > 40) estado = EstadoIA.PERSEGUIR;
        else estado = EstadoIA.ATACAR;
    }

    /**
     * Movimiento aleatorio simple.
     */
    private void patrullar() {
        this.x += (Math.random() > 0.5 ? velocidad : -velocidad);
    }

    /**
     * Movimiento hacia el jugador.
     */
    private void perseguir() {
        int dx = objetivo.getX() - this.x;
        int dy = objetivo.getY() - this.y;

        this.x += Integer.signum(dx) * velocidad;
        this.y += Integer.signum(dy) * velocidad;
    }

    /**
     * Ataca al jugador si colisiona con él.
     */
    private void atacar() {
        if (colisionaCon(objetivo)) {
            objetivo.recibirDaño(1);
        }
    }

    @Override
    public void dibujar() {
        // No implementado (solo placeholder)
    }
}
   