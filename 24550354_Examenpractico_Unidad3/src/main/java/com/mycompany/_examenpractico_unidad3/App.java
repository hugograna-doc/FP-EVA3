/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany._examenpractico_unidad3;

import java.util.Scanner;

/**
 *
 * @author Un pendejo
 */
public class App {

    public static void main(String[] args) {
           capturarLasCalificacionesDelEstudiante("Tus calificaciones fueron");



    }
    public static void capturarLasCalificacionesDelEstudiante(String mensaje) {
        Scanner captu = new Scanner(System.in);
        int calificacion, sumaCali = 0;
        int numEstudiantes;
        System.out.println("Ingresa la cantidad de estudiantes");
        numEstudiantes = captu.nextInt();
        for(int i = 1; i<= numEstudiantes; i++){
            System.out.println("ESTUDIANTE # " + i);
            System.out.println("Ingrese la calificacion del estudiante");
        calificacion = captu.nextInt();
         
         
        }   
        double promedio = sumaCali / numEstudiantes;        
        System.out.println("El Promedio fue de :" + promedio);
        
}
   
     public static void capturaPromedio(String mensaje){
         System.out.println(mensaje);
        
          
    
    
    }
    
    
    
    
    }
    




    




/*int califa, sumaCali;
        Scanner captu = new Scanner(System.in);
        //inicializar el acumulador
        sumaCali = 0;
        for(int i = 1; i <= 10; i++){
        System.out.println("Estudiante # "+ i);
        System.out.println("Cual es tu calificacion");
        califa = captu.nextInt();
        captu.nextLine();
        //acumular las calificaciones
        sumaCali = sumaCali + califa;
    }
        //CALCULAR EL PROMEDIO:
        //DIVISIONES EN JAVA --> SI DIVIDIMOS ENTEROS
        double promedio = sumaCali / 10.0;
        System.out.println("promedio ="+ promedio);
        //double promedio = sumaCali / 10.0;
      //  System.out.println("promedio ="+ promedio);*/