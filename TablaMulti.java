package boletin9_4;
import java.util.*;
/**
 *
 * @author oracle
 */
public class TablaMulti {
   
    Scanner sc= new Scanner(System.in);
    private int contador=0;
    private int numero;
    private int tabla;
    
    public int PedirDato(){
       System.out.println("Dime un número");
             
            return numero;
    }
    
    
    public void Multiplicar(){
        
        while(contador<11){
        
            numero.PedirDato();
            if (numero!=0){
                tabla=numero*contador;
            contador ++;
            }
            else 
            System.out.println("FIN");
        }
        System.out.println(tabla);
    }
}
