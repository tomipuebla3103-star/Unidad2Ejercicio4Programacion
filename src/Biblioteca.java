public class Biblioteca {
    public ComprobantePrestamo prestarLibro(Libro libro, Socio socio) {

        if (libro.disponiblidad) {

            libro.disponiblidad= false;

            System.out.println("Préstamo realizado correctamente.");

            return new ComprobantePrestamo(libro, socio);

        } else {

            System.out.println("El libro no está disponible.");

            return null;
        }
    }
}
