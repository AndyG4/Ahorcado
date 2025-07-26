#  Juego del Ahorcado en Java

Este es un pequeño proyecto en Java que simula el clásico juego del ahorcado, usando nombres de países.

## ¿Qué hace?

- Selecciona un país al azar.
- Muestra un tablero con guiones por cada letra.
- El jugador tiene que adivinar el país letra por letra.
- Se lleva un conteo de intentos fallidos.
- El juego termina cuando se adivina todo el país o se acaban los intentos.

##  Archivos

- `App.java`: contiene el método `main` y el flujo principal del juego.
- `Tablero.java`: maneja el estado del tablero, las letras adivinadas y los intentos.
- `Paises.java`: contiene una lista de países desde donde se elige uno al azar.

##  Cómo correrlo

Compila y ejecuta desde terminal o tu IDE favorito:

```bash
javac App.java Tablero.java Paises.java
java App
