//*******************************
//@author: Robbin Woods 15201
//@version: 1.0
//Hoja de Trabajo 3
//Sort: metodos de ordenamiento
//*******************************

import java.lang.*;
import java.util.*;

public class Sort implements Comparable{
	private int miLista[];

	public void Sort(){
		llenarLista();
		/*if (i==0)
			selectionSort();
		else if(i==1)
			insertionSort();
		else if(i==2)
			mergeSort();
		else if(i==3)
			quickSort();
		else if(i==4)
			radixSort();
		else
			exit();*/
	}

	//pre: miLista existe
	//post: llena miLista con 
	//numeros aleatorios
	public void llenarLista(){
		int numero;
		miLista=new int[3000];
		for(int i=0;i<3000;i++){
			miLista[i]=(int)(Math.random()*3000+10);
		}
	}

	public int compareTo(Object other){
		if ()
			return -1;
		else if ()
			return 1;
		else 
			return 0;	
	}

}
