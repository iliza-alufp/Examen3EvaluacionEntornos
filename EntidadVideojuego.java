public abstract class EntidadVideojuego {
    protected int x;
    protected int y;
    protected int ancho;
    protected int alto;
    protected int velocidad;
    protected boolean activo;

    public abstract void actualizar(long delta);

    public abstract void dibujar();

    public abstract boolean colisionaCon(EntidadVideojuego otra);

    public void setPosicion(int x, int y) {
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}
