package ProyectoIntegrador;

public class Libro {
    public String titulo;
    public String autor;
    public int numeroPaginas;

    public Libro(String titulo, String autor, int numeroPaginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.numeroPaginas = numeroPaginas;
    }

    @Override
    public String toString() {
        return "Libro [Título: " + titulo + ", Autor: " + autor + ", Páginas: " + numeroPaginas + "]";
    }
}