import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        GestorTareas gestor = new GestorTareas();
        int opcion = 0;

        while (opcion != 6) {

            System.out.println("\n--- MENU ---");
            System.out.println("1. Crear tarea");
            System.out.println("2. Listar tareas");
            System.out.println("3. Completar primera tarea");
            System.out.println("4. Completar tarea por número");
            System.out.println("5. Eliminar tarea");
            System.out.println("6. Salir");

            System.out.print("Elige una opcion: ");
            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {

                case 1:
                    System.out.print("Titulo: ");
                    String titulo = scanner.nextLine();
                    gestor.agregarTarea(titulo);
                    System.out.println("Tarea agregada!");
                    break;

                case 2:
                    gestor.listarTareas();
                    break;

                case 3:
                    if (gestor.cantidadTareas() > 0) {
                        gestor.completarTarea(0);
                    } else {
                        System.out.println("No hay tareas");
                    }
                    break;

                case 4:
                    System.out.print("Ingrese numero de tarea: ");
                    int num = scanner.nextInt();
                    scanner.nextLine();
                    gestor.completarTarea(num);
                    break;

                case 5:
                    System.out.print("Ingrese numero de tarea a eliminar: ");
                    int elim = scanner.nextInt();
                    scanner.nextLine();
                    gestor.eliminarTarea(elim);
                    break;

                case 6:
                    System.out.println("Chau!");
                    break;

                default:
                    System.out.println("Opcion invalida");
            }
        }
    }
}
