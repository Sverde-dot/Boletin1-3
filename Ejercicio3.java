/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.pkg3;

import java.util.Scanner;

/**
 *
 * @author sverdecadilla
 */
public class Ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Dame los rublos que quieres convertir: ");
        float eulos = sc.nextFloat();
        float dollars = eulos *1.10f;
        System.out.println("Tienes = "+dollars+"$");
    
    }
    
}
