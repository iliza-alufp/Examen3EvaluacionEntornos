public class Enemigo extends EntidadVideojuego {
    private int id;
    private String tipo;
    private Jugador objetivo;
    private int inteligencia;

    public Enemigo(int id, String tipo, Jugador objetivo) {
    }

    @Override
    public void actualizar(long delta) {
    }

    @Override
    public void dibujar() {
    }

    public void perseguirObjetivo() {
    }

    public void cambiarComportamiento(String nuevoComportamiento) {
    }

    @Override
    public boolean colisionaCon(EntidadVideojuego otra) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'colisionaCon'");
    }
}