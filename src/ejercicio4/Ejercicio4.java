/*
 * Escribir un programa que lea un número entero por teclado y muestre por pantalla el doble, el triple y la raíz cuadrada de ese número. 

 */
package ejercicio4;

import java.util.Scanner;


public class Ejercicio4 {

   
    public static void main(String[] args) {
       Scanner numero = new Scanner(System.in);
     int num;
     int doble;
     int triple;
     double raiz;      
     
     System.out.println("ingrese un numero por teclado");
     num =numero.nextInt();
     doble=num*2;
     triple=num*3;
     raiz=Math.sqrt(num);
        System.out.println(raiz);
             
        
    }
    
}
