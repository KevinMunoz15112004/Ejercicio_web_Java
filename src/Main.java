import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Ejercicio_desplazamiento ejercicio = new Ejercicio_desplazamiento();
        boolean continuar;

        do{
            continuar = true;
            try {
                System.out.println("Ingrese el tiempo en segundos: ");
                int tiempo = sc.nextInt();
                ejercicio.setN(tiempo);

                if (tiempo <= 0){
                    System.out.println("Ingrese un número válido para el tiempo ");
                    continuar = false;
                }
            }
            catch (InputMismatchException e){
                System.out.println("Error: Entrada no válida, ingrese un número correcto para calcular el tiempo");
                sc.nextLine();
                continuar = false;
            }
        }while(!continuar);

        ejercicio.imprimir();
        sc.close();

    }
}