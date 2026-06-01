public class Jugador extends EntidadVideojuego {
    private int vidas;
    private int puntuacion;
    private GestorEntradas gestorEntradas;

    public Jugador(GestorEntradas gestor) {
    }

    @Override
    public void actualizar(long delta) {
    }

    @Override
    public void dibujar() {
    }

    public void mover(int dx, int dy) {
    }

    public void comerPunto() {
    }

    public void recibirDaño(int cantidad) {
    }

    public int getVidas() {
        return vidas;
    }

    public int getPuntuacion() {
        return puntuacion;
    }

    @Override
    public boolean colisionaCon(EntidadVideojuego otra) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'colisionaCon'");
    }
}