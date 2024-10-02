import java.util.ArrayList;
import java.util.Scanner;

public class Funciones {
    private static ArrayList<Persona> listaPar = new ArrayList<>();

    public static void  pausar() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Presione Enter para continuar...");
        scanner.nextLine();

    }

    public static void agregar(){

        String input=null;
        float numero=0;
        String nombre=ValidacionTry.Letras(input,"nombre");
        String apellido=ValidacionTry.Letras(input,"apellido");
        float  nota=ValidacionTry.NumerosFLoat(numero);
        listaPar.add(new Persona(nombre,apellido,nota));
    }
    public static void mostrar(){

        if (listaPar.isEmpty()){
            System.out.println("No hay nadie agregado");
            pausar();
        }else {
            listaPar.forEach(System.out::println);
            pausar();
        }
    }
    public static void eliminar(){

        if (listaPar.isEmpty()){
            System.out.println("No hay nadie agregado");
            pausar();

        }else {
            for (Persona par : listaPar) {
                System.out.println(par);
            }
            String input=null;
            String n=ValidacionTry.Letras(input,"nombre");
            for(int i = 0; i < listaPar.size(); i++){
                if (listaPar.get(i).Nombre.equalsIgnoreCase(n)){
                    listaPar.remove(i);
                    System.out.println("La persona " + n + " ha sido eliminada.");
                    pausar();
                }



            }
        }
    }
    public static void actualizar(){
        Scanner scanner= new Scanner(System.in);
        if (listaPar.isEmpty()) {
            System.out.println("No hay nadie agregado");
            pausar();
        } else {

            for (Persona par : listaPar) {
                System.out.println(par);
            }
            String input=null;
            String nombre_actualizar =ValidacionTry.Letras(input,"nombre de la persona que desea actualizar");
            boolean encontrado = false;
            for (int i = 0; i < listaPar.size(); i++) {
                Persona persona = listaPar.get(i);
                float numero=0;
                if (persona.Nombre.equalsIgnoreCase(nombre_actualizar)) {
                    encontrado = true;
                    int opcion=0;
                    opcion=ValidacionTry.opciones2(opcion);
                    scanner.nextLine();
                    switch (opcion) {
                        case 1:
                            String nombre_new = ValidacionTry.Letras(input,"nombre");
                            persona.Nombre = nombre_new;
                            break;
                        case 2:
                            String apellido_new = ValidacionTry.Letras(input,"apellido");
                            persona.Apellido = apellido_new;
                            break;
                        case 3:
                            Float nota_new = ValidacionTry.NumerosFLoat(numero);
                            persona.nota = nota_new;
                            break;
                        case 4:
                            nombre_new = ValidacionTry.Letras(input,"nombre");
                            apellido_new = ValidacionTry.Letras(input,"apellido");
                            nota_new = ValidacionTry.NumerosFLoat(numero);
                            persona.Nombre = nombre_new;
                            persona.Apellido = apellido_new;
                            persona.nota = nota_new;
                            break;
                        case 5:
                            System.out.println("Volviendo al menu...");
                            pausar();
                        default:
                            System.out.println("Opción no válida.");
                    }
                    break;
                }
            }
            if (!encontrado) {
                System.out.println("No existe esa persona.");
            }
            pausar();
        }
    }
    public static void buscar(){

        if (listaPar.isEmpty()){
            System.out.println("No hay nadie agregado");
            pausar();

        }else {
            String input=null;
            String nombre_buscar=ValidacionTry.Letras(input,"nombre de la persona que desea buscar:").toLowerCase();
            for(int i = 0; i < listaPar.size(); i++){
                Persona persona =listaPar.get(i);

                if (persona.Nombre.toLowerCase().startsWith(nombre_buscar)){
                    System.out.println("Nombre:"+persona.Nombre);
                    System.out.println("Apellido:"+persona.Apellido);
                    System.out.println("Nota:"+persona.nota+"\n----------------");
                }else{
                    System.out.println("No existe");
                    pausar();
                }
            }
            pausar();

        }
    }
}
