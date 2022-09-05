/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.kernivel.vector_04;
//Importamos libreria para lectura de datos por teclado
import java.util.Scanner;
/**
 *
 * @author Roberto Calero
 */
    /*
    Realice un programa que permita dimensionar un vector por teclado, lo llene con
    valores enteros aleatorios, al final, realice el cálculo de la suma y la media
    aritmética de todos los elementos del vector.
    */
public class Vector_04 {

    public static void main(String[] args) {
        
        //Creamos una variable de lectura de datos por teclado
        Scanner temp = new Scanner(System.in);
        //Creamos las variables para la resolucion
        //Suma sera nuestro acumulador, todo acumulador debe inicializarce
        //Dimension sera la longitud/tamaño del vector
        int suma = 0, dimension;
        //Creamos una variable double para realizar la media
        //Recomendacion toda variable que resulte de una division debe ser double
        Double media;
        //texto de indicaciones
        System.out.println("Ingrese dimension del vector");
        //Llenamos la variable dimension
        dimension = temp.nextInt();
        
        //Creamos el vector tipo entero donde se almacenaran las longitudes de las palabras
        //La longitud/tamaño/cantidad del vector sera de la variable dimension
        int longitudes [] = new int [dimension];
        
        for(int x = 0 ; x < dimension ; x++){
            //Llenamos la posicion x del vector con un numero aleatorio
            //Math.random es una funcionalidad de java que da numeros aleatorios ente 0.0 y 1
            //El 10 determina el valor maximo del numero random y 1 determina la cantidad minima del raondom
            // (int) esto comvierte los valores random en enteros, recordemos que los valores random obtenidos son double
            longitudes [x] = (int)(Math.random() * 100) + 1;
            //Realizamos la suma de los valores ingresados
            //Recordemos que para realizar acumulaciones es necesario que la variable este inicializada en por defecto se inicia en cero
            suma = suma + longitudes [x];
            //Imprimimos el valor random en la posicion x del vector
            //Esto se puede hacer en un for aparte, pero al igual que la suma podemos hacerlo directamente ya que el valor esta gurdado en la line
            // de codigo anterior
            System.out.println(longitudes [x]);
        }
        //Imprimimos la suma
        System.out.println("La suma es: "+suma);
        //Realizamos la media
        //Utilizamos (double) antes de la operacion para decirle al programa que los siguites valores son double
        //Esto se hace porque suma y dimensio son int y evitar el problema de tipo de datos no compatibles
        media = (double) (suma / dimension);
        //Imprimimos la media
        System.out.println("La media es: "+media);
    }
}
