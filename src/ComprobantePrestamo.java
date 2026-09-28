public class ComprobantePrestamo {
    Libro libro;
    Socio socio;

    public ComprobantePrestamo(Libro libro, Socio socio) {
        this.libro = libro;
        this.socio = socio;
    }

    public void mostrarComprobante() {
        System.out.println("----- COMPROBANTE DE PRÉSTAMO -----");
        System.out.println("Libro: " + libro.titular);
        System.out.println("Autor: " + libro.autor);
        System.out.println("Socio: " + socio.nombre);
        System.out.println("Número de socio: " + socio.numeroSocio);
    }
}
