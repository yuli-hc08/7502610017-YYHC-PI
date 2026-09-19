package ProyectoIntegrador;

public class Estudiante {
    public String nombre;
    public int edad;
    public String curso;

    public Estudiante(String nombre, int edad, String curso) {
        this.nombre = nombre;
        this.edad = edad;
        this.curso = curso;
    }

    @Override
    public String toString() {
        return "Estudiante [Nombre: " + nombre + ", Edad: " + edad + ", Curso: " + curso + "]";
    }
}