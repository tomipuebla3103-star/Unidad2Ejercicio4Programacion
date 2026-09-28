//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    Libro libro1 = new Libro(
            "El Principito",
            "Antoine de Saint-Exupéry",
            true
    );

    Libro libro2 = new Libro(
            "Harry Potter",
            "J.K. Rowling",
            false
    );

    Socio socio1 = new Socio("Tomi", 101);

    Biblioteca biblioteca = new Biblioteca();


    ComprobantePrestamo comprobante1 =
            biblioteca.prestarLibro(libro1, socio1);

    if (comprobante1 != null) {
        comprobante1.mostrarComprobante();
    }

    System.out.println();

    ComprobantePrestamo comprobante2 =
            biblioteca.prestarLibro(libro2, socio1);

    if (comprobante2 == null) {
        System.out.println("No se pudo realizar el préstamo.");
    }
}

