package Ejercicio1;

public class Libro {
    public String titulo;
    public String autor;
    public int numeroPaginas;

    // 1. Constructor por defecto
    public Libro() {
        this.titulo = "Sin título";
        this.autor = "Anónimo";
        this.numeroPaginas = 0;
    }

    // 2. Constructor parametrizado
    public Libro(String titulo, String autor, int numeroPaginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.numeroPaginas = numeroPaginas;
    }

    // Método para mostrar los detalles del libro
    public void mostrarInformacion() {
        System.out.println("Libro: " + titulo + " | Autor: " + autor + " | Páginas: " + numeroPaginas);
    }
}