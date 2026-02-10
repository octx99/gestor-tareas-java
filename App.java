import java.util.ArrayList;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ArrayList<Tarea> tareas = new ArrayList<>();

        int opcion = 0;

        while (opcion != 6) {

            System.out.println("\n--- MENU ---");
            System.out.println("1. Crear tarea");
            System.out.println("2. Listar tareas");
            System.out.println("3. Completar primera tarea");
            System.out.println("4. Completar por numero");
            System.out.println("5. Eliminar tarea");
            System.out.println("6. Salir");

            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {

                case 1:
                    System.out.print("Titulo: ");
                    String titulo = scanner.nextLine();

                    Tarea tarea = new Tarea(titulo);
                    tareas.add(tarea);

                    System.out.println("Guardada!");
                    break;

                case 2:
                    for (int i = 0; i < tareas.size(); i++) {
                        System.out.println(i + " - " + tareas.get(i).mostrar());
                    }
                    break;

                case 3:
                    if (!tareas.isEmpty()) {
                        tareas.get(0).completar();
                        System.out.println("Primera tarea completada");
                    }
                    break;

                case 4:
                    if (tareas.isEmpty()) {
                        System.out.println("No hay tareas");
                        break;
                    }

                    System.out.println("Ingrese numero de tarea: ");
                    int numero = scanner.nextInt();
                    scanner.nextLine();

                    if (numero >= 0 && numero < tareas.size()) {
                        tareas.get(numero).completar();
                        System.out.println("Tarea completada!");
                    } else {
                        System.out.println("Numero invalido");
                    }
                    break;
                case 5:
                    System.out.print("Numero a eliminar: ");
                    int n = scanner.nextInt();
                    scanner.nextLine();

                    if (n >= 0 && n < tareas.size()){
                        tareas.remove(n);
                        System.out.println("Eliminada!");
                    }
                    break;

                case 6:
                    System.out.println("Chau!");
                    break;
            }
        }
    }
}
