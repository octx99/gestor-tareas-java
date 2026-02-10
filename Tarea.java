public class Tarea {

    private String titulo;
    private boolean completada;

    public Tarea(String titulo) {
        this.titulo = titulo;
        this.completada = false;
    }

    public String getTitulo() {
        return titulo;
    }

    public boolean isCompletada() {
        return completada;
    }

    public void completar() {
        this.completada = true;
    }

    public String mostrar() {
        if (completada) {
            return "[x] " + titulo;
        } else {
            return "[ ] " + titulo;
        }
    }

}

