
import java.util.Scanner;
public class DetectorDeCifras {
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        int num;

        System.out.println("Ingrese un numero para detectar el numero de cifras que posee");
        num = tec.nextInt();

        if(num < 0 || num > 99999 ){
            System.out.println("El numero ingresado, no estra en el rango del programa");
        }
        else if(num <= 9){
            System.out.println("El numero ingresado tiene: 1 cifra");
        }
        else if(num <= 99){
            System.out.println("El numero ingresadoo tiene: 2 cifras");
        }
        else if(num <= 999){
            System.out.println("El numero ingresado tiene: 3 cifras");
        }
        else if(num <= 9999){
            System.out.println("El numero ingresado tiene: 4 cifras");
        }
        else{
            System.out.println("El numero ingresado tiene: 5 cifras");
        }
    }
}