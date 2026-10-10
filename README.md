<img width="493" height="240" alt="WhatsApp Image 2026-09-28 at 16 05 52" src="https://github.com/user-attachments/assets/4042c0a3-232b-4157-a5be-bdf8985303a6" />

 Biblioteca y Préstamo de Libros

 Descripción
Este proyecto consiste en un sistema en Java que permite gestionar el préstamo de libros en una biblioteca. El socio solicita un libro y la biblioteca verifica si está disponible para realizar el préstamo.

Clases
- **Libro:** guarda el título, el autor y la disponibilidad del libro.
- **Socio:** contiene el nombre y el número de socio de la persona que solicita el préstamo.
- **Biblioteca:** recibe la solicitud mediante el método `prestarLibro(Libro libro, Socio socio)`, verifica si el libro está disponible y decide si acepta o rechaza la operación.
- **ComprobantePrestamo:** representa el comprobante que se entrega cuando el préstamo se realiza correctamente.

 Funcionamiento
En el `main` se crean los libros, los socios y la biblioteca. Luego, se simulan dos solicitudes: una exitosa, cuando el libro está disponible, y otra fallida, cuando el libro no está disponible.

 Recorrido del mensaje
1. El programa crea los objetos necesarios para realizar los préstamos.
2. El socio solicita un libro a la biblioteca.
3. La biblioteca recibe el mensaje mediante el método `prestarLibro()` y verifica la disponibilidad del libro.
4. Si el libro está disponible, la biblioteca cambia su estado a no disponible y devuelve un objeto `ComprobantePrestamo`.
5. Si el libro no está disponible, la biblioteca rechaza la solicitud y devuelve `null`.
6. El socio recibe la respuesta y el programa muestra por consola si el préstamo fue aceptado o rechazado.

Objetivo
Practicar la comunicación entre objetos en Java, el envío de objetos como parámetros, el retorno de objetos como respuesta y la validación de condiciones para realizar una operación.
