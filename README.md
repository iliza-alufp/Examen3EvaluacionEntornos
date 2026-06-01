# Examen3EvaluacionEntornos

Proyecto de ejemplo: motor sencillo para un juego tipo Pac‑Man. Contiene clases básicas para el bucle de juego, entradas, entidades (jugador y enemigos) e interacción simple.

## Estructura principal
- Main.java (clase Main): bucle principal, inicializa MotorJuego, GestorEntradas, Jugador y Enemigos.
- MotorJuego.java: controla el bucle, actualiza entidades, procesa entradas y gestiona colisiones.
- EntidadVideojuego.java: clase abstracta base con posición, tamaño, velocidad y colisión AABB.
- Jugador.java: controla al jugador mediante GestorEntradas, movimiento, vida y puntuación.
- Enemigo.java: IA básica (patrullar, perseguir, atacar) y detección de colisiones con el jugador.
- GestorEntradas.java: gestor de teclado simple (array de 256 códigos), métodos para notificar pulsado/liberado y consultar estado.


## Compilar y ejecutar (Windows / terminal)
1. Abrir PowerShell o CMD en la carpeta del proyecto:
   cd /d d:\DATA2\Examen3EvaluacionEntornos
2. Compilar todos los .java y colocar clases en `out`:
   javac -d out *.java
3. Ejecutar (suponiendo clase Main en paquete por defecto):
   java -cp out Main

## Ejecución en IDE (VS Code)
- Abrir la carpeta del proyecto.
- Asegurar que los archivos .java compilan (Problems).
- Ejecutar la clase Main desde el explorador de código o usando la configuración de ejecución de Java.


Promts uso de la IA

  1 Genera los archivos Java para las siguientes clases,  teniendo en cuenta que es para un juego tipo pacman :
Main
MotorJuego
EntidadVideojuego (abstracta)
Jugador
Enemigo
GestorEntradas
Cada archivo debe contener:
nombre de la clase
atributos declarados
métodos declarados (solo firma)
No generes código dentro de los métodos.  
No implementes lógica.



2 implementa los metodos dentro de la clase motorJuego

3implementa en Enemigo los metodo. Haz que se recorran entidades, actualizen su estado y detecten colisiones.
 
implementa los metodos de entidad videojuego teniendo en cuenta la estructura general del juego

Implementa los metodos de gestor de entradas


Genera los métodos del main

Refactoriza el código de todas las clases

 
