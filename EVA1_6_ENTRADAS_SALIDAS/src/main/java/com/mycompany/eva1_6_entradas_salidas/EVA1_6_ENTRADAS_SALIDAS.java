/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva1_6_entradas_salidas;

import java.util.Scanner;

/**
 *
 * @author saulf
 */
public class EVA1_6_ENTRADAS_SALIDAS {

    public static void main(String[] args) {
        String marca;
        String modelo;
        int año;
        double precio;
        Scanner input = new Scanner(System.in); 
        
        System.out.println("Introduce la marca del vehiculo");
        marca = input.nextLine();
        System.out.println("Introuce el modelo de tu vehiculo");
        modelo = input.nextLine();
        System.out.println("Introcue el año de tu vehiculo");
        año = input.nextInt();
        System.out.println(marca);
        System.out.println(modelo);
        System.out.println(año);
        
        
       
       
        
       
    }
}

