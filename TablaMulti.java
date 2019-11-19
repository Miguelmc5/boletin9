package boletin9_4;
import java.util.*;
/**
 *
 * @author oracle
 */
public class TablaMulti {
   
    Scanner sc= new Scanner(System.in);
   
    private int numero;
    
    public int pedirDatos(){
        System.out.println("Teclea un número:");
        numero = sc.nextInt();
        return numero;
    }
    
    public void tablaMultiplicar(){
        numero = pedirDatos();
        for (int i = 0; i < 11; i++) {
            System.out.println(numero+" * "+i+" es "+numero*i);
        }
    }
}
