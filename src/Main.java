import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        while (true){
            System.out.println("--MENU-- \n1.Guardar\n2.Mostrar\n3.Eliminar\n4.Actualizar\n5.Buscar\n6.Salir");
            int r = 0;
            r=ValidacionTry.Opciones(r);
            switch (r){
                case 1:
                    Funciones.agregar();
                    break;
                case 2:
                    Funciones.mostrar();
                    break;
                case 3:
                    Funciones.eliminar();
                    break;
                case 4:
                    Funciones.actualizar();
                    break;
                case 5:
                    Funciones.buscar();
                    break;
                case 6:
                    break;
                default:
                    System.out.println("Ingrese una opcion que este en el menu");
                    Funciones.pausar();
            }
        }
    }
}
