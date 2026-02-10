import java.util.ArrayList;

public class GestorTareas {

    private ArrayList<Tarea> tareas;

    public GestorTareas() {
        this.tareas = new ArrayList<>();
    }

    public void agregarTarea(String titulo) {
        Tarea tarea = new Tarea(titulo);
        tareas.add(tarea);
    }

    public void listarTareas() {
        if (tareas.isEmpty()) {
            System.out.println("No hay tareas");
            return;
        }
        for (int i = 0; i < tareas.size(); i++) {
            System.out.println(i + " - " + tareas.get(i).mostrar());
        }
    }

    public void completarTarea(int indice) {
        if (indice >= 0 && indice < tareas.size()) {
            tareas.get(indice).completar();
            System.out.println("Tarea completada!");
        } else {
            System.out.println("Indice invalido");
        }
    }

    public void eliminarTarea(int indice) {
        if (indice >= 0 && indice < tareas.size()) {
            tareas.remove(indice);
            System.out.println("Tarea eliminada!");
        } else {
            System.out.println("Indice invalido");
        }
    }

    public int cantidadTareas() {
        return tareas.size();
    }
}
