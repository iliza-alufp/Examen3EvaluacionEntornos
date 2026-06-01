/**
 * Clase base abstracta para cualquier entidad del videojuego.
 * Contiene posición, tamaño, velocidad, estado y nombre/imagen.
 * Todas las entidades deben implementar actualizar(), dibujar() y colisionaCon().
 */
public abstract class EntidadVideojuego {

    // Posición en el mundo del juego
    protected int x;
    protected int y;

    // Tamaño del sprite o hitbox
    protected int ancho;
    protected int alto;

    // Velocidad de movimiento
    protected int velocidad;

    // Indica si la entidad está activa (viva, visible, etc.)
    protected boolean activo;

    // Nombre o tipo de entidad (requisito del enunciado)
    protected String nombre;

    // Imagen o sprite asociado (solo referencia, no se renderiza)
    protected String imagen;

    /**
     * Método que actualiza el estado interno de la entidad.
     * @param delta tiempo transcurrido desde el último frame.
     */
    public abstract void actualizar(long delta);

    /**
     * Método de dibujo. No implementa render real, solo punto de extensión.
     */
    public abstract void dibujar();

    /**
     * Detecta colisión con otra entidad usando AABB (Axis-Aligned Bounding Box).
     */
    public boolean colisionaCon(EntidadVideojuego otra) {
        if (otra == null) return false;

        return !(this.x + this.ancho <= otra.x ||
                 this.x >= otra.x + otra.ancho ||
                 this.y + this.alto <= otra.y ||
                 this.y >= otra.y + otra.alto);
    }

    // Métodos auxiliares
    public void setPosicion(int x, int y) { this.x = x; this.y = y; }
    public int getX() { return x; }
    public int getY() { return y; }
    public int getAncho() { return ancho; }
    public int getAlto() { return alto; }
    public boolean isActivo() { return activo; }
}
    