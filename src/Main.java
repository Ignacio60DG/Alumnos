import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime la edad de un alumno del centro");
        int edad = sc.nextInt();
        int suma = edad;
        int numeroA= 0;
        int Medad=0;
        int medad=0;

        while (edad >= 0) {
            if (edad >= 18) {
                Medad++;
            }else{
                medad++;
            }
            numeroA++;
            System.out.println("El alumno tiene "+edad+" años");
            System.out.println("Dime la siguiente edad");
            edad = sc.nextInt();
            if(edad >= 0) {
                suma = suma+edad;
                System.out.println("La suma es "+suma);
            }
        }
        System.out.println("Edad ultima dada es negativa");
        System.out.println("La media es: "+((float)suma/(float)numeroA)+"años");
        System.out.println("El numero de almnos es: "+numeroA);
        System.out.println("El numero de mayores de edad es: "+Medad);
        System.out.println("El numero de menores: "+medad);
    }
}