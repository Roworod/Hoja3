/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sorts;

/**
 *
 * @author GerardoEnrique
 */


public class Insertion {

    Comparable[] array;

    public static void SelectionSort (Comparable[] lista)
   {
      int min;
      Comparable temp;

      for (int i = 0; i <lista.length-1; i++)
      {
         min = i;
         for (int j = i + 1; j < lista.length; j++)
            if (lista[j].compareTo(lista[min]) < 0)
                min = j;

         // Intercambiar los valores
         temp = lista [min];
         lista[min] = lista[i];
         lista[i] = temp;
      }
}
