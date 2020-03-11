/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package saluda;

import java.util.Scanner;

/**
 *
 * @author Alumno
 */
public class Saluda {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca su Nombre");
        String Nombre = sc.nextLine();
        System.out.println("introduze Edad");
        int edad=sc.nextInt();
          System.out.println("Hola: "+Nombre+" Tienes: "+edad+" "+"Años");
      
    }

}
