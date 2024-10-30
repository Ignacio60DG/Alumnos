import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime la edad de un alumno del centro");
        int edad = sc.nextInt();
        int edadTotal = edad;
        int numeroA= 0;
        int Medad=0;
        int medad=0;

        while (edad >= 0 && edad <= 110) {
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
                edadTotal = edadTotal+edad;
                System.out.println("La suma es "+edadTotal);
            }
        }
        if(edad<0){
        System.out.println("Edad ultima dada es negativa");
        System.out.println("La media es: "+((float)edadTotal/(float)numeroA)+" años");
        System.out.println("El numero de almnos es: "+numeroA);
        System.out.println("El numero de mayores de edad es: "+Medad);
        System.out.println("El numero de menores: "+medad);
        }else{
            System.out.println("El numero de almnos es demasiado grande");
        }
    }
}