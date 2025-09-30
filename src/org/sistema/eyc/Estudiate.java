package src.org.sistema.eyc;

public class Estudiate {
    private String nombre;
    private Curso curso;

 public Estudiate(String nombre, Curso curso) {
    this.nombre = nombre;
    this.curso = curso;
    
    }

    public Estudiate(String nombre) {
    this.nombre = nombre;
    this.curso = null;
   }

    public String getInfoEstudiate() {
        String info = "Estudiate: " + nombre;
        if (curso != null) {
            info += ", Curso: " + curso.getNombreCurso() + ", Créditos: " + curso.getCreditos();
        } else {
            info += ", Curso: No asignado";
        }
        return info;
    }

    @Override
    public String toString() {
        return getInfoEstudiate();
    }

    public String getNombre() {
    return nombre;
}

public void setNombre(String nombre) {
    this.nombre = nombre;
}

public Curso getCurso() {
    return curso;
}

public void setCurso(Curso curso) {
    this.curso = curso;
}






}