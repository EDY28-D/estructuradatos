/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Semana11;
import java.util.Scanner;
public class eje{
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
         System.out.println("Cuantos numeros quiere ingresar?");
        int arr[] = new int[sc.nextInt()];

        System.out.println("Cargar los Valores :");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
       System.out.println("La suma del arreglo es:"+sumarValores(arr, arr.length - 1));
         }
      public static int sumarValores(int array[], int posArray) {
        // INICIALIZAMOS UNA VARIABLE CON LA POSICIÓN DEL ARRAY ((NO ES NECESARIO)) 
        int tam = posArray;
        int rta;
        /* COMPROBAMOS QUE ÉL TAMAÑO DEL NO SEA CERO, YA QUE SI EL TAMAÑO
        ES CERO INTENTARÁ EN LA SIGUIENTE LLAMADA ENTRAR EN LA POSICIÓN -1
        DEL ARRAY DANDO UN ERROR */
        if (tam == 0) {
            return array[tam];
        } else {
            /* SI EL TAMAÑO NO ES IGUAL A CERO, AÑADIMOS AL RESULTADO
            LA SUMA DEL VALOR PASADO POR PARÁMETRO MÁS EL VALOR DE LA 
            POSICIÓN ANTERIOR */
            rta = (array[tam]) + sumarValores(array, tam - 1);
        }
                return rta;
         } 
}
   

