package boletin9_5;

import java.util.Scanner;

/**
 *
 * @author oracle
 */
public class Serie {
    
    private int numElementos = -1;
    Scanner sc = new Scanner(System.in);
    
    public int pedirDatos(){
        while(numElementos <= 0){
            System.out.println("Teclea un número de elementos:");
            numElementos = sc.nextInt();
        }
        return numElementos;
    }
    
    public void devolverSeries(){
        String a = "0";
        String b = "- 1";
        String c = "0";
        
        int num = 0;
        numElementos = pedirDatos();
        for (int i = numElementos; i > 1; i--) {
            
            num = num + 2;
            a = a + " + " +num;
        }
        System.out.println("\na) "+a+" .....");
        
        num = 1;
        for (int i = numElementos; i > 1; i--) {
            num++;
            if (num % 2 == 0) {
               b = b + " + " +num; 
            }
            else{
               b = b + " - " +num; 
            }
        }
        System.out.println("\nb) "+b+" .....");
       
        int num1 = 1;
        num = 0;
        for (int i = 0; i < numElementos; i++) {
            num =num+ num1;
            num1 =num- num1;
            c = c + " , " +num;
            
        }
        System.out.println("\nc) "+c+" .....");
    }
}

